// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ToTheMoonRemoveObstacleReq.proto

package emu.grasscutter.net.proto;

public final class ToTheMoonRemoveObstacleReqOuterClass {
  private ToTheMoonRemoveObstacleReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ToTheMoonRemoveObstacleReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ToTheMoonRemoveObstacleReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 query_id = 6;</code>
     * @return The queryId.
     */
    int getQueryId();

    /**
     * <code>int32 handle = 1;</code>
     * @return The handle.
     */
    int getHandle();

    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    int getSceneId();
  }
  /**
   * <pre>
   * Name: OCLFPKFMGBE
   * CmdId: 6182
   * </pre>
   *
   * Protobuf type {@code ToTheMoonRemoveObstacleReq}
   */
  public static final class ToTheMoonRemoveObstacleReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ToTheMoonRemoveObstacleReq)
      ToTheMoonRemoveObstacleReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ToTheMoonRemoveObstacleReq.newBuilder() to construct.
    private ToTheMoonRemoveObstacleReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ToTheMoonRemoveObstacleReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ToTheMoonRemoveObstacleReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ToTheMoonRemoveObstacleReq(
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

              handle_ = input.readInt32();
              break;
            }
            case 24: {

              sceneId_ = input.readUInt32();
              break;
            }
            case 48: {

              queryId_ = input.readInt32();
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
      return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.class, emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.Builder.class);
    }

    /**
     * <pre>
     * Name: CFNHLMAPIOJ
     * </pre>
     *
     * Protobuf enum {@code ToTheMoonRemoveObstacleReq.CFNHLMAPIOJ}
     */
    public enum CFNHLMAPIOJ
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <code>CFNHLMAPIOJ_IIGFIDPJPDF = 0;</code>
       */
      CFNHLMAPIOJ_IIGFIDPJPDF(0),
      /**
       * <code>CFNHLMAPIOJ_HNBGNEFHJOA = 1;</code>
       */
      CFNHLMAPIOJ_HNBGNEFHJOA(1),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>CFNHLMAPIOJ_IIGFIDPJPDF = 0;</code>
       */
      public static final int CFNHLMAPIOJ_IIGFIDPJPDF_VALUE = 0;
      /**
       * <code>CFNHLMAPIOJ_HNBGNEFHJOA = 1;</code>
       */
      public static final int CFNHLMAPIOJ_HNBGNEFHJOA_VALUE = 1;


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
      public static CFNHLMAPIOJ valueOf(int value) {
        return forNumber(value);
      }

      /**
       * @param value The numeric wire value of the corresponding enum entry.
       * @return The enum associated with the given numeric wire value.
       */
      public static CFNHLMAPIOJ forNumber(int value) {
        switch (value) {
          case 0: return CFNHLMAPIOJ_IIGFIDPJPDF;
          case 1: return CFNHLMAPIOJ_HNBGNEFHJOA;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<CFNHLMAPIOJ>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          CFNHLMAPIOJ> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CFNHLMAPIOJ>() {
              public CFNHLMAPIOJ findValueByNumber(int number) {
                return CFNHLMAPIOJ.forNumber(number);
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
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.getDescriptor().getEnumTypes().get(0);
      }

      private static final CFNHLMAPIOJ[] VALUES = values();

      public static CFNHLMAPIOJ valueOf(
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

      private CFNHLMAPIOJ(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:ToTheMoonRemoveObstacleReq.CFNHLMAPIOJ)
    }

    public static final int QUERY_ID_FIELD_NUMBER = 6;
    private int queryId_;
    /**
     * <code>int32 query_id = 6;</code>
     * @return The queryId.
     */
    @java.lang.Override
    public int getQueryId() {
      return queryId_;
    }

    public static final int HANDLE_FIELD_NUMBER = 1;
    private int handle_;
    /**
     * <code>int32 handle = 1;</code>
     * @return The handle.
     */
    @java.lang.Override
    public int getHandle() {
      return handle_;
    }

    public static final int SCENE_ID_FIELD_NUMBER = 3;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
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
      if (handle_ != 0) {
        output.writeInt32(1, handle_);
      }
      if (sceneId_ != 0) {
        output.writeUInt32(3, sceneId_);
      }
      if (queryId_ != 0) {
        output.writeInt32(6, queryId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (handle_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, handle_);
      }
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, sceneId_);
      }
      if (queryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, queryId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq other = (emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq) obj;

      if (getQueryId()
          != other.getQueryId()) return false;
      if (getHandle()
          != other.getHandle()) return false;
      if (getSceneId()
          != other.getSceneId()) return false;
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
      hash = (37 * hash) + QUERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQueryId();
      hash = (37 * hash) + HANDLE_FIELD_NUMBER;
      hash = (53 * hash) + getHandle();
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq prototype) {
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
     * Name: OCLFPKFMGBE
     * CmdId: 6182
     * </pre>
     *
     * Protobuf type {@code ToTheMoonRemoveObstacleReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ToTheMoonRemoveObstacleReq)
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.class, emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.newBuilder()
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
        queryId_ = 0;

        handle_ = 0;

        sceneId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.internal_static_ToTheMoonRemoveObstacleReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq build() {
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq buildPartial() {
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq result = new emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq(this);
        result.queryId_ = queryId_;
        result.handle_ = handle_;
        result.sceneId_ = sceneId_;
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
        if (other instanceof emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq) {
          return mergeFrom((emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq other) {
        if (other == emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq.getDefaultInstance()) return this;
        if (other.getQueryId() != 0) {
          setQueryId(other.getQueryId());
        }
        if (other.getHandle() != 0) {
          setHandle(other.getHandle());
        }
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
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
        emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int queryId_ ;
      /**
       * <code>int32 query_id = 6;</code>
       * @return The queryId.
       */
      @java.lang.Override
      public int getQueryId() {
        return queryId_;
      }
      /**
       * <code>int32 query_id = 6;</code>
       * @param value The queryId to set.
       * @return This builder for chaining.
       */
      public Builder setQueryId(int value) {
        
        queryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 query_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearQueryId() {
        
        queryId_ = 0;
        onChanged();
        return this;
      }

      private int handle_ ;
      /**
       * <code>int32 handle = 1;</code>
       * @return The handle.
       */
      @java.lang.Override
      public int getHandle() {
        return handle_;
      }
      /**
       * <code>int32 handle = 1;</code>
       * @param value The handle to set.
       * @return This builder for chaining.
       */
      public Builder setHandle(int value) {
        
        handle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 handle = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearHandle() {
        
        handle_ = 0;
        onChanged();
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ToTheMoonRemoveObstacleReq)
    }

    // @@protoc_insertion_point(class_scope:ToTheMoonRemoveObstacleReq)
    private static final emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq();
    }

    public static emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ToTheMoonRemoveObstacleReq>
        PARSER = new com.google.protobuf.AbstractParser<ToTheMoonRemoveObstacleReq>() {
      @java.lang.Override
      public ToTheMoonRemoveObstacleReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ToTheMoonRemoveObstacleReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ToTheMoonRemoveObstacleReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ToTheMoonRemoveObstacleReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ToTheMoonRemoveObstacleReqOuterClass.ToTheMoonRemoveObstacleReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ToTheMoonRemoveObstacleReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n ToTheMoonRemoveObstacleReq.proto\"\231\001\n\032T" +
      "oTheMoonRemoveObstacleReq\022\020\n\010query_id\030\006 " +
      "\001(\005\022\016\n\006handle\030\001 \001(\005\022\020\n\010scene_id\030\003 \001(\r\"G\n" +
      "\013CFNHLMAPIOJ\022\033\n\027CFNHLMAPIOJ_IIGFIDPJPDF\020" +
      "\000\022\033\n\027CFNHLMAPIOJ_HNBGNEFHJOA\020\001B\033\n\031emu.gr" +
      "asscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ToTheMoonRemoveObstacleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ToTheMoonRemoveObstacleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ToTheMoonRemoveObstacleReq_descriptor,
        new java.lang.String[] { "QueryId", "Handle", "SceneId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}