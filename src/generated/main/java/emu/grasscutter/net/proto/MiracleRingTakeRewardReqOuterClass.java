// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MiracleRingTakeRewardReq.proto

package emu.grasscutter.net.proto;

public final class MiracleRingTakeRewardReqOuterClass {
  private MiracleRingTakeRewardReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MiracleRingTakeRewardReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MiracleRingTakeRewardReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 gadget_id = 10;</code>
     * @return The gadgetId.
     */
    int getGadgetId();

    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    int getGadgetEntityId();
  }
  /**
   * <pre>
   * Name: MHCCDCBDILE
   * CmdId: 5246
   * </pre>
   *
   * Protobuf type {@code MiracleRingTakeRewardReq}
   */
  public static final class MiracleRingTakeRewardReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MiracleRingTakeRewardReq)
      MiracleRingTakeRewardReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MiracleRingTakeRewardReq.newBuilder() to construct.
    private MiracleRingTakeRewardReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MiracleRingTakeRewardReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MiracleRingTakeRewardReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MiracleRingTakeRewardReq(
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
            case 56: {

              gadgetEntityId_ = input.readUInt32();
              break;
            }
            case 80: {

              gadgetId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.internal_static_MiracleRingTakeRewardReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.internal_static_MiracleRingTakeRewardReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.class, emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.Builder.class);
    }

    public static final int GADGET_ID_FIELD_NUMBER = 10;
    private int gadgetId_;
    /**
     * <code>uint32 gadget_id = 10;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }

    public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 7;
    private int gadgetEntityId_;
    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
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
      if (gadgetEntityId_ != 0) {
        output.writeUInt32(7, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        output.writeUInt32(10, gadgetId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (gadgetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, gadgetEntityId_);
      }
      if (gadgetId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gadgetId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq other = (emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq) obj;

      if (getGadgetId()
          != other.getGadgetId()) return false;
      if (getGadgetEntityId()
          != other.getGadgetEntityId()) return false;
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
      hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetId();
      hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGadgetEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq prototype) {
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
     * Name: MHCCDCBDILE
     * CmdId: 5246
     * </pre>
     *
     * Protobuf type {@code MiracleRingTakeRewardReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MiracleRingTakeRewardReq)
        emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.internal_static_MiracleRingTakeRewardReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.internal_static_MiracleRingTakeRewardReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.class, emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.newBuilder()
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
        gadgetId_ = 0;

        gadgetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.internal_static_MiracleRingTakeRewardReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq build() {
        emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq buildPartial() {
        emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq result = new emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq(this);
        result.gadgetId_ = gadgetId_;
        result.gadgetEntityId_ = gadgetEntityId_;
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
        if (other instanceof emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq) {
          return mergeFrom((emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq other) {
        if (other == emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq.getDefaultInstance()) return this;
        if (other.getGadgetId() != 0) {
          setGadgetId(other.getGadgetId());
        }
        if (other.getGadgetEntityId() != 0) {
          setGadgetEntityId(other.getGadgetEntityId());
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
        emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gadgetId_ ;
      /**
       * <code>uint32 gadget_id = 10;</code>
       * @return The gadgetId.
       */
      @java.lang.Override
      public int getGadgetId() {
        return gadgetId_;
      }
      /**
       * <code>uint32 gadget_id = 10;</code>
       * @param value The gadgetId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetId(int value) {
        
        gadgetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_id = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetId() {
        
        gadgetId_ = 0;
        onChanged();
        return this;
      }

      private int gadgetEntityId_ ;
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @return The gadgetEntityId.
       */
      @java.lang.Override
      public int getGadgetEntityId() {
        return gadgetEntityId_;
      }
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @param value The gadgetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setGadgetEntityId(int value) {
        
        gadgetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gadget_entity_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearGadgetEntityId() {
        
        gadgetEntityId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MiracleRingTakeRewardReq)
    }

    // @@protoc_insertion_point(class_scope:MiracleRingTakeRewardReq)
    private static final emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq();
    }

    public static emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MiracleRingTakeRewardReq>
        PARSER = new com.google.protobuf.AbstractParser<MiracleRingTakeRewardReq>() {
      @java.lang.Override
      public MiracleRingTakeRewardReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MiracleRingTakeRewardReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MiracleRingTakeRewardReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MiracleRingTakeRewardReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MiracleRingTakeRewardReqOuterClass.MiracleRingTakeRewardReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MiracleRingTakeRewardReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MiracleRingTakeRewardReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\036MiracleRingTakeRewardReq.proto\"G\n\030Mira" +
      "cleRingTakeRewardReq\022\021\n\tgadget_id\030\n \001(\r\022" +
      "\030\n\020gadget_entity_id\030\007 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_MiracleRingTakeRewardReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MiracleRingTakeRewardReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MiracleRingTakeRewardReq_descriptor,
        new java.lang.String[] { "GadgetId", "GadgetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
