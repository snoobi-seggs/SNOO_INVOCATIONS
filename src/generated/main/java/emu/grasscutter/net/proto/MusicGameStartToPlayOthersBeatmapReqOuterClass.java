// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicGameStartToPlayOthersBeatmapReq.proto

package emu.grasscutter.net.proto;

public final class MusicGameStartToPlayOthersBeatmapReqOuterClass {
  private MusicGameStartToPlayOthersBeatmapReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MusicGameStartToPlayOthersBeatmapReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MusicGameStartToPlayOthersBeatmapReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
     * @return The enum numeric value on the wire for unknownEnum1.
     */
    int getUnknownEnum1Value();
    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
     * @return The unknownEnum1.
     */
    emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();
  }
  /**
   * <pre>
   * CmdId: 6302
   * EnetChannelId: 0
   * EnetIsReliable: true
   * IsAllowClient: true
   * </pre>
   *
   * Protobuf type {@code MusicGameStartToPlayOthersBeatmapReq}
   */
  public static final class MusicGameStartToPlayOthersBeatmapReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MusicGameStartToPlayOthersBeatmapReq)
      MusicGameStartToPlayOthersBeatmapReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MusicGameStartToPlayOthersBeatmapReq.newBuilder() to construct.
    private MusicGameStartToPlayOthersBeatmapReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MusicGameStartToPlayOthersBeatmapReq() {
      unknownEnum1_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MusicGameStartToPlayOthersBeatmapReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MusicGameStartToPlayOthersBeatmapReq(
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
            case 96: {
              int rawValue = input.readEnum();

              unknownEnum1_ = rawValue;
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
      return emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.class, emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.Builder.class);
    }

    public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 12;
    private int unknownEnum1_;
    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
     * @return The enum numeric value on the wire for unknownEnum1.
     */
    @java.lang.Override public int getUnknownEnum1Value() {
      return unknownEnum1_;
    }
    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
     * @return The unknownEnum1.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(unknownEnum1_);
      return result == null ? emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
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
      if (unknownEnum1_ != emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
        output.writeEnum(12, unknownEnum1_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unknownEnum1_ != emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(12, unknownEnum1_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq other = (emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq) obj;

      if (unknownEnum1_ != other.unknownEnum1_) return false;
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
      hash = (37 * hash) + UNKNOWN_ENUM1_FIELD_NUMBER;
      hash = (53 * hash) + unknownEnum1_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq prototype) {
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
     * CmdId: 6302
     * EnetChannelId: 0
     * EnetIsReliable: true
     * IsAllowClient: true
     * </pre>
     *
     * Protobuf type {@code MusicGameStartToPlayOthersBeatmapReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MusicGameStartToPlayOthersBeatmapReq)
        emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.class, emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.newBuilder()
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
        unknownEnum1_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq build() {
        emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq buildPartial() {
        emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq result = new emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq(this);
        result.unknownEnum1_ = unknownEnum1_;
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
        if (other instanceof emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq) {
          return mergeFrom((emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq other) {
        if (other == emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq.getDefaultInstance()) return this;
        if (other.unknownEnum1_ != 0) {
          setUnknownEnum1Value(other.getUnknownEnum1Value());
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
        emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unknownEnum1_ = 0;
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
       * @return The enum numeric value on the wire for unknownEnum1.
       */
      @java.lang.Override public int getUnknownEnum1Value() {
        return unknownEnum1_;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
       * @param value The enum numeric value on the wire for unknownEnum1 to set.
       * @return This builder for chaining.
       */
      public Builder setUnknownEnum1Value(int value) {
        
        unknownEnum1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
       * @return The unknownEnum1.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(unknownEnum1_);
        return result == null ? emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
       * @param value The unknownEnum1 to set.
       * @return This builder for chaining.
       */
      public Builder setUnknownEnum1(emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unknownEnum1_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnknownEnum1() {
        
        unknownEnum1_ = 0;
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


      // @@protoc_insertion_point(builder_scope:MusicGameStartToPlayOthersBeatmapReq)
    }

    // @@protoc_insertion_point(class_scope:MusicGameStartToPlayOthersBeatmapReq)
    private static final emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq();
    }

    public static emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MusicGameStartToPlayOthersBeatmapReq>
        PARSER = new com.google.protobuf.AbstractParser<MusicGameStartToPlayOthersBeatmapReq>() {
      @java.lang.Override
      public MusicGameStartToPlayOthersBeatmapReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MusicGameStartToPlayOthersBeatmapReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MusicGameStartToPlayOthersBeatmapReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MusicGameStartToPlayOthersBeatmapReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MusicGameStartToPlayOthersBeatmapReqOuterClass.MusicGameStartToPlayOthersBeatmapReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*MusicGameStartToPlayOthersBeatmapReq.p" +
      "roto\032\033MusicGameUnknown1Enum.proto\"U\n$Mus" +
      "icGameStartToPlayOthersBeatmapReq\022-\n\runk" +
      "nown_enum1\030\014 \001(\0162\026.MusicGameUnknown1Enum" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.getDescriptor(),
        });
    internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MusicGameStartToPlayOthersBeatmapReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MusicGameStartToPlayOthersBeatmapReq_descriptor,
        new java.lang.String[] { "UnknownEnum1", });
    emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
