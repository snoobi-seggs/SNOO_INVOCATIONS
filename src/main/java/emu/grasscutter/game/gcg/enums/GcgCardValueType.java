package emu.grasscutter.game.gcg.enums;

import java.util.*;
import java.util.stream.Stream;
import static java.util.Map.entry;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

//char elementType
public enum GcgCardValueType {
	GCG_CARD_VALUE_NONE(0),
	GCG_CARD_VALUE_MAX_HP(1),
	GCG_CARD_VALUE_CUR_HP(2),
	GCG_CARD_VALUE_MAX_ENERGY(3),
	GCG_CARD_VALUE_CUR_ENERGY(4),
	GCG_CARD_VALUE_USE_TIMES(5);
	
	private final int id;
	private static final Int2ObjectMap<GcgCardValueType> map = new Int2ObjectOpenHashMap<>();
	private static final Map<String, GcgCardValueType> stringMap = new HashMap<>();
	
	static {
		Stream.of(values()).forEach(e -> {
			map.put(e.getId(), e);
			stringMap.put(e.name(), e);
		});
	}
	
	private GcgCardValueType(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public static GcgCardValueType getTypeById(int id) {
		return map.getOrDefault(id, GCG_CARD_VALUE_NONE);
	}
	
	public static GcgCardValueType getTypeByName(String name) {
		return stringMap.getOrDefault(name, GCG_CARD_VALUE_NONE);
	}
}