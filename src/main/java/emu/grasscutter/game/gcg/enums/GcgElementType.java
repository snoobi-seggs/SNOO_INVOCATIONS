package emu.grasscutter.game.gcg.enums;

import java.util.*;
import java.util.stream.Stream;
import static java.util.Map.entry;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

//char elementType
public enum GcgElementType {
	GCG_ELEMENT_PHYSIC(0),
	GCG_ELEMENT_CRYO(1),
	GCG_ELEMENT_HYDRO(2),
	GCG_ELEMENT_PYRO(3),
	GCG_ELEMENT_ELECTRO(4),
	GCG_ELEMENT_GEO(5),
	GCG_ELEMENT_DENDRO(6),
	GCG_ELEMENT_ANEMO(7),
	GCG_ELEMENT_PAIMON(8);
	
	private final int id;
	private static final Int2ObjectMap<GcgElementType> map = new Int2ObjectOpenHashMap<>();
	private static final Map<String, GcgElementType> stringMap = new HashMap<>();
	
	static {
		Stream.of(values()).forEach(e -> {
			map.put(e.getId(), e);
			stringMap.put(e.name(), e);
		});
	}
	
	private GcgElementType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public static GcgElementType getTypeById(int id) {
		return map.getOrDefault(id, GCG_ELEMENT_PHYSIC);
	}
	
	public static GcgElementType getTypeByName(String name) {
		return stringMap.getOrDefault(name, GCG_ELEMENT_PHYSIC);
	}
}