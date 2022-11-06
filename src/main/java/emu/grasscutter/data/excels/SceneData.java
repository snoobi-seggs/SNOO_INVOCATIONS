package emu.grasscutter.data.excels;

import emu.grasscutter.data.GameData;
import emu.grasscutter.data.GameResource;
import emu.grasscutter.data.ResourceType;

import emu.grasscutter.game.props.SceneType;

import java.util.List;
import lombok.Getter;

@ResourceType(name = "SceneExcelConfigData.json")
public class SceneData extends GameResource {
	private int id;
	private SceneType type;
	private String scriptData;
	@Getter private String levelEntityConfig;
	@Getter private List<Integer> specifiedAvatarList;

	@Override
	public int getId() {
		return this.id;
	}

	public SceneType getSceneType() {
		return type;
	}

	public String getScriptData() {
		return scriptData;
	}

	@Override
	public void onLoad() {

	}
}
