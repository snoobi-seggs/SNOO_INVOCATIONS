// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MpPlayGuestReplyInviteReq.proto

package emu.grasscutter.net.proto;

public final class MpPlayGuestReplyInviteReqOuterClass {
  private MpPlayGuestReplyInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MpPlayGuestReplyInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MpPlayGuestReplyInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 mp_play_id = 11;</code>
     * @return The mpPlayId.
     */
    int getMpPlayId();

    /**
     * <code>bool is_agree = 6;</code>
     * @return The isAgree.
     */
    boolean getIsAgree();
  }
  /**
   * <pre>
   * Name: PBHGMKBHEPP
   * CmdId: 1840
   * </pre>
   *
   * Protobuf type {@code MpPlayGuestReplyInviteReq}
   */
  public static final class MpPlayGuestReplyInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MpPlayGuestReplyInviteReq)
      MpPlayGuestReplyInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MpPlayGuestReplyInviteReq.newBuilder() to construct.
    private MpPlayGuestReplyInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MpPlayGuestReplyInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MpPlayGuestReplyInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MpPlayGuestReplyInviteReq(
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
            case 48: {

              isAgree_ = input.readBool();
              break;
            }
            case 88: {

              mpPlayId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.internal_static_MpPlayGuestReplyInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.internal_static_MpPlayGuestReplyInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.class, emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.Builder.class);
    }

    public static final int MP_PLAY_ID_FIELD_NUMBER = 11;
    private int mpPlayId_;
    /**
     * <code>uint32 mp_play_id = 11;</code>
     * @return The mpPlayId.
     */
    @java.lang.Override
    public int getMpPlayId() {
      return mpPlayId_;
    }

    public static final int IS_AGREE_FIELD_NUMBER = 6;
    private boolean isAgree_;
    /**
     * <code>bool is_agree = 6;</code>
     * @return The isAgree.
     */
    @java.lang.Override
    public boolean getIsAgree() {
      return isAgree_;
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
      if (isAgree_ != false) {
        output.writeBool(6, isAgree_);
      }
      if (mpPlayId_ != 0) {
        output.writeUInt32(11, mpPlayId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isAgree_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, isAgree_);
      }
      if (mpPlayId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, mpPlayId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq other = (emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq) obj;

      if (getMpPlayId()
          != other.getMpPlayId()) return false;
      if (getIsAgree()
          != other.getIsAgree()) return false;
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
      hash = (37 * hash) + MP_PLAY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMpPlayId();
      hash = (37 * hash) + IS_AGREE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsAgree());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq prototype) {
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
     * Name: PBHGMKBHEPP
     * CmdId: 1840
     * </pre>
     *
     * Protobuf type {@code MpPlayGuestReplyInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MpPlayGuestReplyInviteReq)
        emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.internal_static_MpPlayGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.internal_static_MpPlayGuestReplyInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.class, emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.newBuilder()
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
        mpPlayId_ = 0;

        isAgree_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.internal_static_MpPlayGuestReplyInviteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq build() {
        emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq buildPartial() {
        emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq result = new emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq(this);
        result.mpPlayId_ = mpPlayId_;
        result.isAgree_ = isAgree_;
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
        if (other instanceof emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq) {
          return mergeFrom((emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq other) {
        if (other == emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq.getDefaultInstance()) return this;
        if (other.getMpPlayId() != 0) {
          setMpPlayId(other.getMpPlayId());
        }
        if (other.getIsAgree() != false) {
          setIsAgree(other.getIsAgree());
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
        emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mpPlayId_ ;
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @return The mpPlayId.
       */
      @java.lang.Override
      public int getMpPlayId() {
        return mpPlayId_;
      }
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @param value The mpPlayId to set.
       * @return This builder for chaining.
       */
      public Builder setMpPlayId(int value) {
        
        mpPlayId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 mp_play_id = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearMpPlayId() {
        
        mpPlayId_ = 0;
        onChanged();
        return this;
      }

      private boolean isAgree_ ;
      /**
       * <code>bool is_agree = 6;</code>
       * @return The isAgree.
       */
      @java.lang.Override
      public boolean getIsAgree() {
        return isAgree_;
      }
      /**
       * <code>bool is_agree = 6;</code>
       * @param value The isAgree to set.
       * @return This builder for chaining.
       */
      public Builder setIsAgree(boolean value) {
        
        isAgree_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_agree = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsAgree() {
        
        isAgree_ = false;
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


      // @@protoc_insertion_point(builder_scope:MpPlayGuestReplyInviteReq)
    }

    // @@protoc_insertion_point(class_scope:MpPlayGuestReplyInviteReq)
    private static final emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq();
    }

    public static emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MpPlayGuestReplyInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<MpPlayGuestReplyInviteReq>() {
      @java.lang.Override
      public MpPlayGuestReplyInviteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MpPlayGuestReplyInviteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MpPlayGuestReplyInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MpPlayGuestReplyInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MpPlayGuestReplyInviteReqOuterClass.MpPlayGuestReplyInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MpPlayGuestReplyInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MpPlayGuestReplyInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MpPlayGuestReplyInviteReq.proto\"A\n\031MpP" +
      "layGuestReplyInviteReq\022\022\n\nmp_play_id\030\013 \001" +
      "(\r\022\020\n\010is_agree\030\006 \001(\010B\033\n\031emu.grasscutter." +
      "net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MpPlayGuestReplyInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MpPlayGuestReplyInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MpPlayGuestReplyInviteReq_descriptor,
        new java.lang.String[] { "MpPlayId", "IsAgree", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
