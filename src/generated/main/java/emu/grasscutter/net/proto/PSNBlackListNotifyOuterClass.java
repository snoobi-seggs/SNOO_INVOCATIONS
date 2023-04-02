// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PSNBlackListNotify.proto

package emu.grasscutter.net.proto;

public final class PSNBlackListNotifyOuterClass {
  private PSNBlackListNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PSNBlackListNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PSNBlackListNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> 
        getPsnBlacklistList();
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getPsnBlacklist(int index);
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    int getPsnBlacklistCount();
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getPsnBlacklistOrBuilderList();
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getPsnBlacklistOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: LMHNPPGHGAC
   * CmdId: 4008
   * </pre>
   *
   * Protobuf type {@code PSNBlackListNotify}
   */
  public static final class PSNBlackListNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PSNBlackListNotify)
      PSNBlackListNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PSNBlackListNotify.newBuilder() to construct.
    private PSNBlackListNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PSNBlackListNotify() {
      psnBlacklist_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PSNBlackListNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PSNBlackListNotify(
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
            case 90: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                psnBlacklist_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>();
                mutable_bitField0_ |= 0x00000001;
              }
              psnBlacklist_.add(
                  input.readMessage(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.parser(), extensionRegistry));
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
          psnBlacklist_ = java.util.Collections.unmodifiableList(psnBlacklist_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.internal_static_PSNBlackListNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.internal_static_PSNBlackListNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.class, emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.Builder.class);
    }

    public static final int PSN_BLACKLIST_FIELD_NUMBER = 11;
    private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> psnBlacklist_;
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getPsnBlacklistList() {
      return psnBlacklist_;
    }
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
        getPsnBlacklistOrBuilderList() {
      return psnBlacklist_;
    }
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    @java.lang.Override
    public int getPsnBlacklistCount() {
      return psnBlacklist_.size();
    }
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getPsnBlacklist(int index) {
      return psnBlacklist_.get(index);
    }
    /**
     * <code>repeated .FriendBrief psn_blacklist = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getPsnBlacklistOrBuilder(
        int index) {
      return psnBlacklist_.get(index);
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
      for (int i = 0; i < psnBlacklist_.size(); i++) {
        output.writeMessage(11, psnBlacklist_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < psnBlacklist_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, psnBlacklist_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify other = (emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify) obj;

      if (!getPsnBlacklistList()
          .equals(other.getPsnBlacklistList())) return false;
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
      if (getPsnBlacklistCount() > 0) {
        hash = (37 * hash) + PSN_BLACKLIST_FIELD_NUMBER;
        hash = (53 * hash) + getPsnBlacklistList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify prototype) {
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
     * Name: LMHNPPGHGAC
     * CmdId: 4008
     * </pre>
     *
     * Protobuf type {@code PSNBlackListNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PSNBlackListNotify)
        emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.internal_static_PSNBlackListNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.internal_static_PSNBlackListNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.class, emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.newBuilder()
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
          getPsnBlacklistFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (psnBlacklistBuilder_ == null) {
          psnBlacklist_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          psnBlacklistBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.internal_static_PSNBlackListNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify build() {
        emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify buildPartial() {
        emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify result = new emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify(this);
        int from_bitField0_ = bitField0_;
        if (psnBlacklistBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            psnBlacklist_ = java.util.Collections.unmodifiableList(psnBlacklist_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.psnBlacklist_ = psnBlacklist_;
        } else {
          result.psnBlacklist_ = psnBlacklistBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify) {
          return mergeFrom((emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify other) {
        if (other == emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify.getDefaultInstance()) return this;
        if (psnBlacklistBuilder_ == null) {
          if (!other.psnBlacklist_.isEmpty()) {
            if (psnBlacklist_.isEmpty()) {
              psnBlacklist_ = other.psnBlacklist_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePsnBlacklistIsMutable();
              psnBlacklist_.addAll(other.psnBlacklist_);
            }
            onChanged();
          }
        } else {
          if (!other.psnBlacklist_.isEmpty()) {
            if (psnBlacklistBuilder_.isEmpty()) {
              psnBlacklistBuilder_.dispose();
              psnBlacklistBuilder_ = null;
              psnBlacklist_ = other.psnBlacklist_;
              bitField0_ = (bitField0_ & ~0x00000001);
              psnBlacklistBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPsnBlacklistFieldBuilder() : null;
            } else {
              psnBlacklistBuilder_.addAllMessages(other.psnBlacklist_);
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
        emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> psnBlacklist_ =
        java.util.Collections.emptyList();
      private void ensurePsnBlacklistIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          psnBlacklist_ = new java.util.ArrayList<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief>(psnBlacklist_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> psnBlacklistBuilder_;

      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> getPsnBlacklistList() {
        if (psnBlacklistBuilder_ == null) {
          return java.util.Collections.unmodifiableList(psnBlacklist_);
        } else {
          return psnBlacklistBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public int getPsnBlacklistCount() {
        if (psnBlacklistBuilder_ == null) {
          return psnBlacklist_.size();
        } else {
          return psnBlacklistBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief getPsnBlacklist(int index) {
        if (psnBlacklistBuilder_ == null) {
          return psnBlacklist_.get(index);
        } else {
          return psnBlacklistBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder setPsnBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (psnBlacklistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.set(index, value);
          onChanged();
        } else {
          psnBlacklistBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder setPsnBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (psnBlacklistBuilder_ == null) {
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.set(index, builderForValue.build());
          onChanged();
        } else {
          psnBlacklistBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder addPsnBlacklist(emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (psnBlacklistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.add(value);
          onChanged();
        } else {
          psnBlacklistBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder addPsnBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief value) {
        if (psnBlacklistBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.add(index, value);
          onChanged();
        } else {
          psnBlacklistBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder addPsnBlacklist(
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (psnBlacklistBuilder_ == null) {
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.add(builderForValue.build());
          onChanged();
        } else {
          psnBlacklistBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder addPsnBlacklist(
          int index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder builderForValue) {
        if (psnBlacklistBuilder_ == null) {
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.add(index, builderForValue.build());
          onChanged();
        } else {
          psnBlacklistBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder addAllPsnBlacklist(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief> values) {
        if (psnBlacklistBuilder_ == null) {
          ensurePsnBlacklistIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, psnBlacklist_);
          onChanged();
        } else {
          psnBlacklistBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder clearPsnBlacklist() {
        if (psnBlacklistBuilder_ == null) {
          psnBlacklist_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          psnBlacklistBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public Builder removePsnBlacklist(int index) {
        if (psnBlacklistBuilder_ == null) {
          ensurePsnBlacklistIsMutable();
          psnBlacklist_.remove(index);
          onChanged();
        } else {
          psnBlacklistBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder getPsnBlacklistBuilder(
          int index) {
        return getPsnBlacklistFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder getPsnBlacklistOrBuilder(
          int index) {
        if (psnBlacklistBuilder_ == null) {
          return psnBlacklist_.get(index);  } else {
          return psnBlacklistBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
           getPsnBlacklistOrBuilderList() {
        if (psnBlacklistBuilder_ != null) {
          return psnBlacklistBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(psnBlacklist_);
        }
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addPsnBlacklistBuilder() {
        return getPsnBlacklistFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder addPsnBlacklistBuilder(
          int index) {
        return getPsnBlacklistFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.getDefaultInstance());
      }
      /**
       * <code>repeated .FriendBrief psn_blacklist = 11;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder> 
           getPsnBlacklistBuilderList() {
        return getPsnBlacklistFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder> 
          getPsnBlacklistFieldBuilder() {
        if (psnBlacklistBuilder_ == null) {
          psnBlacklistBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBrief.Builder, emu.grasscutter.net.proto.FriendBriefOuterClass.FriendBriefOrBuilder>(
                  psnBlacklist_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          psnBlacklist_ = null;
        }
        return psnBlacklistBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PSNBlackListNotify)
    }

    // @@protoc_insertion_point(class_scope:PSNBlackListNotify)
    private static final emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify();
    }

    public static emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PSNBlackListNotify>
        PARSER = new com.google.protobuf.AbstractParser<PSNBlackListNotify>() {
      @java.lang.Override
      public PSNBlackListNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PSNBlackListNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PSNBlackListNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PSNBlackListNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PSNBlackListNotifyOuterClass.PSNBlackListNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PSNBlackListNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PSNBlackListNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030PSNBlackListNotify.proto\032\021FriendBrief." +
      "proto\"9\n\022PSNBlackListNotify\022#\n\rpsn_black" +
      "list\030\013 \003(\0132\014.FriendBriefB\033\n\031emu.grasscut" +
      "ter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor(),
        });
    internal_static_PSNBlackListNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PSNBlackListNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PSNBlackListNotify_descriptor,
        new java.lang.String[] { "PsnBlacklist", });
    emu.grasscutter.net.proto.FriendBriefOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
