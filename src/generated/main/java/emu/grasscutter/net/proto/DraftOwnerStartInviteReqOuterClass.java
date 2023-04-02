// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: DraftOwnerStartInviteReq.proto

package emu.grasscutter.net.proto;

public final class DraftOwnerStartInviteReqOuterClass {
  private DraftOwnerStartInviteReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface DraftOwnerStartInviteReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DraftOwnerStartInviteReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 draft_id = 14;</code>
     * @return The draftId.
     */
    int getDraftId();
  }
  /**
   * <pre>
   * Name: DEFBPEKDIKP
   * CmdId: 5454
   * </pre>
   *
   * Protobuf type {@code DraftOwnerStartInviteReq}
   */
  public static final class DraftOwnerStartInviteReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DraftOwnerStartInviteReq)
      DraftOwnerStartInviteReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DraftOwnerStartInviteReq.newBuilder() to construct.
    private DraftOwnerStartInviteReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DraftOwnerStartInviteReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new DraftOwnerStartInviteReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DraftOwnerStartInviteReq(
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
            case 112: {

              draftId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.internal_static_DraftOwnerStartInviteReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.internal_static_DraftOwnerStartInviteReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.class, emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.Builder.class);
    }

    public static final int DRAFT_ID_FIELD_NUMBER = 14;
    private int draftId_;
    /**
     * <code>uint32 draft_id = 14;</code>
     * @return The draftId.
     */
    @java.lang.Override
    public int getDraftId() {
      return draftId_;
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
      if (draftId_ != 0) {
        output.writeUInt32(14, draftId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (draftId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, draftId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq other = (emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq) obj;

      if (getDraftId()
          != other.getDraftId()) return false;
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
      hash = (37 * hash) + DRAFT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getDraftId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq prototype) {
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
     * Name: DEFBPEKDIKP
     * CmdId: 5454
     * </pre>
     *
     * Protobuf type {@code DraftOwnerStartInviteReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DraftOwnerStartInviteReq)
        emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.internal_static_DraftOwnerStartInviteReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.internal_static_DraftOwnerStartInviteReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.class, emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.newBuilder()
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
        draftId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.internal_static_DraftOwnerStartInviteReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq build() {
        emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq buildPartial() {
        emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq result = new emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq(this);
        result.draftId_ = draftId_;
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
        if (other instanceof emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq) {
          return mergeFrom((emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq other) {
        if (other == emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq.getDefaultInstance()) return this;
        if (other.getDraftId() != 0) {
          setDraftId(other.getDraftId());
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
        emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int draftId_ ;
      /**
       * <code>uint32 draft_id = 14;</code>
       * @return The draftId.
       */
      @java.lang.Override
      public int getDraftId() {
        return draftId_;
      }
      /**
       * <code>uint32 draft_id = 14;</code>
       * @param value The draftId to set.
       * @return This builder for chaining.
       */
      public Builder setDraftId(int value) {
        
        draftId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 draft_id = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearDraftId() {
        
        draftId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:DraftOwnerStartInviteReq)
    }

    // @@protoc_insertion_point(class_scope:DraftOwnerStartInviteReq)
    private static final emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq();
    }

    public static emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DraftOwnerStartInviteReq>
        PARSER = new com.google.protobuf.AbstractParser<DraftOwnerStartInviteReq>() {
      @java.lang.Override
      public DraftOwnerStartInviteReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DraftOwnerStartInviteReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DraftOwnerStartInviteReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DraftOwnerStartInviteReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.DraftOwnerStartInviteReqOuterClass.DraftOwnerStartInviteReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DraftOwnerStartInviteReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DraftOwnerStartInviteReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036DraftOwnerStartInviteReq.proto\",\n\030Draf" +
      "tOwnerStartInviteReq\022\020\n\010draft_id\030\016 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DraftOwnerStartInviteReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DraftOwnerStartInviteReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DraftOwnerStartInviteReq_descriptor,
        new java.lang.String[] { "DraftId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
