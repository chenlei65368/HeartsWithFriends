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

    public HeartsServerPipelineFactory(OrderedMemoryAwareThreadPoolExecutor executor) {
        this.executor = executor;
    }

    @Override
    public ChannelPipeline getPipeline() throws Exception {
        ChannelPipeline pipeline = pipeline();

        pipeline.addLast("logger", new LoggingHandler(InternalLogLevel.INFO, true));
        pipeline.addLast("frameDecoder", new ProtobufVarint32FrameDecoder());
        pipeline.addLast("protobufDecoder", new ProtobufDecoder(OneMessageProtos.OneMessage.getDefaultInstance()));

        pipeline.addLast("frameEncoder", new ProtobufVarint32LengthFieldPrepender());
        pipeline.addLast("protobufEncoder", new ProtobufEncoder());
        pipeline.addLast("oneMessageEncoder", new OneMessageEncoder());

        pipeline.addLast("executor", new ExecutionHandler(executor));
        pipeline.addLast("mainHandler", new HeartsServerHandler());

        return pipeline;
    }

}
