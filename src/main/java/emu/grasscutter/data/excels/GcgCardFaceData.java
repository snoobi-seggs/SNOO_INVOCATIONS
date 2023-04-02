package emu.grasscutter.data.excels;

import com.google.gson.annotations.SerializedName;

import emu.grasscutter.Grasscutter;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
@ResourceType(name = {"GCGCardFaceExcelConfigData.json"})
public class GcgCardFaceData extends GameResource {
	
	//@SerializedName(value = "id", alternate = {"id"})
    int id;
	//@SerializedName(value = "itemId", alternate = {"itemId"})
	int itemId;
	@SerializedName(value = "charId", alternate = {"KFDMIAPDCEG","BAHNBAOENOB","LCONEMCLIOA"})
	int charId;
	@SerializedName(value = "cardFaceType", alternate = {"KHLLLEIAKED","JLCPJOOCJAC","PHGIDJKDECA"})
	String cardFaceType;
	@SerializedName(value = "shitId", alternate = {"LCEEIGFHEJC","OCCOFKOKCHH","HGBBMHLNELB"})
	int shitId;
	
	
    @Override
    public int getId() {
        return id;
    }
}
