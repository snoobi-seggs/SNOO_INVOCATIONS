// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AdjustWorldLevelReq.proto

package emu.grasscutter.net.proto;

public final class AdjustWorldLevelReqOuterClass {
  private AdjustWorldLevelReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AdjustWorldLevelReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AdjustWorldLevelReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 GKPAJDAOHDN = 10;</code>
     * @return The gKPAJDAOHDN.
     */
    int getGKPAJDAOHDN();

    /**
     * <code>uint32 HFANGCIKHFI = 6;</code>
     * @return The hFANGCIKHFI.
     */
    int getHFANGCIKHFI();
  }
  /**
   * <pre>
   * Name: EDAOBIJNNKG
   * CmdId: 132
   * </pre>
   *
   * Protobuf type {@code AdjustWorldLevelReq}
   */
  public static final class AdjustWorldLevelReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AdjustWorldLevelReq)
      AdjustWorldLevelReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AdjustWorldLevelReq.newBuilder() to construct.
    private AdjustWorldLevelReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AdjustWorldLevelReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AdjustWorldLevelReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AdjustWorldLevelReq(
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

              hFANGCIKHFI_ = input.readUInt32();
              break;
            }
            case 80: {

              gKPAJDAOHDN_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.internal_static_AdjustWorldLevelReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.internal_static_AdjustWorldLevelReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.class, emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.Builder.class);
    }

    public static final int GKPAJDAOHDN_FIELD_NUMBER = 10;
    private int gKPAJDAOHDN_;
    /**
     * <code>uint32 GKPAJDAOHDN = 10;</code>
     * @return The gKPAJDAOHDN.
     */
    @java.lang.Override
    public int getGKPAJDAOHDN() {
      return gKPAJDAOHDN_;
    }

    public static final int HFANGCIKHFI_FIELD_NUMBER = 6;
    private int hFANGCIKHFI_;
    /**
     * <code>uint32 HFANGCIKHFI = 6;</code>
     * @return The hFANGCIKHFI.
     */
    @java.lang.Override
    public int getHFANGCIKHFI() {
      return hFANGCIKHFI_;
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
      if (hFANGCIKHFI_ != 0) {
        output.writeUInt32(6, hFANGCIKHFI_);
      }
      if (gKPAJDAOHDN_ != 0) {
        output.writeUInt32(10, gKPAJDAOHDN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hFANGCIKHFI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, hFANGCIKHFI_);
      }
      if (gKPAJDAOHDN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, gKPAJDAOHDN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq other = (emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq) obj;

      if (getGKPAJDAOHDN()
          != other.getGKPAJDAOHDN()) return false;
      if (getHFANGCIKHFI()
          != other.getHFANGCIKHFI()) return false;
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
      hash = (37 * hash) + GKPAJDAOHDN_FIELD_NUMBER;
      hash = (53 * hash) + getGKPAJDAOHDN();
      hash = (37 * hash) + HFANGCIKHFI_FIELD_NUMBER;
      hash = (53 * hash) + getHFANGCIKHFI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq prototype) {
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
     * Name: EDAOBIJNNKG
     * CmdId: 132
     * </pre>
     *
     * Protobuf type {@code AdjustWorldLevelReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AdjustWorldLevelReq)
        emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.internal_static_AdjustWorldLevelReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.internal_static_AdjustWorldLevelReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.class, emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.newBuilder()
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
        gKPAJDAOHDN_ = 0;

        hFANGCIKHFI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.internal_static_AdjustWorldLevelReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq build() {
        emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq buildPartial() {
        emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq result = new emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq(this);
        result.gKPAJDAOHDN_ = gKPAJDAOHDN_;
        result.hFANGCIKHFI_ = hFANGCIKHFI_;
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
        if (other instanceof emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq) {
          return mergeFrom((emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq other) {
        if (other == emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq.getDefaultInstance()) return this;
        if (other.getGKPAJDAOHDN() != 0) {
          setGKPAJDAOHDN(other.getGKPAJDAOHDN());
        }
        if (other.getHFANGCIKHFI() != 0) {
          setHFANGCIKHFI(other.getHFANGCIKHFI());
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
        emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int gKPAJDAOHDN_ ;
      /**
       * <code>uint32 GKPAJDAOHDN = 10;</code>
       * @return The gKPAJDAOHDN.
       */
      @java.lang.Override
      public int getGKPAJDAOHDN() {
        return gKPAJDAOHDN_;
      }
      /**
       * <code>uint32 GKPAJDAOHDN = 10;</code>
       * @param value The gKPAJDAOHDN to set.
       * @return This builder for chaining.
       */
      public Builder setGKPAJDAOHDN(int value) {
        
        gKPAJDAOHDN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 GKPAJDAOHDN = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearGKPAJDAOHDN() {
        
        gKPAJDAOHDN_ = 0;
        onChanged();
        return this;
      }

      private int hFANGCIKHFI_ ;
      /**
       * <code>uint32 HFANGCIKHFI = 6;</code>
       * @return The hFANGCIKHFI.
       */
      @java.lang.Override
      public int getHFANGCIKHFI() {
        return hFANGCIKHFI_;
      }
      /**
       * <code>uint32 HFANGCIKHFI = 6;</code>
       * @param value The hFANGCIKHFI to set.
       * @return This builder for chaining.
       */
      public Builder setHFANGCIKHFI(int value) {
        
        hFANGCIKHFI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 HFANGCIKHFI = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHFANGCIKHFI() {
        
        hFANGCIKHFI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:AdjustWorldLevelReq)
    }

    // @@protoc_insertion_point(class_scope:AdjustWorldLevelReq)
    private static final emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq();
    }

    public static emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AdjustWorldLevelReq>
        PARSER = new com.google.protobuf.AbstractParser<AdjustWorldLevelReq>() {
      @java.lang.Override
      public AdjustWorldLevelReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AdjustWorldLevelReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AdjustWorldLevelReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AdjustWorldLevelReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AdjustWorldLevelReqOuterClass.AdjustWorldLevelReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AdjustWorldLevelReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AdjustWorldLevelReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031AdjustWorldLevelReq.proto\"?\n\023AdjustWor" +
      "ldLevelReq\022\023\n\013GKPAJDAOHDN\030\n \001(\r\022\023\n\013HFANG" +
      "CIKHFI\030\006 \001(\rB\033\n\031emu.grasscutter.net.prot" +
      "ob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AdjustWorldLevelReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AdjustWorldLevelReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AdjustWorldLevelReq_descriptor,
        new java.lang.String[] { "GKPAJDAOHDN", "HFANGCIKHFI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
