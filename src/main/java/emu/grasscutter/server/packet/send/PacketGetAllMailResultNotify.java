package emu.grasscutter.server.packet.send;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.game.mail.Mail;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.EquipParamOuterClass;
import emu.grasscutter.net.proto.GetAllMailResultNotifyOuterClass.GetAllMailResultNotify;
import emu.grasscutter.net.proto.ItemParamOuterClass;
import emu.grasscutter.net.proto.MailCollectStateOuterClass.MailCollectState;
import emu.grasscutter.net.proto.MailDataOuterClass;
import emu.grasscutter.net.proto.MailDataOuterClass.MailData;
import emu.grasscutter.net.proto.MailItemOuterClass;
import emu.grasscutter.net.proto.MailTextContentOuterClass.MailTextContent;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class PacketGetAllMailResultNotify extends BasePacket {

    public PacketGetAllMailResultNotify(Player player, boolean isCollected) {
        super(PacketOpcodes.GetAllMailResultNotify);
        GetAllMailResultNotify.Builder proto = GetAllMailResultNotify.newBuilder();
		
		if (player.getAllMail().size() != 0) { // Make sure the player has mail
            List<MailData> mailDataList = new ArrayList<MailData>();

            for (Mail message : player.getAllMail()) {
                if (message.stateValue == 1) { // Make sure it isn't a gift
                    if (message.expireTime > (int) Instant.now().getEpochSecond()) { // Make sure the message isn't expired (The game won't show expired mail, but I don't want to send unnecessary information).
                        if (mailDataList.size() <= 1000) { // Make sure that there isn't over 1000 messages in the mailbox. (idk what will happen if there is but the game probably won't like it.)
                            MailTextContent.Builder mailTextContent = MailTextContent.newBuilder();
                            mailTextContent.setTitle(message.mailContent.title);
                            mailTextContent.setContent(message.mailContent.content);
                            mailTextContent.setSender(message.mailContent.sender);

                            List<MailItemOuterClass.MailItem> mailItems = new ArrayList<>();

                            for (Mail.MailItem item : message.itemList) {
                                MailItemOuterClass.MailItem.Builder mailItem = MailItemOuterClass.MailItem.newBuilder();
                                EquipParamOuterClass.EquipParam.Builder itemParam = EquipParamOuterClass.EquipParam.newBuilder();
                                itemParam.setItemId(item.itemId);
                                itemParam.setItemNum(item.itemCount);
                                mailItem.setEquipParam(itemParam.build());

                                mailItems.add(mailItem.build());
                            }

                            MailDataOuterClass.MailData.Builder mailData = MailDataOuterClass.MailData.newBuilder();
                            mailData.setMailId(player.getMailId(message));
                            mailData.setMailTextContent(mailTextContent.build());
                            mailData.addAllItemList(mailItems);
                            mailData.setSendTime((int) message.sendTime);
                            mailData.setExpireTime((int) message.expireTime);
                            mailData.setImportance(message.importance);
                            mailData.setIsRead(message.isRead);
                            mailData.setIsAttachmentGot(message.isAttachmentGot);
                            mailData.setCollectState(MailCollectState.forNumber(2));	//MAIL_COLLECT_STATE_COLLECTIBLE_UNCOLLECTED
                            //mailData.setCollectState(MailCollectState.forNumber(1));	//this is not_collectable

                            mailDataList.add(mailData.build());
                        }
                    }
                }
            }

			proto.addAllMailList(mailDataList);
		
			//proto.setIsCollected(isCollected);
			proto.setPageIndex(1);
			proto.setRetcode(0);
			proto.setTotalPageCount(1);
			
			String endToken = isCollected ? "-111049" : "-111050"; //totoally not hardcoded sniff
			proto.setTransaction(player.getUid() + "-" + (int) (System.currentTimeMillis() / 1000) + endToken); 
			
		}
        this.setData(proto.build());
    }
}
