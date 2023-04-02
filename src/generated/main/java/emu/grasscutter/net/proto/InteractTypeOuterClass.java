// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InteractType.proto

package emu.grasscutter.net.proto;

public final class InteractTypeOuterClass {
  private InteractTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * Name: CHKGDGODKAA
   * </pre>
   *
   * Protobuf enum {@code InteractType}
   */
  public enum InteractType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INTERACT_TYPE_NONE = 0;</code>
     */
    INTERACT_TYPE_NONE(0),
    /**
     * <code>INTERACT_TYPE_PICK_ITEM = 1;</code>
     */
    INTERACT_TYPE_PICK_ITEM(1),
    /**
     * <code>INTERACT_TYPE_GATHER = 2;</code>
     */
    INTERACT_TYPE_GATHER(2),
    /**
     * <code>INTERACT_TYPE_OPEN_CHEST = 3;</code>
     */
    INTERACT_TYPE_OPEN_CHEST(3),
    /**
     * <code>INTERACT_TYPE_OPEN_STATUE = 4;</code>
     */
    INTERACT_TYPE_OPEN_STATUE(4),
    /**
     * <code>INTERACT_TYPE_CONSUM = 5;</code>
     */
    INTERACT_TYPE_CONSUM(5),
    /**
     * <code>INTERACT_TYPE_MP_PLAY_REWARD = 6;</code>
     */
    INTERACT_TYPE_MP_PLAY_REWARD(6),
    /**
     * <code>INTERACT_TYPE_VIEW = 7;</code>
     */
    INTERACT_TYPE_VIEW(7),
    /**
     * <code>INTERACT_TYPE_GENERAL_REWARD = 8;</code>
     */
    INTERACT_TYPE_GENERAL_REWARD(8),
    /**
     * <code>INTERACT_TYPE_MIRACLE_RING = 9;</code>
     */
    INTERACT_TYPE_MIRACLE_RING(9),
    /**
     * <code>INTERACT_TYPE_FOUNDATION = 10;</code>
     */
    INTERACT_TYPE_FOUNDATION(10),
    /**
     * <code>INTERACT_TYPE_ECHO_SHELL = 11;</code>
     */
    INTERACT_TYPE_ECHO_SHELL(11),
    /**
     * <code>INTERACT_TYPE_HOME_GATHER = 12;</code>
     */
    INTERACT_TYPE_HOME_GATHER(12),
    /**
     * <code>INTERACT_TYPE_ENV_ANIMAL = 13;</code>
     */
    INTERACT_TYPE_ENV_ANIMAL(13),
    /**
     * <code>INTERACT_TYPE_QUEST_GADGET = 14;</code>
     */
    INTERACT_TYPE_QUEST_GADGET(14),
    /**
     * <code>INTERACT_TYPE_UI_INTERACT = 15;</code>
     */
    INTERACT_TYPE_UI_INTERACT(15),
    /**
     * <code>INTERACT_TYPE_DESHRET_OBELISK = 16;</code>
     */
    INTERACT_TYPE_DESHRET_OBELISK(16),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INTERACT_TYPE_NONE = 0;</code>
     */
    public static final int INTERACT_TYPE_NONE_VALUE = 0;
    /**
     * <code>INTERACT_TYPE_PICK_ITEM = 1;</code>
     */
    public static final int INTERACT_TYPE_PICK_ITEM_VALUE = 1;
    /**
     * <code>INTERACT_TYPE_GATHER = 2;</code>
     */
    public static final int INTERACT_TYPE_GATHER_VALUE = 2;
    /**
     * <code>INTERACT_TYPE_OPEN_CHEST = 3;</code>
     */
    public static final int INTERACT_TYPE_OPEN_CHEST_VALUE = 3;
    /**
     * <code>INTERACT_TYPE_OPEN_STATUE = 4;</code>
     */
    public static final int INTERACT_TYPE_OPEN_STATUE_VALUE = 4;
    /**
     * <code>INTERACT_TYPE_CONSUM = 5;</code>
     */
    public static final int INTERACT_TYPE_CONSUM_VALUE = 5;
    /**
     * <code>INTERACT_TYPE_MP_PLAY_REWARD = 6;</code>
     */
    public static final int INTERACT_TYPE_MP_PLAY_REWARD_VALUE = 6;
    /**
     * <code>INTERACT_TYPE_VIEW = 7;</code>
     */
    public static final int INTERACT_TYPE_VIEW_VALUE = 7;
    /**
     * <code>INTERACT_TYPE_GENERAL_REWARD = 8;</code>
     */
    public static final int INTERACT_TYPE_GENERAL_REWARD_VALUE = 8;
    /**
     * <code>INTERACT_TYPE_MIRACLE_RING = 9;</code>
     */
    public static final int INTERACT_TYPE_MIRACLE_RING_VALUE = 9;
    /**
     * <code>INTERACT_TYPE_FOUNDATION = 10;</code>
     */
    public static final int INTERACT_TYPE_FOUNDATION_VALUE = 10;
    /**
     * <code>INTERACT_TYPE_ECHO_SHELL = 11;</code>
     */
    public static final int INTERACT_TYPE_ECHO_SHELL_VALUE = 11;
    /**
     * <code>INTERACT_TYPE_HOME_GATHER = 12;</code>
     */
    public static final int INTERACT_TYPE_HOME_GATHER_VALUE = 12;
    /**
     * <code>INTERACT_TYPE_ENV_ANIMAL = 13;</code>
     */
    public static final int INTERACT_TYPE_ENV_ANIMAL_VALUE = 13;
    /**
     * <code>INTERACT_TYPE_QUEST_GADGET = 14;</code>
     */
    public static final int INTERACT_TYPE_QUEST_GADGET_VALUE = 14;
    /**
     * <code>INTERACT_TYPE_UI_INTERACT = 15;</code>
     */
    public static final int INTERACT_TYPE_UI_INTERACT_VALUE = 15;
    /**
     * <code>INTERACT_TYPE_DESHRET_OBELISK = 16;</code>
     */
    public static final int INTERACT_TYPE_DESHRET_OBELISK_VALUE = 16;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static InteractType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InteractType forNumber(int value) {
      switch (value) {
        case 0: return INTERACT_TYPE_NONE;
        case 1: return INTERACT_TYPE_PICK_ITEM;
        case 2: return INTERACT_TYPE_GATHER;
        case 3: return INTERACT_TYPE_OPEN_CHEST;
        case 4: return INTERACT_TYPE_OPEN_STATUE;
        case 5: return INTERACT_TYPE_CONSUM;
        case 6: return INTERACT_TYPE_MP_PLAY_REWARD;
        case 7: return INTERACT_TYPE_VIEW;
        case 8: return INTERACT_TYPE_GENERAL_REWARD;
        case 9: return INTERACT_TYPE_MIRACLE_RING;
        case 10: return INTERACT_TYPE_FOUNDATION;
        case 11: return INTERACT_TYPE_ECHO_SHELL;
        case 12: return INTERACT_TYPE_HOME_GATHER;
        case 13: return INTERACT_TYPE_ENV_ANIMAL;
        case 14: return INTERACT_TYPE_QUEST_GADGET;
        case 15: return INTERACT_TYPE_UI_INTERACT;
        case 16: return INTERACT_TYPE_DESHRET_OBELISK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InteractType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InteractType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InteractType>() {
            public InteractType findValueByNumber(int number) {
              return InteractType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.InteractTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final InteractType[] VALUES = values();

    public static InteractType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private InteractType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:InteractType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022InteractType.proto*\213\004\n\014InteractType\022\026\n" +
      "\022INTERACT_TYPE_NONE\020\000\022\033\n\027INTERACT_TYPE_P" +
      "ICK_ITEM\020\001\022\030\n\024INTERACT_TYPE_GATHER\020\002\022\034\n\030" +
      "INTERACT_TYPE_OPEN_CHEST\020\003\022\035\n\031INTERACT_T" +
      "YPE_OPEN_STATUE\020\004\022\030\n\024INTERACT_TYPE_CONSU" +
      "M\020\005\022 \n\034INTERACT_TYPE_MP_PLAY_REWARD\020\006\022\026\n" +
      "\022INTERACT_TYPE_VIEW\020\007\022 \n\034INTERACT_TYPE_G" +
      "ENERAL_REWARD\020\010\022\036\n\032INTERACT_TYPE_MIRACLE" +
      "_RING\020\t\022\034\n\030INTERACT_TYPE_FOUNDATION\020\n\022\034\n" +
      "\030INTERACT_TYPE_ECHO_SHELL\020\013\022\035\n\031INTERACT_" +
      "TYPE_HOME_GATHER\020\014\022\034\n\030INTERACT_TYPE_ENV_" +
      "ANIMAL\020\r\022\036\n\032INTERACT_TYPE_QUEST_GADGET\020\016" +
      "\022\035\n\031INTERACT_TYPE_UI_INTERACT\020\017\022!\n\035INTER" +
      "ACT_TYPE_DESHRET_OBELISK\020\020B\033\n\031emu.grassc" +
      "utter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
