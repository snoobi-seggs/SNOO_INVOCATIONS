package emu.grasscutter.game.gcg.enums;

import java.util.*;
import java.util.stream.Stream;
import static java.util.Map.entry;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

//purely frm sniffs
public enum GcgTokenType {
	NONE(0),
	CUR_HP(1),
	MAX_HP(2),
	CUR_ELEM_ENERGY(4),
	MAX_ELEM_ENERGY(5),
	USAGES_ICON_HOURGLASS(8),
	CRYO_AURA(9),
	HYDRO_AURA(10),
	PYRO_AURA(11),
	ELECTRO_AURA(12),
	GEO_AURA(13),
	DENDRO_AURA(14),
	ANEMO_AURA(15),
	UNKNOWN(9999);
	
	private final int id;
	private static final Int2ObjectMap<GcgTokenType> map = new Int2ObjectOpenHashMap<>();
	private static final Map<String, GcgTokenType> stringMap = new HashMap<>();
	
	private static final Map<Integer,GcgTokenType> elementToTokenMap = Map.ofEntries(
																			entry(0,NONE),
																			entry(1,CRYO_AURA),
																			entry(2,HYDRO_AURA),
																			entry(3,PYRO_AURA),
																			entry(4,ELECTRO_AURA),
																			entry(5,GEO_AURA),
																			entry(6,DENDRO_AURA),
																			entry(7,ANEMO_AURA)
																		);
																		
	private static final Map<String,GcgTokenType> elementNameToTokenMap = Map.ofEntries(
																			entry("GCG_ELEMENT_PHYSIC", NONE),	//this shldnt exist
																			entry("GCG_ELEMENT_CRYO",CRYO_AURA),
																			entry("GCG_ELEMENT_HYDRO",HYDRO_AURA),
																			entry("GCG_ELEMENT_PYRO",PYRO_AURA),
																			entry("GCG_ELEMENT_ELECTRO",ELECTRO_AURA),
																			entry("GCG_ELEMENT_GEO",GEO_AURA),
																			entry("GCG_ELEMENT_DENDRO",DENDRO_AURA),
																			entry("GCG_ELEMENT_ANEMO",ANEMO_AURA)
																		);
																		
	
	static {
		Stream.of(values()).forEach(e -> {
			map.put(e.getId(), e);
			stringMap.put(e.name(), e);
		});
	}
	
	private GcgTokenType(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
	
	public static int getTokenTypeFromElementType(int id) {
		return elementToTokenMap.get(id).getId();
	}
	
	public static int getTokenTypeFromElementType(String elementName) {
		return elementNameToTokenMap.get(elementName).getId();
	}
	
	public static GcgTokenType getTypeByid(int id) {
		return map.getOrDefault(id, NONE);
	}
	
	public static GcgTokenType getTypeByName(String name) {
		return stringMap.getOrDefault(name, NONE);
	}
}