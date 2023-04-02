// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeGetGroupRecordRsp.proto

package emu.grasscutter.net.proto;

public final class HomeGetGroupRecordRspOuterClass {
  private HomeGetGroupRecordRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeGetGroupRecordRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeGetGroupRecordRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 record_type = 7;</code>
     * @return The recordType.
     */
    int getRecordType();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.HomeGroupRecord group_record = 12;</code>
     * @return Whether the groupRecord field is set.
     */
    boolean hasGroupRecord();
    /**
     * <code>.HomeGroupRecord group_record = 12;</code>
     * @return The groupRecord.
     */
    emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord getGroupRecord();
    /**
     * <code>.HomeGroupRecord group_record = 12;</code>
     */
    emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecordOrBuilder getGroupRecordOrBuilder();
  }
  /**
   * <pre>
   * Name: JKOBCBECAAM
   * CmdId: 4522
   * </pre>
   *
   * Protobuf type {@code HomeGetGroupRecordRsp}
   */
  public static final class HomeGetGroupRecordRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeGetGroupRecordRsp)
      HomeGetGroupRecordRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeGetGroupRecordRsp.newBuilder() to construct.
    private HomeGetGroupRecordRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeGetGroupRecordRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeGetGroupRecordRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeGetGroupRecordRsp(
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

              recordType_ = input.readUInt32();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 98: {
              emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.Builder subBuilder = null;
              if (groupRecord_ != null) {
                subBuilder = groupRecord_.toBuilder();
              }
              groupRecord_ = input.readMessage(emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(groupRecord_);
                groupRecord_ = subBuilder.buildPartial();
              }

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
      return emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.internal_static_HomeGetGroupRecordRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.internal_static_HomeGetGroupRecordRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.class, emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.Builder.class);
    }

    public static final int RECORD_TYPE_FIELD_NUMBER = 7;
    private int recordType_;
    /**
     * <code>uint32 record_type = 7;</code>
     * @return The recordType.
     */
    @java.lang.Override
    public int getRecordType() {
      return recordType_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GROUP_RECORD_FIELD_NUMBER = 12;
    private emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord groupRecord_;
    /**
     * <code>.HomeGroupRecord group_record = 12;</code>
     * @return Whether the groupRecord field is set.
     */
    @java.lang.Override
    public boolean hasGroupRecord() {
      return groupRecord_ != null;
    }
    /**
     * <code>.HomeGroupRecord group_record = 12;</code>
     * @return The groupRecord.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord getGroupRecord() {
      return groupRecord_ == null ? emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.getDefaultInstance() : groupRecord_;
    }
    /**
     * <code>.HomeGroupRecord group_record = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecordOrBuilder getGroupRecordOrBuilder() {
      return getGroupRecord();
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
      if (recordType_ != 0) {
        output.writeUInt32(7, recordType_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (groupRecord_ != null) {
        output.writeMessage(12, getGroupRecord());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (recordType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, recordType_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (groupRecord_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, getGroupRecord());
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp other = (emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp) obj;

      if (getRecordType()
          != other.getRecordType()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
      if (hasGroupRecord() != other.hasGroupRecord()) return false;
      if (hasGroupRecord()) {
        if (!getGroupRecord()
            .equals(other.getGroupRecord())) return false;
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
      hash = (37 * hash) + RECORD_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getRecordType();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      if (hasGroupRecord()) {
        hash = (37 * hash) + GROUP_RECORD_FIELD_NUMBER;
        hash = (53 * hash) + getGroupRecord().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp prototype) {
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
     * Name: JKOBCBECAAM
     * CmdId: 4522
     * </pre>
     *
     * Protobuf type {@code HomeGetGroupRecordRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeGetGroupRecordRsp)
        emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.internal_static_HomeGetGroupRecordRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.internal_static_HomeGetGroupRecordRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.class, emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.newBuilder()
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
        recordType_ = 0;

        retcode_ = 0;

        if (groupRecordBuilder_ == null) {
          groupRecord_ = null;
        } else {
          groupRecord_ = null;
          groupRecordBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.internal_static_HomeGetGroupRecordRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp build() {
        emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp buildPartial() {
        emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp result = new emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp(this);
        result.recordType_ = recordType_;
        result.retcode_ = retcode_;
        if (groupRecordBuilder_ == null) {
          result.groupRecord_ = groupRecord_;
        } else {
          result.groupRecord_ = groupRecordBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp) {
          return mergeFrom((emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp other) {
        if (other == emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp.getDefaultInstance()) return this;
        if (other.getRecordType() != 0) {
          setRecordType(other.getRecordType());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.hasGroupRecord()) {
          mergeGroupRecord(other.getGroupRecord());
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
        emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int recordType_ ;
      /**
       * <code>uint32 record_type = 7;</code>
       * @return The recordType.
       */
      @java.lang.Override
      public int getRecordType() {
        return recordType_;
      }
      /**
       * <code>uint32 record_type = 7;</code>
       * @param value The recordType to set.
       * @return This builder for chaining.
       */
      public Builder setRecordType(int value) {
        
        recordType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 record_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearRecordType() {
        
        recordType_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord groupRecord_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord, emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.Builder, emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecordOrBuilder> groupRecordBuilder_;
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       * @return Whether the groupRecord field is set.
       */
      public boolean hasGroupRecord() {
        return groupRecordBuilder_ != null || groupRecord_ != null;
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       * @return The groupRecord.
       */
      public emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord getGroupRecord() {
        if (groupRecordBuilder_ == null) {
          return groupRecord_ == null ? emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.getDefaultInstance() : groupRecord_;
        } else {
          return groupRecordBuilder_.getMessage();
        }
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      public Builder setGroupRecord(emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord value) {
        if (groupRecordBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          groupRecord_ = value;
          onChanged();
        } else {
          groupRecordBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      public Builder setGroupRecord(
          emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.Builder builderForValue) {
        if (groupRecordBuilder_ == null) {
          groupRecord_ = builderForValue.build();
          onChanged();
        } else {
          groupRecordBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      public Builder mergeGroupRecord(emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord value) {
        if (groupRecordBuilder_ == null) {
          if (groupRecord_ != null) {
            groupRecord_ =
              emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.newBuilder(groupRecord_).mergeFrom(value).buildPartial();
          } else {
            groupRecord_ = value;
          }
          onChanged();
        } else {
          groupRecordBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      public Builder clearGroupRecord() {
        if (groupRecordBuilder_ == null) {
          groupRecord_ = null;
          onChanged();
        } else {
          groupRecord_ = null;
          groupRecordBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.Builder getGroupRecordBuilder() {
        
        onChanged();
        return getGroupRecordFieldBuilder().getBuilder();
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      public emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecordOrBuilder getGroupRecordOrBuilder() {
        if (groupRecordBuilder_ != null) {
          return groupRecordBuilder_.getMessageOrBuilder();
        } else {
          return groupRecord_ == null ?
              emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.getDefaultInstance() : groupRecord_;
        }
      }
      /**
       * <code>.HomeGroupRecord group_record = 12;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord, emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.Builder, emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecordOrBuilder> 
          getGroupRecordFieldBuilder() {
        if (groupRecordBuilder_ == null) {
          groupRecordBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord, emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecord.Builder, emu.grasscutter.net.proto.HomeGroupRecordOuterClass.HomeGroupRecordOrBuilder>(
                  getGroupRecord(),
                  getParentForChildren(),
                  isClean());
          groupRecord_ = null;
        }
        return groupRecordBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeGetGroupRecordRsp)
    }

    // @@protoc_insertion_point(class_scope:HomeGetGroupRecordRsp)
    private static final emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp();
    }

    public static emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeGetGroupRecordRsp>
        PARSER = new com.google.protobuf.AbstractParser<HomeGetGroupRecordRsp>() {
      @java.lang.Override
      public HomeGetGroupRecordRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeGetGroupRecordRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeGetGroupRecordRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeGetGroupRecordRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeGetGroupRecordRspOuterClass.HomeGetGroupRecordRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeGetGroupRecordRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeGetGroupRecordRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033HomeGetGroupRecordRsp.proto\032\025HomeGroup" +
      "Record.proto\"e\n\025HomeGetGroupRecordRsp\022\023\n" +
      "\013record_type\030\007 \001(\r\022\017\n\007retcode\030\t \001(\005\022&\n\014g" +
      "roup_record\030\014 \001(\0132\020.HomeGroupRecordB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeGroupRecordOuterClass.getDescriptor(),
        });
    internal_static_HomeGetGroupRecordRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeGetGroupRecordRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeGetGroupRecordRsp_descriptor,
        new java.lang.String[] { "RecordType", "Retcode", "GroupRecord", });
    emu.grasscutter.net.proto.HomeGroupRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
