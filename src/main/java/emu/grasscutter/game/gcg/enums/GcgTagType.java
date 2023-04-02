package emu.grasscutter.game.gcg.enums;

import java.util.*;
import java.util.stream.Stream;
import static java.util.Map.entry;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

//purely frm sniffs
public enum GcgTagType {
	GCG_TAG_NONE(0),
	GCG_TAG_FOOD(101),
	GCG_TAG_WEAPON_NONE(200),		//WRONG MAYBE
	GCG_TAG_WEAPON_SWORD(201),
	GCG_TAG_WEAPON_CATALYST(202),
	GCG_TAG_WEAPON_CLAYMORE(203),
	GCG_TAG_WEAPON_BOW(204),
	GCG_TAG_WEAPON_POLE(205),
	GCG_TAG_ELEMENT_NONE(300),		//WRONG MAYBE
	GCG_TAG_ELEMENT_CRYO(301),
	GCG_TAG_ELEMENT_HYDRO(302),
	GCG_TAG_ELEMENT_PYRO(303),
	GCG_TAG_ELEMENT_ELECTRO(304),
	GCG_TAG_ELEMENT_GEO(305),
	GCG_TAG_ELEMENT_DENDRO(306),
	GCG_TAG_ELEMENT_ANEMO(307),		//verified orderby gcgdicesidetype
	GCG_TAG_ELEMENT_SAME(308),		//verified orderby gcgdicesidetype
	GCG_TAG_ELEMENT_VOID(309),		//verified orderby gcgdicesidetype
	GCG_TAG_ELEMENT_ENERGY(310),	//verified orderby gcgdicesidetype
	GCG_TAG_NATION_NONE(400),		//THIS NEVER HAPPENS
	GCG_TAG_NATION_MONSTADT(401),
	GCG_TAG_NATION_LIYUE(402),
	GCG_TAG_NATION_INAZUMA(403),
	GCG_TAG_NATION_SUMERU(404),
	//MISSING CAMP type
	UNKNOWN(9999);
	
	private final int id;
	private static final Int2ObjectMap<GcgTagType> map = new Int2ObjectOpenHashMap<>();
	private static final Map<String, GcgTagType> stringMap = new HashMap<>();
	
	static {
		Stream.of(values()).forEach(e -> {
			map.put(e.getId(), e);
			stringMap.put(e.name(), e);
		});
	}
	
	private GcgTagType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public static GcgTagType getTypeByid(int id) {
		return map.getOrDefault(id, GCG_TAG_NONE);
	}
	
	public static GcgTagType getTypeByName(String name) {
		return stringMap.getOrDefault(name, GCG_TAG_NONE);
	}
}