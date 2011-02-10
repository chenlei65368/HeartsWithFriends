// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Round.proto

package org.bitcoma.hearts.model.transfered;

public final class RoundProtos {
  private RoundProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RoundStartedResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional uint64 passed_to_user_id = 1;
    boolean hasPassedToUserId();
    long getPassedToUserId();
    
    // optional uint64 user_id = 2;
    boolean hasUserId();
    long getUserId();
    
    // repeated .hearts.Card cards = 3;
    java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> 
        getCardsList();
    org.bitcoma.hearts.model.transfered.CardProtos.Card getCards(int index);
    int getCardsCount();
    java.util.List<? extends org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder> 
        getCardsOrBuilderList();
    org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder getCardsOrBuilder(
        int index);
  }
  public static final class RoundStartedResponse extends
      com.google.protobuf.GeneratedMessage
      implements RoundStartedResponseOrBuilder {
    // Use RoundStartedResponse.newBuilder() to construct.
    private RoundStartedResponse(Builder builder) {
      super(builder);
    }
    private RoundStartedResponse(boolean noInit) {}
    
    private static final RoundStartedResponse defaultInstance;
    public static RoundStartedResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public RoundStartedResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundStartedResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundStartedResponse_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional uint64 passed_to_user_id = 1;
    public static final int PASSED_TO_USER_ID_FIELD_NUMBER = 1;
    private long passedToUserId_;
    public boolean hasPassedToUserId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public long getPassedToUserId() {
      return passedToUserId_;
    }
    
    // optional uint64 user_id = 2;
    public static final int USER_ID_FIELD_NUMBER = 2;
    private long userId_;
    public boolean hasUserId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getUserId() {
      return userId_;
    }
    
    // repeated .hearts.Card cards = 3;
    public static final int CARDS_FIELD_NUMBER = 3;
    private java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> cards_;
    public java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> getCardsList() {
      return cards_;
    }
    public java.util.List<? extends org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder> 
        getCardsOrBuilderList() {
      return cards_;
    }
    public int getCardsCount() {
      return cards_.size();
    }
    public org.bitcoma.hearts.model.transfered.CardProtos.Card getCards(int index) {
      return cards_.get(index);
    }
    public org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder getCardsOrBuilder(
        int index) {
      return cards_.get(index);
    }
    
    private void initFields() {
      passedToUserId_ = 0L;
      userId_ = 0L;
      cards_ = java.util.Collections.emptyList();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeUInt64(1, passedToUserId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeUInt64(2, userId_);
      }
      for (int i = 0; i < cards_.size(); i++) {
        output.writeMessage(3, cards_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, passedToUserId_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, userId_);
      }
      for (int i = 0; i < cards_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, cards_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundStartedResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundStartedResponse_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getCardsFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        passedToUserId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        userId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        if (cardsBuilder_ == null) {
          cards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          cardsBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse.getDescriptor();
      }
      
      public org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse getDefaultInstanceForType() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse.getDefaultInstance();
      }
      
      public org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse build() {
        org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse buildPartial() {
        org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse result = new org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.passedToUserId_ = passedToUserId_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.userId_ = userId_;
        if (cardsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            cards_ = java.util.Collections.unmodifiableList(cards_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.cards_ = cards_;
        } else {
          result.cards_ = cardsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse) {
          return mergeFrom((org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse other) {
        if (other == org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse.getDefaultInstance()) return this;
        if (other.hasPassedToUserId()) {
          setPassedToUserId(other.getPassedToUserId());
        }
        if (other.hasUserId()) {
          setUserId(other.getUserId());
        }
        if (cardsBuilder_ == null) {
          if (!other.cards_.isEmpty()) {
            if (cards_.isEmpty()) {
              cards_ = other.cards_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensureCardsIsMutable();
              cards_.addAll(other.cards_);
            }
            onChanged();
          }
        } else {
          if (!other.cards_.isEmpty()) {
            if (cardsBuilder_.isEmpty()) {
              cardsBuilder_.dispose();
              cardsBuilder_ = null;
              cards_ = other.cards_;
              bitField0_ = (bitField0_ & ~0x00000004);
              cardsBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getCardsFieldBuilder() : null;
            } else {
              cardsBuilder_.addAllMessages(other.cards_);
            }
          }
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              passedToUserId_ = input.readUInt64();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              userId_ = input.readUInt64();
              break;
            }
            case 26: {
              org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder subBuilder = org.bitcoma.hearts.model.transfered.CardProtos.Card.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addCards(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional uint64 passed_to_user_id = 1;
      private long passedToUserId_ ;
      public boolean hasPassedToUserId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public long getPassedToUserId() {
        return passedToUserId_;
      }
      public Builder setPassedToUserId(long value) {
        bitField0_ |= 0x00000001;
        passedToUserId_ = value;
        onChanged();
        return this;
      }
      public Builder clearPassedToUserId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        passedToUserId_ = 0L;
        onChanged();
        return this;
      }
      
      // optional uint64 user_id = 2;
      private long userId_ ;
      public boolean hasUserId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getUserId() {
        return userId_;
      }
      public Builder setUserId(long value) {
        bitField0_ |= 0x00000002;
        userId_ = value;
        onChanged();
        return this;
      }
      public Builder clearUserId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        userId_ = 0L;
        onChanged();
        return this;
      }
      
      // repeated .hearts.Card cards = 3;
      private java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> cards_ =
        java.util.Collections.emptyList();
      private void ensureCardsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          cards_ = new java.util.ArrayList<org.bitcoma.hearts.model.transfered.CardProtos.Card>(cards_);
          bitField0_ |= 0x00000004;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          org.bitcoma.hearts.model.transfered.CardProtos.Card, org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder, org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder> cardsBuilder_;
      
      public java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> getCardsList() {
        if (cardsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cards_);
        } else {
          return cardsBuilder_.getMessageList();
        }
      }
      public int getCardsCount() {
        if (cardsBuilder_ == null) {
          return cards_.size();
        } else {
          return cardsBuilder_.getCount();
        }
      }
      public org.bitcoma.hearts.model.transfered.CardProtos.Card getCards(int index) {
        if (cardsBuilder_ == null) {
          return cards_.get(index);
        } else {
          return cardsBuilder_.getMessage(index);
        }
      }
      public Builder setCards(
          int index, org.bitcoma.hearts.model.transfered.CardProtos.Card value) {
        if (cardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardsIsMutable();
          cards_.set(index, value);
          onChanged();
        } else {
          cardsBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setCards(
          int index, org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder builderForValue) {
        if (cardsBuilder_ == null) {
          ensureCardsIsMutable();
          cards_.set(index, builderForValue.build());
          onChanged();
        } else {
          cardsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addCards(org.bitcoma.hearts.model.transfered.CardProtos.Card value) {
        if (cardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardsIsMutable();
          cards_.add(value);
          onChanged();
        } else {
          cardsBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addCards(
          int index, org.bitcoma.hearts.model.transfered.CardProtos.Card value) {
        if (cardsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCardsIsMutable();
          cards_.add(index, value);
          onChanged();
        } else {
          cardsBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addCards(
          org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder builderForValue) {
        if (cardsBuilder_ == null) {
          ensureCardsIsMutable();
          cards_.add(builderForValue.build());
          onChanged();
        } else {
          cardsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addCards(
          int index, org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder builderForValue) {
        if (cardsBuilder_ == null) {
          ensureCardsIsMutable();
          cards_.add(index, builderForValue.build());
          onChanged();
        } else {
          cardsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllCards(
          java.lang.Iterable<? extends org.bitcoma.hearts.model.transfered.CardProtos.Card> values) {
        if (cardsBuilder_ == null) {
          ensureCardsIsMutable();
          super.addAll(values, cards_);
          onChanged();
        } else {
          cardsBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearCards() {
        if (cardsBuilder_ == null) {
          cards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          cardsBuilder_.clear();
        }
        return this;
      }
      public Builder removeCards(int index) {
        if (cardsBuilder_ == null) {
          ensureCardsIsMutable();
          cards_.remove(index);
          onChanged();
        } else {
          cardsBuilder_.remove(index);
        }
        return this;
      }
      public org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder getCardsBuilder(
          int index) {
        return getCardsFieldBuilder().getBuilder(index);
      }
      public org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder getCardsOrBuilder(
          int index) {
        if (cardsBuilder_ == null) {
          return cards_.get(index);  } else {
          return cardsBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder> 
           getCardsOrBuilderList() {
        if (cardsBuilder_ != null) {
          return cardsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cards_);
        }
      }
      public org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder addCardsBuilder() {
        return getCardsFieldBuilder().addBuilder(
            org.bitcoma.hearts.model.transfered.CardProtos.Card.getDefaultInstance());
      }
      public org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder addCardsBuilder(
          int index) {
        return getCardsFieldBuilder().addBuilder(
            index, org.bitcoma.hearts.model.transfered.CardProtos.Card.getDefaultInstance());
      }
      public java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder> 
           getCardsBuilderList() {
        return getCardsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          org.bitcoma.hearts.model.transfered.CardProtos.Card, org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder, org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder> 
          getCardsFieldBuilder() {
        if (cardsBuilder_ == null) {
          cardsBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              org.bitcoma.hearts.model.transfered.CardProtos.Card, org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder, org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder>(
                  cards_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          cards_ = null;
        }
        return cardsBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:hearts.RoundStartedResponse)
    }
    
    static {
      defaultInstance = new RoundStartedResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:hearts.RoundStartedResponse)
  }
  
  public interface RoundEndedResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  public static final class RoundEndedResponse extends
      com.google.protobuf.GeneratedMessage
      implements RoundEndedResponseOrBuilder {
    // Use RoundEndedResponse.newBuilder() to construct.
    private RoundEndedResponse(Builder builder) {
      super(builder);
    }
    private RoundEndedResponse(boolean noInit) {}
    
    private static final RoundEndedResponse defaultInstance;
    public static RoundEndedResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public RoundEndedResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundEndedResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundEndedResponse_fieldAccessorTable;
    }
    
    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundEndedResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.internal_static_hearts_RoundEndedResponse_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse.getDescriptor();
      }
      
      public org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse getDefaultInstanceForType() {
        return org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse.getDefaultInstance();
      }
      
      public org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse build() {
        org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse buildPartial() {
        org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse result = new org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse(this);
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse) {
          return mergeFrom((org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse other) {
        if (other == org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
          }
        }
      }
      
      
      // @@protoc_insertion_point(builder_scope:hearts.RoundEndedResponse)
    }
    
    static {
      defaultInstance = new RoundEndedResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:hearts.RoundEndedResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearts_RoundStartedResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearts_RoundStartedResponse_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearts_RoundEndedResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearts_RoundEndedResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Round.proto\022\006hearts\032\nCard.proto\"_\n\024Rou" +
      "ndStartedResponse\022\031\n\021passed_to_user_id\030\001" +
      " \001(\004\022\017\n\007user_id\030\002 \001(\004\022\033\n\005cards\030\003 \003(\0132\014.h" +
      "earts.Card\"\024\n\022RoundEndedResponseB4\n#org." +
      "bitcoma.hearts.model.transferedB\013RoundPr" +
      "otosH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hearts_RoundStartedResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hearts_RoundStartedResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearts_RoundStartedResponse_descriptor,
              new java.lang.String[] { "PassedToUserId", "UserId", "Cards", },
              org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse.class,
              org.bitcoma.hearts.model.transfered.RoundProtos.RoundStartedResponse.Builder.class);
          internal_static_hearts_RoundEndedResponse_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_hearts_RoundEndedResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearts_RoundEndedResponse_descriptor,
              new java.lang.String[] { },
              org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse.class,
              org.bitcoma.hearts.model.transfered.RoundProtos.RoundEndedResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.bitcoma.hearts.model.transfered.CardProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}