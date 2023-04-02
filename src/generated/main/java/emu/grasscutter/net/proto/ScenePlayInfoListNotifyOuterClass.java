// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ScenePlayInfoListNotify.proto

package emu.grasscutter.net.proto;

public final class ScenePlayInfoListNotifyOuterClass {
  private ScenePlayInfoListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ScenePlayInfoListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ScenePlayInfoListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    java.util.List<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo> 
        getPlayInfoListList();
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo getPlayInfoList(int index);
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    int getPlayInfoListCount();
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder> 
        getPlayInfoListOrBuilderList();
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder getPlayInfoListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: LDAFPKHDHGH
   * CmdId: 4409
   * </pre>
   *
   * Protobuf type {@code ScenePlayInfoListNotify}
   */
  public static final class ScenePlayInfoListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ScenePlayInfoListNotify)
      ScenePlayInfoListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ScenePlayInfoListNotify.newBuilder() to construct.
    private ScenePlayInfoListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ScenePlayInfoListNotify() {
      playInfoList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ScenePlayInfoListNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ScenePlayInfoListNotify(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 58: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                playInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              playInfoList_.add(
                  input.readMessage(emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.parser(), extensionRegistry));
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          playInfoList_ = java.util.Collections.unmodifiableList(playInfoList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.internal_static_ScenePlayInfoListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.internal_static_ScenePlayInfoListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.class, emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.Builder.class);
    }

    public static final int PLAY_INFO_LIST_FIELD_NUMBER = 7;
    private java.util.List<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo> playInfoList_;
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo> getPlayInfoListList() {
      return playInfoList_;
    }
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder> 
        getPlayInfoListOrBuilderList() {
      return playInfoList_;
    }
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    @java.lang.Override
    public int getPlayInfoListCount() {
      return playInfoList_.size();
    }
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo getPlayInfoList(int index) {
      return playInfoList_.get(index);
    }
    /**
     * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder getPlayInfoListOrBuilder(
        int index) {
      return playInfoList_.get(index);
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
      for (int i = 0; i < playInfoList_.size(); i++) {
        output.writeMessage(7, playInfoList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < playInfoList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, playInfoList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify other = (emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify) obj;

      if (!getPlayInfoListList()
          .equals(other.getPlayInfoListList())) return false;
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
      if (getPlayInfoListCount() > 0) {
        hash = (37 * hash) + PLAY_INFO_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPlayInfoListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify prototype) {
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
     * Name: LDAFPKHDHGH
     * CmdId: 4409
     * </pre>
     *
     * Protobuf type {@code ScenePlayInfoListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ScenePlayInfoListNotify)
        emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.internal_static_ScenePlayInfoListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.internal_static_ScenePlayInfoListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.class, emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.newBuilder()
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
          getPlayInfoListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (playInfoListBuilder_ == null) {
          playInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          playInfoListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.internal_static_ScenePlayInfoListNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify build() {
        emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify buildPartial() {
        emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify result = new emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify(this);
        int from_bitField0_ = bitField0_;
        if (playInfoListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            playInfoList_ = java.util.Collections.unmodifiableList(playInfoList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.playInfoList_ = playInfoList_;
        } else {
          result.playInfoList_ = playInfoListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify other) {
        if (other == emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify.getDefaultInstance()) return this;
        if (playInfoListBuilder_ == null) {
          if (!other.playInfoList_.isEmpty()) {
            if (playInfoList_.isEmpty()) {
              playInfoList_ = other.playInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePlayInfoListIsMutable();
              playInfoList_.addAll(other.playInfoList_);
            }
            onChanged();
          }
        } else {
          if (!other.playInfoList_.isEmpty()) {
            if (playInfoListBuilder_.isEmpty()) {
              playInfoListBuilder_.dispose();
              playInfoListBuilder_ = null;
              playInfoList_ = other.playInfoList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              playInfoListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPlayInfoListFieldBuilder() : null;
            } else {
              playInfoListBuilder_.addAllMessages(other.playInfoList_);
            }
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
        emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo> playInfoList_ =
        java.util.Collections.emptyList();
      private void ensurePlayInfoListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          playInfoList_ = new java.util.ArrayList<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo>(playInfoList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder> playInfoListBuilder_;

      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo> getPlayInfoListList() {
        if (playInfoListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(playInfoList_);
        } else {
          return playInfoListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public int getPlayInfoListCount() {
        if (playInfoListBuilder_ == null) {
          return playInfoList_.size();
        } else {
          return playInfoListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo getPlayInfoList(int index) {
        if (playInfoListBuilder_ == null) {
          return playInfoList_.get(index);
        } else {
          return playInfoListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder setPlayInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo value) {
        if (playInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayInfoListIsMutable();
          playInfoList_.set(index, value);
          onChanged();
        } else {
          playInfoListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder setPlayInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder builderForValue) {
        if (playInfoListBuilder_ == null) {
          ensurePlayInfoListIsMutable();
          playInfoList_.set(index, builderForValue.build());
          onChanged();
        } else {
          playInfoListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder addPlayInfoList(emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo value) {
        if (playInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayInfoListIsMutable();
          playInfoList_.add(value);
          onChanged();
        } else {
          playInfoListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder addPlayInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo value) {
        if (playInfoListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePlayInfoListIsMutable();
          playInfoList_.add(index, value);
          onChanged();
        } else {
          playInfoListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder addPlayInfoList(
          emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder builderForValue) {
        if (playInfoListBuilder_ == null) {
          ensurePlayInfoListIsMutable();
          playInfoList_.add(builderForValue.build());
          onChanged();
        } else {
          playInfoListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder addPlayInfoList(
          int index, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder builderForValue) {
        if (playInfoListBuilder_ == null) {
          ensurePlayInfoListIsMutable();
          playInfoList_.add(index, builderForValue.build());
          onChanged();
        } else {
          playInfoListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder addAllPlayInfoList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo> values) {
        if (playInfoListBuilder_ == null) {
          ensurePlayInfoListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, playInfoList_);
          onChanged();
        } else {
          playInfoListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder clearPlayInfoList() {
        if (playInfoListBuilder_ == null) {
          playInfoList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          playInfoListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public Builder removePlayInfoList(int index) {
        if (playInfoListBuilder_ == null) {
          ensurePlayInfoListIsMutable();
          playInfoList_.remove(index);
          onChanged();
        } else {
          playInfoListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder getPlayInfoListBuilder(
          int index) {
        return getPlayInfoListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder getPlayInfoListOrBuilder(
          int index) {
        if (playInfoListBuilder_ == null) {
          return playInfoList_.get(index);  } else {
          return playInfoListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder> 
           getPlayInfoListOrBuilderList() {
        if (playInfoListBuilder_ != null) {
          return playInfoListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(playInfoList_);
        }
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder addPlayInfoListBuilder() {
        return getPlayInfoListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder addPlayInfoListBuilder(
          int index) {
        return getPlayInfoListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .ScenePlayInfo play_info_list = 7;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder> 
           getPlayInfoListBuilderList() {
        return getPlayInfoListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder> 
          getPlayInfoListFieldBuilder() {
        if (playInfoListBuilder_ == null) {
          playInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfo.Builder, emu.grasscutter.net.proto.ScenePlayInfoOuterClass.ScenePlayInfoOrBuilder>(
                  playInfoList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          playInfoList_ = null;
        }
        return playInfoListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:ScenePlayInfoListNotify)
    }

    // @@protoc_insertion_point(class_scope:ScenePlayInfoListNotify)
    private static final emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify();
    }

    public static emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ScenePlayInfoListNotify>
        PARSER = new com.google.protobuf.AbstractParser<ScenePlayInfoListNotify>() {
      @java.lang.Override
      public ScenePlayInfoListNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ScenePlayInfoListNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ScenePlayInfoListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ScenePlayInfoListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ScenePlayInfoListNotifyOuterClass.ScenePlayInfoListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ScenePlayInfoListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ScenePlayInfoListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035ScenePlayInfoListNotify.proto\032\023ScenePl" +
      "ayInfo.proto\"A\n\027ScenePlayInfoListNotify\022" +
      "&\n\016play_info_list\030\007 \003(\0132\016.ScenePlayInfoB" +
      "\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.ScenePlayInfoOuterClass.getDescriptor(),
        });
    internal_static_ScenePlayInfoListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ScenePlayInfoListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ScenePlayInfoListNotify_descriptor,
        new java.lang.String[] { "PlayInfoList", });
    emu.grasscutter.net.proto.ScenePlayInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
