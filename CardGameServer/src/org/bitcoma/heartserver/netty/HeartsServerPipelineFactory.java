package org.bitcoma.heartserver.netty;

import static org.jboss.netty.channel.Channels.pipeline;

import org.bitcoma.hearts.model.transfered.OneMessageProtos;
import org.bitcoma.hearts.netty.handler.OneMessageEncoder;
import org.bitcoma.heartserver.netty.handler.HeartsServerHandler;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelPipelineFactory;
import org.jboss.netty.handler.codec.protobuf.ProtobufDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufEncoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import org.jboss.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;
import org.jboss.netty.handler.execution.ExecutionHandler;
import org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor;
import org.jboss.netty.handler.logging.LoggingHandler;
import org.jboss.netty.logging.InternalLogLevel;

public class HeartsServerPipelineFactory implements ChannelPipelineFactory {

    private OrderedMemoryAwareThreadPoolExecutor executor;

    // Static encoders. One for all pipelines
    private static final OneMessageEncoder ONE_MESSAGE_ENCODER = new OneMessageEncoder();
    private static final ProtobufEncoder PROTOBUF_ENCODER = new ProtobufEncoder();
    private static final ProtobufDecoder PROTOBUF_DECODER = new ProtobufDecoder(
            OneMessageProtos.OneMessage.getDefaultInstance());
    private static final ProtobufVarint32LengthFieldPrepender PROTOBUF_LENGTH_PREPENDER = new ProtobufVarint32LengthFieldPrepender();

    public HeartsServerPipelineFactory(OrderedMemoryAwareThreadPoolExecutor executor) {
        this.executor = executor;
    }

    @Override
    public ChannelPipeline getPipeline() throws Exception {
        ChannelPipeline pipeline = pipeline();

        pipeline.addLast("logger", new LoggingHandler(InternalLogLevel.INFO, true));
        pipeline.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
        pipeline.addLast("protobufDecoder", PROTOBUF_DECODER);

        pipeline.addLast("frameEncoder", PROTOBUF_LENGTH_PREPENDER);
        pipeline.addLast("protobufEncoder", PROTOBUF_ENCODER);
        pipeline.addLast("oneMessageEncoder", ONE_MESSAGE_ENCODER);

        pipeline.addLast("executor", new ExecutionHandler(executor));
        pipeline.addLast("mainHandler", new HeartsServerHandler());

        return pipeline;
    }

}
