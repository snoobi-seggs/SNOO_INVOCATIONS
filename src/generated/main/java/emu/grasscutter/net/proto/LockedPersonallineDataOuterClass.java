// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: LockedPersonallineData.proto

package emu.grasscutter.net.proto;

public final class LockedPersonallineDataOuterClass {
  private LockedPersonallineDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LockedPersonallineDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LockedPersonallineData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
     * @return The enum numeric value on the wire for lockReason.
     */
    int getLockReasonValue();
    /**
     * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
     * @return The lockReason.
     */
    emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason getLockReason();

    /**
     * <code>uint32 personal_line_id = 12;</code>
     * @return The personalLineId.
     */
    int getPersonalLineId();

    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return Whether the chapterId field is set.
     */
    boolean hasChapterId();
    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return The chapterId.
     */
    int getChapterId();

    /**
     * <code>uint32 level = 2;</code>
     * @return Whether the level field is set.
     */
    boolean hasLevel();
    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    int getLevel();

    public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.ParamCase getParamCase();
  }
  /**
   * <pre>
   * Name: FCFKAAGEDPK
   * </pre>
   *
   * Protobuf type {@code LockedPersonallineData}
   */
  public static final class LockedPersonallineData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LockedPersonallineData)
      LockedPersonallineDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LockedPersonallineData.newBuilder() to construct.
    private LockedPersonallineData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LockedPersonallineData() {
      lockReason_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new LockedPersonallineData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LockedPersonallineData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              int rawValue = input.readEnum();

              lockReason_ = rawValue;
              break;
            }
            case 16: {
              paramCase_ = 2;
              param_ = input.readUInt32();
              break;
            }
            case 96: {

              personalLineId_ = input.readUInt32();
              break;
            }
            case 112: {
              paramCase_ = 14;
              param_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.class, emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.Builder.class);
    }

    /**
     * <pre>
     * Name: HIKGMNEMNOH
     * </pre>
     *
     * Protobuf enum {@code LockedPersonallineData.LockReason}
     */
    public enum LockReason
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>LOCK_REASON_LEVEL = 0;</code>
       */
      LOCK_REASON_LEVEL(0),
      /**
       * <code>LOCK_REASON_QUEST = 1;</code>
       */
      LOCK_REASON_QUEST(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>LOCK_REASON_LEVEL = 0;</code>
       */
      public static final int LOCK_REASON_LEVEL_VALUE = 0;
      /**
       * <code>LOCK_REASON_QUEST = 1;</code>
       */
      public static final int LOCK_REASON_QUEST_VALUE = 1;


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
      public static LockReason valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static LockReason forNumber(int value) {
        switch (value) {
          case 0: return LOCK_REASON_LEVEL;
          case 1: return LOCK_REASON_QUEST;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<LockReason>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          LockReason> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<LockReason>() {
              public LockReason findValueByNumber(int number) {
                return LockReason.forNumber(number);
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
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.getDescriptor().getEnumTypes().get(0);
      }

      private static final LockReason[] VALUES = values();

      public static LockReason valueOf(
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

      private LockReason(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:LockedPersonallineData.LockReason)
    }

    private int paramCase_ = 0;
    private java.lang.Object param_;
    public enum ParamCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      CHAPTER_ID(14),
      LEVEL(2),
      PARAM_NOT_SET(0);
      private final int value;
      private ParamCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ParamCase valueOf(int value) {
        return forNumber(value);
      }

      public static ParamCase forNumber(int value) {
        switch (value) {
          case 14: return CHAPTER_ID;
          case 2: return LEVEL;
          case 0: return PARAM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ParamCase
    getParamCase() {
      return ParamCase.forNumber(
          paramCase_);
    }

    public static final int LOCK_REASON_FIELD_NUMBER = 1;
    private int lockReason_;
    /**
     * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
     * @return The enum numeric value on the wire for lockReason.
     */
    @java.lang.Override public int getLockReasonValue() {
      return lockReason_;
    }
    /**
     * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
     * @return The lockReason.
     */
    @java.lang.Override public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason getLockReason() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason result = emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason.valueOf(lockReason_);
      return result == null ? emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason.UNRECOGNIZED : result;
    }

    public static final int PERSONAL_LINE_ID_FIELD_NUMBER = 12;
    private int personalLineId_;
    /**
     * <code>uint32 personal_line_id = 12;</code>
     * @return The personalLineId.
     */
    @java.lang.Override
    public int getPersonalLineId() {
      return personalLineId_;
    }

    public static final int CHAPTER_ID_FIELD_NUMBER = 14;
    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return Whether the chapterId field is set.
     */
    @java.lang.Override
    public boolean hasChapterId() {
      return paramCase_ == 14;
    }
    /**
     * <code>uint32 chapter_id = 14;</code>
     * @return The chapterId.
     */
    @java.lang.Override
    public int getChapterId() {
      if (paramCase_ == 14) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    public static final int LEVEL_FIELD_NUMBER = 2;
    /**
     * <code>uint32 level = 2;</code>
     * @return Whether the level field is set.
     */
    @java.lang.Override
    public boolean hasLevel() {
      return paramCase_ == 2;
    }
    /**
     * <code>uint32 level = 2;</code>
     * @return The level.
     */
    @java.lang.Override
    public int getLevel() {
      if (paramCase_ == 2) {
        return (java.lang.Integer) param_;
      }
      return 0;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lockReason_ != emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason.LOCK_REASON_LEVEL.getNumber()) {
        output.writeEnum(1, lockReason_);
      }
      if (paramCase_ == 2) {
        output.writeUInt32(
            2, (int)((java.lang.Integer) param_));
      }
      if (personalLineId_ != 0) {
        output.writeUInt32(12, personalLineId_);
      }
      if (paramCase_ == 14) {
        output.writeUInt32(
            14, (int)((java.lang.Integer) param_));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lockReason_ != emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason.LOCK_REASON_LEVEL.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, lockReason_);
      }
      if (paramCase_ == 2) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              2, (int)((java.lang.Integer) param_));
      }
      if (personalLineId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, personalLineId_);
      }
      if (paramCase_ == 14) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(
              14, (int)((java.lang.Integer) param_));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData other = (emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData) obj;

      if (lockReason_ != other.lockReason_) return false;
      if (getPersonalLineId()
          != other.getPersonalLineId()) return false;
      if (!getParamCase().equals(other.getParamCase())) return false;
      switch (paramCase_) {
        case 14:
          if (getChapterId()
              != other.getChapterId()) return false;
          break;
        case 2:
          if (getLevel()
              != other.getLevel()) return false;
          break;
        case 0:
        default:
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LOCK_REASON_FIELD_NUMBER;
      hash = (53 * hash) + lockReason_;
      hash = (37 * hash) + PERSONAL_LINE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPersonalLineId();
      switch (paramCase_) {
        case 14:
          hash = (37 * hash) + CHAPTER_ID_FIELD_NUMBER;
          hash = (53 * hash) + getChapterId();
          break;
        case 2:
          hash = (37 * hash) + LEVEL_FIELD_NUMBER;
          hash = (53 * hash) + getLevel();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Name: FCFKAAGEDPK
     * </pre>
     *
     * Protobuf type {@code LockedPersonallineData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LockedPersonallineData)
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.class, emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lockReason_ = 0;

        personalLineId_ = 0;

        paramCase_ = 0;
        param_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.internal_static_LockedPersonallineData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData build() {
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData buildPartial() {
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData result = new emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData(this);
        result.lockReason_ = lockReason_;
        result.personalLineId_ = personalLineId_;
        if (paramCase_ == 14) {
          result.param_ = param_;
        }
        if (paramCase_ == 2) {
          result.param_ = param_;
        }
        result.paramCase_ = paramCase_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData) {
          return mergeFrom((emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData other) {
        if (other == emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.getDefaultInstance()) return this;
        if (other.lockReason_ != 0) {
          setLockReasonValue(other.getLockReasonValue());
        }
        if (other.getPersonalLineId() != 0) {
          setPersonalLineId(other.getPersonalLineId());
        }
        switch (other.getParamCase()) {
          case CHAPTER_ID: {
            setChapterId(other.getChapterId());
            break;
          }
          case LEVEL: {
            setLevel(other.getLevel());
            break;
          }
          case PARAM_NOT_SET: {
            break;
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int paramCase_ = 0;
      private java.lang.Object param_;
      public ParamCase
          getParamCase() {
        return ParamCase.forNumber(
            paramCase_);
      }

      public Builder clearParam() {
        paramCase_ = 0;
        param_ = null;
        onChanged();
        return this;
      }


      private int lockReason_ = 0;
      /**
       * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
       * @return The enum numeric value on the wire for lockReason.
       */
      @java.lang.Override public int getLockReasonValue() {
        return lockReason_;
      }
      /**
       * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
       * @param value The enum numeric value on the wire for lockReason to set.
       * @return This builder for chaining.
       */
      public Builder setLockReasonValue(int value) {
        
        lockReason_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
       * @return The lockReason.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason getLockReason() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason result = emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason.valueOf(lockReason_);
        return result == null ? emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason.UNRECOGNIZED : result;
      }
      /**
       * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
       * @param value The lockReason to set.
       * @return This builder for chaining.
       */
      public Builder setLockReason(emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData.LockReason value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        lockReason_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.LockedPersonallineData.LockReason lock_reason = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearLockReason() {
        
        lockReason_ = 0;
        onChanged();
        return this;
      }

      private int personalLineId_ ;
      /**
       * <code>uint32 personal_line_id = 12;</code>
       * @return The personalLineId.
       */
      @java.lang.Override
      public int getPersonalLineId() {
        return personalLineId_;
      }
      /**
       * <code>uint32 personal_line_id = 12;</code>
       * @param value The personalLineId to set.
       * @return This builder for chaining.
       */
      public Builder setPersonalLineId(int value) {
        
        personalLineId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 personal_line_id = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearPersonalLineId() {
        
        personalLineId_ = 0;
        onChanged();
        return this;
      }

      /**
       * <code>uint32 chapter_id = 14;</code>
       * @return Whether the chapterId field is set.
       */
      public boolean hasChapterId() {
        return paramCase_ == 14;
      }
      /**
       * <code>uint32 chapter_id = 14;</code>
       * @return The chapterId.
       */
      public int getChapterId() {
        if (paramCase_ == 14) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 chapter_id = 14;</code>
       * @param value The chapterId to set.
       * @return This builder for chaining.
       */
      public Builder setChapterId(int value) {
        paramCase_ = 14;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 chapter_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearChapterId() {
        if (paramCase_ == 14) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }

      /**
       * <code>uint32 level = 2;</code>
       * @return Whether the level field is set.
       */
      public boolean hasLevel() {
        return paramCase_ == 2;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @return The level.
       */
      public int getLevel() {
        if (paramCase_ == 2) {
          return (java.lang.Integer) param_;
        }
        return 0;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @param value The level to set.
       * @return This builder for chaining.
       */
      public Builder setLevel(int value) {
        paramCase_ = 2;
        param_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 level = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLevel() {
        if (paramCase_ == 2) {
          paramCase_ = 0;
          param_ = null;
          onChanged();
        }
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LockedPersonallineData)
    }

    // @@protoc_insertion_point(class_scope:LockedPersonallineData)
    private static final emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData();
    }

    public static emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LockedPersonallineData>
        PARSER = new com.google.protobuf.AbstractParser<LockedPersonallineData>() {
      @java.lang.Override
      public LockedPersonallineData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LockedPersonallineData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LockedPersonallineData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LockedPersonallineData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.LockedPersonallineDataOuterClass.LockedPersonallineData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LockedPersonallineData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LockedPersonallineData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034LockedPersonallineData.proto\"\327\001\n\026Locke" +
      "dPersonallineData\0227\n\013lock_reason\030\001 \001(\0162\"" +
      ".LockedPersonallineData.LockReason\022\030\n\020pe" +
      "rsonal_line_id\030\014 \001(\r\022\024\n\nchapter_id\030\016 \001(\r" +
      "H\000\022\017\n\005level\030\002 \001(\rH\000\":\n\nLockReason\022\025\n\021LOC" +
      "K_REASON_LEVEL\020\000\022\025\n\021LOCK_REASON_QUEST\020\001B" +
      "\007\n\005paramB\033\n\031emu.grasscutter.net.protob\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_LockedPersonallineData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LockedPersonallineData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LockedPersonallineData_descriptor,
        new java.lang.String[] { "LockReason", "PersonalLineId", "ChapterId", "Level", "Param", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
