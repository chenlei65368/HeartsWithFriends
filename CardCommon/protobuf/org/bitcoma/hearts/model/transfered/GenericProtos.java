// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GenericResponse.proto

package org.bitcoma.hearts.model.transfered;

public final class GenericProtos {
  private GenericProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface GenericResponseOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional .hearts.GenericResponse.ResponseCode response_code = 1;
    boolean hasResponseCode();
    org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode getResponseCode();
  }
  public static final class GenericResponse extends
      com.google.protobuf.GeneratedMessage
      implements GenericResponseOrBuilder {
    // Use GenericResponse.newBuilder() to construct.
    private GenericResponse(Builder builder) {
      super(builder);
    }
    private GenericResponse(boolean noInit) {}
    
    private static final GenericResponse defaultInstance;
    public static GenericResponse getDefaultInstance() {
      return defaultInstance;
    }
    
    public GenericResponse getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bitcoma.hearts.model.transfered.GenericProtos.internal_static_hearts_GenericResponse_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bitcoma.hearts.model.transfered.GenericProtos.internal_static_hearts_GenericResponse_fieldAccessorTable;
    }
    
    public enum ResponseCode
        implements com.google.protobuf.ProtocolMessageEnum {
      OK(0, 0),
      INVALID_PARAMS(1, 1),
      MISSING_PARAMS(2, 2),
      UNEXPECTED_REQUEST(3, 3),
      UNAUTHORIZED(4, 4),
      RESOURCE_UNAVAILABLE(5, 5),
      ;
      
      public static final int OK_VALUE = 0;
      public static final int INVALID_PARAMS_VALUE = 1;
      public static final int MISSING_PARAMS_VALUE = 2;
      public static final int UNEXPECTED_REQUEST_VALUE = 3;
      public static final int UNAUTHORIZED_VALUE = 4;
      public static final int RESOURCE_UNAVAILABLE_VALUE = 5;
      
      
      public final int getNumber() { return value; }
      
      public static ResponseCode valueOf(int value) {
        switch (value) {
          case 0: return OK;
          case 1: return INVALID_PARAMS;
          case 2: return MISSING_PARAMS;
          case 3: return UNEXPECTED_REQUEST;
          case 4: return UNAUTHORIZED;
          case 5: return RESOURCE_UNAVAILABLE;
          default: return null;
        }
      }
      
      public static com.google.protobuf.Internal.EnumLiteMap<ResponseCode>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static com.google.protobuf.Internal.EnumLiteMap<ResponseCode>
          internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ResponseCode>() {
              public ResponseCode findValueByNumber(int number) {
                return ResponseCode.valueOf(number);
              }
            };
      
      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(index);
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.getDescriptor().getEnumTypes().get(0);
      }
      
      private static final ResponseCode[] VALUES = {
        OK, INVALID_PARAMS, MISSING_PARAMS, UNEXPECTED_REQUEST, UNAUTHORIZED, RESOURCE_UNAVAILABLE, 
      };
      
      public static ResponseCode valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }
      
      private final int index;
      private final int value;
      
      private ResponseCode(int index, int value) {
        this.index = index;
        this.value = value;
      }
      
      // @@protoc_insertion_point(enum_scope:hearts.GenericResponse.ResponseCode)
    }
    
    private int bitField0_;
    // optional .hearts.GenericResponse.ResponseCode response_code = 1;
    public static final int RESPONSE_CODE_FIELD_NUMBER = 1;
    private org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode responseCode_;
    public boolean hasResponseCode() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode getResponseCode() {
      return responseCode_;
    }
    
    private void initFields() {
      responseCode_ = org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode.OK;
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
        output.writeEnum(1, responseCode_.getNumber());
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
          .computeEnumSize(1, responseCode_.getNumber());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    @java.lang.Override
    protected Object writeReplace() throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseDelimitedFrom(
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
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse prototype) {
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
       implements org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.bitcoma.hearts.model.transfered.GenericProtos.internal_static_hearts_GenericResponse_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.bitcoma.hearts.model.transfered.GenericProtos.internal_static_hearts_GenericResponse_fieldAccessorTable;
      }
      
      // Construct using org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.newBuilder()
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
        responseCode_ = org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode.OK;
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.getDescriptor();
      }
      
      public org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse getDefaultInstanceForType() {
        return org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.getDefaultInstance();
      }
      
      public org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse build() {
        org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse buildPartial() {
        org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse result = new org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.responseCode_ = responseCode_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse) {
          return mergeFrom((org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse other) {
        if (other == org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.getDefaultInstance()) return this;
        if (other.hasResponseCode()) {
          setResponseCode(other.getResponseCode());
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
              int rawValue = input.readEnum();
              org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode value = org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                responseCode_ = value;
              }
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional .hearts.GenericResponse.ResponseCode response_code = 1;
      private org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode responseCode_ = org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode.OK;
      public boolean hasResponseCode() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode getResponseCode() {
        return responseCode_;
      }
      public Builder setResponseCode(org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000001;
        responseCode_ = value;
        onChanged();
        return this;
      }
      public Builder clearResponseCode() {
        bitField0_ = (bitField0_ & ~0x00000001);
        responseCode_ = org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.ResponseCode.OK;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:hearts.GenericResponse)
    }
    
    static {
      defaultInstance = new GenericResponse(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:hearts.GenericResponse)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_hearts_GenericResponse_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_hearts_GenericResponse_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025GenericResponse.proto\022\006hearts\"\323\001\n\017Gene" +
      "ricResponse\022;\n\rresponse_code\030\001 \001(\0162$.hea" +
      "rts.GenericResponse.ResponseCode\"\202\001\n\014Res" +
      "ponseCode\022\006\n\002OK\020\000\022\022\n\016INVALID_PARAMS\020\001\022\022\n" +
      "\016MISSING_PARAMS\020\002\022\026\n\022UNEXPECTED_REQUEST\020" +
      "\003\022\020\n\014UNAUTHORIZED\020\004\022\030\n\024RESOURCE_UNAVAILA" +
      "BLE\020\005B6\n#org.bitcoma.hearts.model.transf" +
      "eredB\rGenericProtosH\001"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_hearts_GenericResponse_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_hearts_GenericResponse_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_hearts_GenericResponse_descriptor,
              new java.lang.String[] { "ResponseCode", },
              org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.class,
              org.bitcoma.hearts.model.transfered.GenericProtos.GenericResponse.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}
