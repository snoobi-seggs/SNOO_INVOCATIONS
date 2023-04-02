// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InBattleMechanicusPickCardReq.proto

package emu.grasscutter.net.proto;

public final class InBattleMechanicusPickCardReqOuterClass {
  private InBattleMechanicusPickCardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface InBattleMechanicusPickCardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:InBattleMechanicusPickCardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 play_index = 4;</code>
     * @return The playIndex.
     */
    int getPlayIndex();

    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    int getGroupId();

    /**
     * <code>uint32 card_id = 2;</code>
     * @return The cardId.
     */
    int getCardId();
  }
  /**
   * <pre>
   * Name: BACOMAIDHGA
   * CmdId: 5382
   * </pre>
   *
   * Protobuf type {@code InBattleMechanicusPickCardReq}
   */
  public static final class InBattleMechanicusPickCardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:InBattleMechanicusPickCardReq)
      InBattleMechanicusPickCardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use InBattleMechanicusPickCardReq.newBuilder() to construct.
    private InBattleMechanicusPickCardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private InBattleMechanicusPickCardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new InBattleMechanicusPickCardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private InBattleMechanicusPickCardReq(
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
            case 16: {

              cardId_ = input.readUInt32();
              break;
            }
            case 32: {

              playIndex_ = input.readUInt32();
              break;
            }
            case 88: {

              groupId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.internal_static_InBattleMechanicusPickCardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.internal_static_InBattleMechanicusPickCardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.class, emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.Builder.class);
    }

    public static final int PLAY_INDEX_FIELD_NUMBER = 4;
    private int playIndex_;
    /**
     * <code>uint32 play_index = 4;</code>
     * @return The playIndex.
     */
    @java.lang.Override
    public int getPlayIndex() {
      return playIndex_;
    }

    public static final int GROUP_ID_FIELD_NUMBER = 11;
    private int groupId_;
    /**
     * <code>uint32 group_id = 11;</code>
     * @return The groupId.
     */
    @java.lang.Override
    public int getGroupId() {
      return groupId_;
    }

    public static final int CARD_ID_FIELD_NUMBER = 2;
    private int cardId_;
    /**
     * <code>uint32 card_id = 2;</code>
     * @return The cardId.
     */
    @java.lang.Override
    public int getCardId() {
      return cardId_;
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
      if (cardId_ != 0) {
        output.writeUInt32(2, cardId_);
      }
      if (playIndex_ != 0) {
        output.writeUInt32(4, playIndex_);
      }
      if (groupId_ != 0) {
        output.writeUInt32(11, groupId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, cardId_);
      }
      if (playIndex_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, playIndex_);
      }
      if (groupId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, groupId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq other = (emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq) obj;

      if (getPlayIndex()
          != other.getPlayIndex()) return false;
      if (getGroupId()
          != other.getGroupId()) return false;
      if (getCardId()
          != other.getCardId()) return false;
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
      hash = (37 * hash) + PLAY_INDEX_FIELD_NUMBER;
      hash = (53 * hash) + getPlayIndex();
      hash = (37 * hash) + GROUP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGroupId();
      hash = (37 * hash) + CARD_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq prototype) {
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
     * Name: BACOMAIDHGA
     * CmdId: 5382
     * </pre>
     *
     * Protobuf type {@code InBattleMechanicusPickCardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:InBattleMechanicusPickCardReq)
        emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.internal_static_InBattleMechanicusPickCardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.internal_static_InBattleMechanicusPickCardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.class, emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.newBuilder()
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
        playIndex_ = 0;

        groupId_ = 0;

        cardId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.internal_static_InBattleMechanicusPickCardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq build() {
        emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq buildPartial() {
        emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq result = new emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq(this);
        result.playIndex_ = playIndex_;
        result.groupId_ = groupId_;
        result.cardId_ = cardId_;
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
        if (other instanceof emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq) {
          return mergeFrom((emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq other) {
        if (other == emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq.getDefaultInstance()) return this;
        if (other.getPlayIndex() != 0) {
          setPlayIndex(other.getPlayIndex());
        }
        if (other.getGroupId() != 0) {
          setGroupId(other.getGroupId());
        }
        if (other.getCardId() != 0) {
          setCardId(other.getCardId());
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
        emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int playIndex_ ;
      /**
       * <code>uint32 play_index = 4;</code>
       * @return The playIndex.
       */
      @java.lang.Override
      public int getPlayIndex() {
        return playIndex_;
      }
      /**
       * <code>uint32 play_index = 4;</code>
       * @param value The playIndex to set.
       * @return This builder for chaining.
       */
      public Builder setPlayIndex(int value) {
        
        playIndex_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 play_index = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPlayIndex() {
        
        playIndex_ = 0;
        onChanged();
        return this;
      }

      private int groupId_ ;
      /**
       * <code>uint32 group_id = 11;</code>
       * @return The groupId.
       */
      @java.lang.Override
      public int getGroupId() {
        return groupId_;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @param value The groupId to set.
       * @return This builder for chaining.
       */
      public Builder setGroupId(int value) {
        
        groupId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 group_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearGroupId() {
        
        groupId_ = 0;
        onChanged();
        return this;
      }

      private int cardId_ ;
      /**
       * <code>uint32 card_id = 2;</code>
       * @return The cardId.
       */
      @java.lang.Override
      public int getCardId() {
        return cardId_;
      }
      /**
       * <code>uint32 card_id = 2;</code>
       * @param value The cardId to set.
       * @return This builder for chaining.
       */
      public Builder setCardId(int value) {
        
        cardId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardId() {
        
        cardId_ = 0;
        onChanged();
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


      // @@protoc_insertion_point(builder_scope:InBattleMechanicusPickCardReq)
    }

    // @@protoc_insertion_point(class_scope:InBattleMechanicusPickCardReq)
    private static final emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq();
    }

    public static emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<InBattleMechanicusPickCardReq>
        PARSER = new com.google.protobuf.AbstractParser<InBattleMechanicusPickCardReq>() {
      @java.lang.Override
      public InBattleMechanicusPickCardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new InBattleMechanicusPickCardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<InBattleMechanicusPickCardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<InBattleMechanicusPickCardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.InBattleMechanicusPickCardReqOuterClass.InBattleMechanicusPickCardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_InBattleMechanicusPickCardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_InBattleMechanicusPickCardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#InBattleMechanicusPickCardReq.proto\"V\n" +
      "\035InBattleMechanicusPickCardReq\022\022\n\nplay_i" +
      "ndex\030\004 \001(\r\022\020\n\010group_id\030\013 \001(\r\022\017\n\007card_id\030" +
      "\002 \001(\rB\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_InBattleMechanicusPickCardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_InBattleMechanicusPickCardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_InBattleMechanicusPickCardReq_descriptor,
        new java.lang.String[] { "PlayIndex", "GroupId", "CardId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
