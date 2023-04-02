// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGClientPerformType.proto

package emu.grasscutter.net.proto;

public final class GCGClientPerformTypeOuterClass {
  private GCGClientPerformTypeOuterClass() {}
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
   * Name: IEGIJKAPDFN
   * </pre>
   *
   * Protobuf enum {@code GCGClientPerformType}
   */
  public enum GCGClientPerformType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_INVALID = 0;</code>
     */
    GCG_CLIENT_PERFORM_TYPE_INVALID(0),
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_CARD_EXCHANGE = 1;</code>
     */
    GCG_CLIENT_PERFORM_TYPE_CARD_EXCHANGE(1),
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_FIRST_HAND = 2;</code>
     */
    GCG_CLIENT_PERFORM_TYPE_FIRST_HAND(2),
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_REROLL = 3;</code>
     */
    GCG_CLIENT_PERFORM_TYPE_REROLL(3),
    /**
     * <pre>
     *snooobfs
     * </pre>
     *
     * <code>GCG_CLIENT_PERFORM_TYPE_PMECCJLHICF = 4;</code>
     */
    GCG_CLIENT_PERFORM_TYPE_PMECCJLHICF(4),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_INVALID = 0;</code>
     */
    public static final int GCG_CLIENT_PERFORM_TYPE_INVALID_VALUE = 0;
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_CARD_EXCHANGE = 1;</code>
     */
    public static final int GCG_CLIENT_PERFORM_TYPE_CARD_EXCHANGE_VALUE = 1;
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_FIRST_HAND = 2;</code>
     */
    public static final int GCG_CLIENT_PERFORM_TYPE_FIRST_HAND_VALUE = 2;
    /**
     * <code>GCG_CLIENT_PERFORM_TYPE_REROLL = 3;</code>
     */
    public static final int GCG_CLIENT_PERFORM_TYPE_REROLL_VALUE = 3;
    /**
     * <pre>
     *snooobfs
     * </pre>
     *
     * <code>GCG_CLIENT_PERFORM_TYPE_PMECCJLHICF = 4;</code>
     */
    public static final int GCG_CLIENT_PERFORM_TYPE_PMECCJLHICF_VALUE = 4;


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
    public static GCGClientPerformType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GCGClientPerformType forNumber(int value) {
      switch (value) {
        case 0: return GCG_CLIENT_PERFORM_TYPE_INVALID;
        case 1: return GCG_CLIENT_PERFORM_TYPE_CARD_EXCHANGE;
        case 2: return GCG_CLIENT_PERFORM_TYPE_FIRST_HAND;
        case 3: return GCG_CLIENT_PERFORM_TYPE_REROLL;
        case 4: return GCG_CLIENT_PERFORM_TYPE_PMECCJLHICF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GCGClientPerformType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        GCGClientPerformType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<GCGClientPerformType>() {
            public GCGClientPerformType findValueByNumber(int number) {
              return GCGClientPerformType.forNumber(number);
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
      return emu.grasscutter.net.proto.GCGClientPerformTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final GCGClientPerformType[] VALUES = values();

    public static GCGClientPerformType valueOf(
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

    private GCGClientPerformType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:GCGClientPerformType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032GCGClientPerformType.proto*\333\001\n\024GCGClie" +
      "ntPerformType\022#\n\037GCG_CLIENT_PERFORM_TYPE" +
      "_INVALID\020\000\022)\n%GCG_CLIENT_PERFORM_TYPE_CA" +
      "RD_EXCHANGE\020\001\022&\n\"GCG_CLIENT_PERFORM_TYPE" +
      "_FIRST_HAND\020\002\022\"\n\036GCG_CLIENT_PERFORM_TYPE" +
      "_REROLL\020\003\022\'\n#GCG_CLIENT_PERFORM_TYPE_PME" +
      "CCJLHICF\020\004B\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
