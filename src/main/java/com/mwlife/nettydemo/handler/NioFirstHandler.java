package com.mwlife.nettydemo.handler;

import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author ycy
 */
public class NioFirstHandler extends ChannelHandlerAdapter {

    private Logger logger = LoggerFactory.getLogger(NioFirstHandler.class);


    @Override
    public void handlerAdded(ChannelHandlerContext ctx) throws Exception {
        logger.info("NioFirstHandler handlerAdded");
        super.handlerAdded(ctx);
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        logger.info("NioFirstHandler handlerRemoved");
        super.handlerRemoved(ctx);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        logger.info("NioFirstHandler exceptionCaught");
        super.exceptionCaught(ctx, cause);
    }
}
