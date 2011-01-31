// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PlayCard.proto

package org.bitcoma.hearts.model.transfered;

public final class PlayCardProtos {
  private PlayCardProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PlayCardRequestOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // repeated .hearts.Card cards = 1;
    java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> 
        getCardsList();
    org.bitcoma.hearts.model.transfered.CardProtos.Card getCards(int index);
    int getCardsCount();
    java.util.List<? extends org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder> 
        getCardsOrBuilderList();
    org.bitcoma.hearts.model.transfered.CardProtos.CardOrBuilder getCardsOrBuilder(
        int index);
  }
  public static final class PlayCardRequest extends
      com.google.protobuf.GeneratedMessage
      implements PlayCardRequestOrBuilder {
    // Use PlayCardRequest.newBuilder() to construct.
    private PlayCardRequest(Builder builder) {
      super(builder);
    }
    private PlayCardRequest(boolean noInit) {}
    
    private static final PlayCardRequest defaultInstance;
    public static PlayCardRequest getDefaultInstance() {
      return defaultInstance;
    }
    
    public PlayCardRequest getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.hearts.model.transfered.PlayCardProtos.internal_static_hearts_PlayCardRequest_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.hearts.model.transfered.PlayCardProtos.internal_static_hearts_PlayCardRequest_fieldAccessorTable;
    }
    
    // repeated .hearts.Card cards = 1;
    public static final int CARDS_FIELD_NUMBER = 1;
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
      for (int i = 0; i < cards_.size(); i++) {
        output.writeMessage(1, cards_.get(i));
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      for (int i = 0; i < cards_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, cards_.get(i));
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseDelimitedFrom(
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
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest prototype) {
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
       implements org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.PlayCardProtos.internal_static_hearts_PlayCardRequest_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.hearts.model.transfered.PlayCardProtos.internal_static_hearts_PlayCardRequest_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest.newBuilder()
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
        if (cardsBuilder_ == null) {
          cards_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
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
        return org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest.getDescriptor();
      }
      
      public org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest getDefaultInstanceForType() {
        return org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest.getDefaultInstance();
      }
      
      public org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest build() {
        org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest buildPartial() {
        org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest result = new org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest(this);
        int from_bitField0_ = bitField0_;
        if (cardsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            cards_ = java.util.Collections.unmodifiableList(cards_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.cards_ = cards_;
        } else {
          result.cards_ = cardsBuilder_.build();
        }
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest) {
          return mergeFrom((org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest other) {
        if (other == org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest.getDefaultInstance()) return this;
        if (cardsBuilder_ == null) {
          if (!other.cards_.isEmpty()) {
            if (cards_.isEmpty()) {
              cards_ = other.cards_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
            case 10: {
              org.bitcoma.hearts.model.transfered.CardProtos.Card.Builder subBuilder = org.bitcoma.hearts.model.transfered.CardProtos.Card.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addCards(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // repeated .hearts.Card cards = 1;
      private java.util.List<org.bitcoma.hearts.model.transfered.CardProtos.Card> cards_ =
        java.util.Collections.emptyList();
      private void ensureCardsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          cards_ = new java.util.ArrayList<org.bitcoma.hearts.model.transfered.CardProtos.Card>(cards_);
          bitField0_ |= 0x00000001;
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
          bitField0_ = (bitField0_ & ~0x00000001);
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
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          cards_ = null;
        }
        return cardsBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:hearts.PlayCardRequest)
    }
    
    static {
      defaultInstance = new PlayCardRequest(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:hearts.PlayCardRequest)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearts_PlayCardRequest_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearts_PlayCardRequest_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016PlayCard.proto\022\006hearts\032\nCard.proto\".\n\017" +
      "PlayCardRequest\022\033\n\005cards\030\001 \003(\0132\014.hearts." +
      "CardB7\n#org.bitcoma.hearts.model.transfe" +
      "redB\016PlayCardProtosH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hearts_PlayCardRequest_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hearts_PlayCardRequest_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearts_PlayCardRequest_descriptor,
              new java.lang.String[] { "Cards", },
              org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest.class,
              org.bitcoma.hearts.model.transfered.PlayCardProtos.PlayCardRequest.Builder.class);
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
