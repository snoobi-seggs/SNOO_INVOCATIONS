// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: WorldOwnerDailyTaskNotify.proto

package emu.grasscutter.net.proto;

public final class WorldOwnerDailyTaskNotifyOuterClass {
  private WorldOwnerDailyTaskNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface WorldOwnerDailyTaskNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:WorldOwnerDailyTaskNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *CDFPMDEEHKO snooyuki
     * </pre>
     *
     * <code>uint32 finished_daily_task_num = 10;</code>
     * @return The finishedDailyTaskNum.
     */
    int getFinishedDailyTaskNum();

    /**
     * <pre>
     *DOCJEPPBKOH snooyuki
     * </pre>
     *
     * <code>uint32 filter_city_id = 8;</code>
     * @return The filterCityId.
     */
    int getFilterCityId();

    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    java.util.List<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo> 
        getTaskListList();
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getTaskList(int index);
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    int getTaskListCount();
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
        getTaskListOrBuilderList();
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder getTaskListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Name: IHPCDCEIDJD
   * CmdId: 130
   * </pre>
   *
   * Protobuf type {@code WorldOwnerDailyTaskNotify}
   */
  public static final class WorldOwnerDailyTaskNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:WorldOwnerDailyTaskNotify)
      WorldOwnerDailyTaskNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use WorldOwnerDailyTaskNotify.newBuilder() to construct.
    private WorldOwnerDailyTaskNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private WorldOwnerDailyTaskNotify() {
      taskList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new WorldOwnerDailyTaskNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private WorldOwnerDailyTaskNotify(
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
            case 50: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                taskList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              taskList_.add(
                  input.readMessage(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.parser(), extensionRegistry));
              break;
            }
            case 64: {

              filterCityId_ = input.readUInt32();
              break;
            }
            case 80: {

              finishedDailyTaskNum_ = input.readUInt32();
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
          taskList_ = java.util.Collections.unmodifiableList(taskList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.class, emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.Builder.class);
    }

    public static final int FINISHED_DAILY_TASK_NUM_FIELD_NUMBER = 10;
    private int finishedDailyTaskNum_;
    /**
     * <pre>
     *CDFPMDEEHKO snooyuki
     * </pre>
     *
     * <code>uint32 finished_daily_task_num = 10;</code>
     * @return The finishedDailyTaskNum.
     */
    @java.lang.Override
    public int getFinishedDailyTaskNum() {
      return finishedDailyTaskNum_;
    }

    public static final int FILTER_CITY_ID_FIELD_NUMBER = 8;
    private int filterCityId_;
    /**
     * <pre>
     *DOCJEPPBKOH snooyuki
     * </pre>
     *
     * <code>uint32 filter_city_id = 8;</code>
     * @return The filterCityId.
     */
    @java.lang.Override
    public int getFilterCityId() {
      return filterCityId_;
    }

    public static final int TASK_LIST_FIELD_NUMBER = 6;
    private java.util.List<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo> taskList_;
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo> getTaskListList() {
      return taskList_;
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
        getTaskListOrBuilderList() {
      return taskList_;
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    @java.lang.Override
    public int getTaskListCount() {
      return taskList_.size();
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getTaskList(int index) {
      return taskList_.get(index);
    }
    /**
     * <code>repeated .DailyTaskInfo task_list = 6;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder getTaskListOrBuilder(
        int index) {
      return taskList_.get(index);
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
      for (int i = 0; i < taskList_.size(); i++) {
        output.writeMessage(6, taskList_.get(i));
      }
      if (filterCityId_ != 0) {
        output.writeUInt32(8, filterCityId_);
      }
      if (finishedDailyTaskNum_ != 0) {
        output.writeUInt32(10, finishedDailyTaskNum_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < taskList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(6, taskList_.get(i));
      }
      if (filterCityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(8, filterCityId_);
      }
      if (finishedDailyTaskNum_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, finishedDailyTaskNum_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify other = (emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify) obj;

      if (getFinishedDailyTaskNum()
          != other.getFinishedDailyTaskNum()) return false;
      if (getFilterCityId()
          != other.getFilterCityId()) return false;
      if (!getTaskListList()
          .equals(other.getTaskListList())) return false;
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
      hash = (37 * hash) + FINISHED_DAILY_TASK_NUM_FIELD_NUMBER;
      hash = (53 * hash) + getFinishedDailyTaskNum();
      hash = (37 * hash) + FILTER_CITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getFilterCityId();
      if (getTaskListCount() > 0) {
        hash = (37 * hash) + TASK_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getTaskListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify prototype) {
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
     * Name: IHPCDCEIDJD
     * CmdId: 130
     * </pre>
     *
     * Protobuf type {@code WorldOwnerDailyTaskNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:WorldOwnerDailyTaskNotify)
        emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.class, emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.newBuilder()
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
          getTaskListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        finishedDailyTaskNum_ = 0;

        filterCityId_ = 0;

        if (taskListBuilder_ == null) {
          taskList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          taskListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.internal_static_WorldOwnerDailyTaskNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify build() {
        emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify buildPartial() {
        emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify result = new emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify(this);
        int from_bitField0_ = bitField0_;
        result.finishedDailyTaskNum_ = finishedDailyTaskNum_;
        result.filterCityId_ = filterCityId_;
        if (taskListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            taskList_ = java.util.Collections.unmodifiableList(taskList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.taskList_ = taskList_;
        } else {
          result.taskList_ = taskListBuilder_.build();
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
        if (other instanceof emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify) {
          return mergeFrom((emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify other) {
        if (other == emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify.getDefaultInstance()) return this;
        if (other.getFinishedDailyTaskNum() != 0) {
          setFinishedDailyTaskNum(other.getFinishedDailyTaskNum());
        }
        if (other.getFilterCityId() != 0) {
          setFilterCityId(other.getFilterCityId());
        }
        if (taskListBuilder_ == null) {
          if (!other.taskList_.isEmpty()) {
            if (taskList_.isEmpty()) {
              taskList_ = other.taskList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTaskListIsMutable();
              taskList_.addAll(other.taskList_);
            }
            onChanged();
          }
        } else {
          if (!other.taskList_.isEmpty()) {
            if (taskListBuilder_.isEmpty()) {
              taskListBuilder_.dispose();
              taskListBuilder_ = null;
              taskList_ = other.taskList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              taskListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTaskListFieldBuilder() : null;
            } else {
              taskListBuilder_.addAllMessages(other.taskList_);
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
        emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int finishedDailyTaskNum_ ;
      /**
       * <pre>
       *CDFPMDEEHKO snooyuki
       * </pre>
       *
       * <code>uint32 finished_daily_task_num = 10;</code>
       * @return The finishedDailyTaskNum.
       */
      @java.lang.Override
      public int getFinishedDailyTaskNum() {
        return finishedDailyTaskNum_;
      }
      /**
       * <pre>
       *CDFPMDEEHKO snooyuki
       * </pre>
       *
       * <code>uint32 finished_daily_task_num = 10;</code>
       * @param value The finishedDailyTaskNum to set.
       * @return This builder for chaining.
       */
      public Builder setFinishedDailyTaskNum(int value) {
        
        finishedDailyTaskNum_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *CDFPMDEEHKO snooyuki
       * </pre>
       *
       * <code>uint32 finished_daily_task_num = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearFinishedDailyTaskNum() {
        
        finishedDailyTaskNum_ = 0;
        onChanged();
        return this;
      }

      private int filterCityId_ ;
      /**
       * <pre>
       *DOCJEPPBKOH snooyuki
       * </pre>
       *
       * <code>uint32 filter_city_id = 8;</code>
       * @return The filterCityId.
       */
      @java.lang.Override
      public int getFilterCityId() {
        return filterCityId_;
      }
      /**
       * <pre>
       *DOCJEPPBKOH snooyuki
       * </pre>
       *
       * <code>uint32 filter_city_id = 8;</code>
       * @param value The filterCityId to set.
       * @return This builder for chaining.
       */
      public Builder setFilterCityId(int value) {
        
        filterCityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *DOCJEPPBKOH snooyuki
       * </pre>
       *
       * <code>uint32 filter_city_id = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilterCityId() {
        
        filterCityId_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo> taskList_ =
        java.util.Collections.emptyList();
      private void ensureTaskListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          taskList_ = new java.util.ArrayList<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo>(taskList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> taskListBuilder_;

      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo> getTaskListList() {
        if (taskListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(taskList_);
        } else {
          return taskListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public int getTaskListCount() {
        if (taskListBuilder_ == null) {
          return taskList_.size();
        } else {
          return taskListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo getTaskList(int index) {
        if (taskListBuilder_ == null) {
          return taskList_.get(index);
        } else {
          return taskListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder setTaskList(
          int index, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo value) {
        if (taskListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskListIsMutable();
          taskList_.set(index, value);
          onChanged();
        } else {
          taskListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder setTaskList(
          int index, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder builderForValue) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.set(index, builderForValue.build());
          onChanged();
        } else {
          taskListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder addTaskList(emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo value) {
        if (taskListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskListIsMutable();
          taskList_.add(value);
          onChanged();
        } else {
          taskListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder addTaskList(
          int index, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo value) {
        if (taskListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTaskListIsMutable();
          taskList_.add(index, value);
          onChanged();
        } else {
          taskListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder addTaskList(
          emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder builderForValue) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.add(builderForValue.build());
          onChanged();
        } else {
          taskListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder addTaskList(
          int index, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder builderForValue) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.add(index, builderForValue.build());
          onChanged();
        } else {
          taskListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder addAllTaskList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo> values) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, taskList_);
          onChanged();
        } else {
          taskListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder clearTaskList() {
        if (taskListBuilder_ == null) {
          taskList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          taskListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public Builder removeTaskList(int index) {
        if (taskListBuilder_ == null) {
          ensureTaskListIsMutable();
          taskList_.remove(index);
          onChanged();
        } else {
          taskListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder getTaskListBuilder(
          int index) {
        return getTaskListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder getTaskListOrBuilder(
          int index) {
        if (taskListBuilder_ == null) {
          return taskList_.get(index);  } else {
          return taskListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
           getTaskListOrBuilderList() {
        if (taskListBuilder_ != null) {
          return taskListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(taskList_);
        }
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder addTaskListBuilder() {
        return getTaskListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder addTaskListBuilder(
          int index) {
        return getTaskListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.getDefaultInstance());
      }
      /**
       * <code>repeated .DailyTaskInfo task_list = 6;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder> 
           getTaskListBuilderList() {
        return getTaskListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder> 
          getTaskListFieldBuilder() {
        if (taskListBuilder_ == null) {
          taskListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfo.Builder, emu.grasscutter.net.proto.DailyTaskInfoOuterClass.DailyTaskInfoOrBuilder>(
                  taskList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          taskList_ = null;
        }
        return taskListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:WorldOwnerDailyTaskNotify)
    }

    // @@protoc_insertion_point(class_scope:WorldOwnerDailyTaskNotify)
    private static final emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify();
    }

    public static emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<WorldOwnerDailyTaskNotify>
        PARSER = new com.google.protobuf.AbstractParser<WorldOwnerDailyTaskNotify>() {
      @java.lang.Override
      public WorldOwnerDailyTaskNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new WorldOwnerDailyTaskNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<WorldOwnerDailyTaskNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<WorldOwnerDailyTaskNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.WorldOwnerDailyTaskNotifyOuterClass.WorldOwnerDailyTaskNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_WorldOwnerDailyTaskNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037WorldOwnerDailyTaskNotify.proto\032\023Daily" +
      "TaskInfo.proto\"w\n\031WorldOwnerDailyTaskNot" +
      "ify\022\037\n\027finished_daily_task_num\030\n \001(\r\022\026\n\016" +
      "filter_city_id\030\010 \001(\r\022!\n\ttask_list\030\006 \003(\0132" +
      "\016.DailyTaskInfoB\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.DailyTaskInfoOuterClass.getDescriptor(),
        });
    internal_static_WorldOwnerDailyTaskNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_WorldOwnerDailyTaskNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_WorldOwnerDailyTaskNotify_descriptor,
        new java.lang.String[] { "FinishedDailyTaskNum", "FilterCityId", "TaskList", });
    emu.grasscutter.net.proto.DailyTaskInfoOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}