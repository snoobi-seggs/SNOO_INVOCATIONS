// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RedPointData.proto

package emu.grasscutter.net.proto;

public final class RedPointDataOuterClass {
  private RedPointDataOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RedPointDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RedPointData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 red_point_type = 1;</code>
     * @return The redPointType.
     */
    int getRedPointType();

    /**
     * <code>bool is_show = 2;</code>
     * @return The isShow.
     */
    boolean getIsShow();

    /**
     * <code>uint32 content_id = 3;</code>
     * @return The contentId.
     */
    int getContentId();
  }
  /**
   * <pre>
   * Name: EAMNCJHCHCI
   * </pre>
   *
   * Protobuf type {@code RedPointData}
   */
  public static final class RedPointData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RedPointData)
      RedPointDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RedPointData.newBuilder() to construct.
    private RedPointData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RedPointData() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new RedPointData();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RedPointData(
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

              redPointType_ = input.readUInt32();
              break;
            }
            case 16: {

              isShow_ = input.readBool();
              break;
            }
            case 24: {

              contentId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.RedPointDataOuterClass.internal_static_RedPointData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.RedPointDataOuterClass.internal_static_RedPointData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.class, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder.class);
    }

    public static final int RED_POINT_TYPE_FIELD_NUMBER = 1;
    private int redPointType_;
    /**
     * <code>uint32 red_point_type = 1;</code>
     * @return The redPointType.
     */
    @java.lang.Override
    public int getRedPointType() {
      return redPointType_;
    }

    public static final int IS_SHOW_FIELD_NUMBER = 2;
    private boolean isShow_;
    /**
     * <code>bool is_show = 2;</code>
     * @return The isShow.
     */
    @java.lang.Override
    public boolean getIsShow() {
      return isShow_;
    }

    public static final int CONTENT_ID_FIELD_NUMBER = 3;
    private int contentId_;
    /**
     * <code>uint32 content_id = 3;</code>
     * @return The contentId.
     */
    @java.lang.Override
    public int getContentId() {
      return contentId_;
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
      if (redPointType_ != 0) {
        output.writeUInt32(1, redPointType_);
      }
      if (isShow_ != false) {
        output.writeBool(2, isShow_);
      }
      if (contentId_ != 0) {
        output.writeUInt32(3, contentId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (redPointType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, redPointType_);
      }
      if (isShow_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isShow_);
      }
      if (contentId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, contentId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData other = (emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData) obj;

      if (getRedPointType()
          != other.getRedPointType()) return false;
      if (getIsShow()
          != other.getIsShow()) return false;
      if (getContentId()
          != other.getContentId()) return false;
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
      hash = (37 * hash) + RED_POINT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRedPointType();
      hash = (37 * hash) + IS_SHOW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsShow());
      hash = (37 * hash) + CONTENT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getContentId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData prototype) {
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
     * Name: EAMNCJHCHCI
     * </pre>
     *
     * Protobuf type {@code RedPointData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RedPointData)
        emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.RedPointDataOuterClass.internal_static_RedPointData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.RedPointDataOuterClass.internal_static_RedPointData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.class, emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.newBuilder()
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
        redPointType_ = 0;

        isShow_ = false;

        contentId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.RedPointDataOuterClass.internal_static_RedPointData_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData build() {
        emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData buildPartial() {
        emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData result = new emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData(this);
        result.redPointType_ = redPointType_;
        result.isShow_ = isShow_;
        result.contentId_ = contentId_;
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
        if (other instanceof emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData) {
          return mergeFrom((emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData other) {
        if (other == emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData.getDefaultInstance()) return this;
        if (other.getRedPointType() != 0) {
          setRedPointType(other.getRedPointType());
        }
        if (other.getIsShow() != false) {
          setIsShow(other.getIsShow());
        }
        if (other.getContentId() != 0) {
          setContentId(other.getContentId());
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
        emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int redPointType_ ;
      /**
       * <code>uint32 red_point_type = 1;</code>
       * @return The redPointType.
       */
      @java.lang.Override
      public int getRedPointType() {
        return redPointType_;
      }
      /**
       * <code>uint32 red_point_type = 1;</code>
       * @param value The redPointType to set.
       * @return This builder for chaining.
       */
      public Builder setRedPointType(int value) {
        
        redPointType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 red_point_type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearRedPointType() {
        
        redPointType_ = 0;
        onChanged();
        return this;
      }

      private boolean isShow_ ;
      /**
       * <code>bool is_show = 2;</code>
       * @return The isShow.
       */
      @java.lang.Override
      public boolean getIsShow() {
        return isShow_;
      }
      /**
       * <code>bool is_show = 2;</code>
       * @param value The isShow to set.
       * @return This builder for chaining.
       */
      public Builder setIsShow(boolean value) {
        
        isShow_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_show = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsShow() {
        
        isShow_ = false;
        onChanged();
        return this;
      }

      private int contentId_ ;
      /**
       * <code>uint32 content_id = 3;</code>
       * @return The contentId.
       */
      @java.lang.Override
      public int getContentId() {
        return contentId_;
      }
      /**
       * <code>uint32 content_id = 3;</code>
       * @param value The contentId to set.
       * @return This builder for chaining.
       */
      public Builder setContentId(int value) {
        
        contentId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 content_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearContentId() {
        
        contentId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:RedPointData)
    }

    // @@protoc_insertion_point(class_scope:RedPointData)
    private static final emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData();
    }

    public static emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RedPointData>
        PARSER = new com.google.protobuf.AbstractParser<RedPointData>() {
      @java.lang.Override
      public RedPointData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RedPointData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RedPointData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RedPointData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.RedPointDataOuterClass.RedPointData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RedPointData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RedPointData_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022RedPointData.proto\"K\n\014RedPointData\022\026\n\016" +
      "red_point_type\030\001 \001(\r\022\017\n\007is_show\030\002 \001(\010\022\022\n" +
      "\ncontent_id\030\003 \001(\rB\033\n\031emu.grasscutter.net" +
      ".protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RedPointData_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RedPointData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RedPointData_descriptor,
        new java.lang.String[] { "RedPointType", "IsShow", "ContentId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
