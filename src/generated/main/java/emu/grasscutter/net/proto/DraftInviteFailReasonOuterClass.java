// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftInviteFailReason.proto

package emu.grasscutter.net.proto;

public final class DraftInviteFailReasonOuterClass {
  private DraftInviteFailReasonOuterClass() {}
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
   * Name: CGJEFNPEPCF
   * </pre>
   *
   * Protobuf enum {@code DraftInviteFailReason}
   */
  public enum DraftInviteFailReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DRAFT_FAIL_UNKNOWN = 0;</code>
     */
    DRAFT_FAIL_UNKNOWN(0),
    /**
     * <code>DRAFT_ACTIVITY_NOT_OPEN = 1;</code>
     */
    DRAFT_ACTIVITY_NOT_OPEN(1),
    /**
     * <code>DRAFT_ACTIVITY_PLAY_NOT_OPEN = 2;</code>
     */
    DRAFT_ACTIVITY_PLAY_NOT_OPEN(2),
    /**
     * <code>DRAFT_SCENE_NOT_MEET = 3;</code>
     */
    DRAFT_SCENE_NOT_MEET(3),
    /**
     * <code>DRAFT_WORLD_NOT_MEET = 4;</code>
     */
    DRAFT_WORLD_NOT_MEET(4),
    /**
     * <code>DRAFT_PLAY_LIMIT_NOT_MEET = 5;</code>
     */
    DRAFT_PLAY_LIMIT_NOT_MEET(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>DRAFT_FAIL_UNKNOWN = 0;</code>
     */
    public static final int DRAFT_FAIL_UNKNOWN_VALUE = 0;
    /**
     * <code>DRAFT_ACTIVITY_NOT_OPEN = 1;</code>
     */
    public static final int DRAFT_ACTIVITY_NOT_OPEN_VALUE = 1;
    /**
     * <code>DRAFT_ACTIVITY_PLAY_NOT_OPEN = 2;</code>
     */
    public static final int DRAFT_ACTIVITY_PLAY_NOT_OPEN_VALUE = 2;
    /**
     * <code>DRAFT_SCENE_NOT_MEET = 3;</code>
     */
    public static final int DRAFT_SCENE_NOT_MEET_VALUE = 3;
    /**
     * <code>DRAFT_WORLD_NOT_MEET = 4;</code>
     */
    public static final int DRAFT_WORLD_NOT_MEET_VALUE = 4;
    /**
     * <code>DRAFT_PLAY_LIMIT_NOT_MEET = 5;</code>
     */
    public static final int DRAFT_PLAY_LIMIT_NOT_MEET_VALUE = 5;


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
    public static DraftInviteFailReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DraftInviteFailReason forNumber(int value) {
      switch (value) {
        case 0: return DRAFT_FAIL_UNKNOWN;
        case 1: return DRAFT_ACTIVITY_NOT_OPEN;
        case 2: return DRAFT_ACTIVITY_PLAY_NOT_OPEN;
        case 3: return DRAFT_SCENE_NOT_MEET;
        case 4: return DRAFT_WORLD_NOT_MEET;
        case 5: return DRAFT_PLAY_LIMIT_NOT_MEET;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DraftInviteFailReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DraftInviteFailReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DraftInviteFailReason>() {
            public DraftInviteFailReason findValueByNumber(int number) {
              return DraftInviteFailReason.forNumber(number);
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
      return emu.grasscutter.net.proto.DraftInviteFailReasonOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final DraftInviteFailReason[] VALUES = values();

    public static DraftInviteFailReason valueOf(
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

    private DraftInviteFailReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:DraftInviteFailReason)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033DraftInviteFailReason.proto*\301\001\n\025DraftI" +
      "nviteFailReason\022\026\n\022DRAFT_FAIL_UNKNOWN\020\000\022" +
      "\033\n\027DRAFT_ACTIVITY_NOT_OPEN\020\001\022 \n\034DRAFT_AC" +
      "TIVITY_PLAY_NOT_OPEN\020\002\022\030\n\024DRAFT_SCENE_NO" +
      "T_MEET\020\003\022\030\n\024DRAFT_WORLD_NOT_MEET\020\004\022\035\n\031DR" +
      "AFT_PLAY_LIMIT_NOT_MEET\020\005B\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
