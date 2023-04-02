package emu.grasscutter.game.props.ItemUseAction;

import emu.grasscutter.game.props.ItemUseOp;

public class ItemUseUnlockGcgCard extends ItemUseInt {
    private int count = 0;

    @Override
    public ItemUseOp getItemUseOp() {
        return ItemUseOp.ITEM_USE_GAIN_GCG_CARD;
    }

    public ItemUseUnlockGcgCard(String[] useParam) {
        super(useParam);
    }

    @Override
    public boolean useItem(UseItemParams params) {
		return params.player.getGcgManager().gainCard(this.i); //this returns false if card not in data map
    }
}
