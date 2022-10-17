package zhf.local.handle;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Autor zhenghf
 * @Date 2022/10/17
 * @ClassName ClientHandle
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class ClientHandle extends ChannelInboundHandlerAdapter {

    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.copiedBuffer("Hello Word", CharsetUtil.UTF_8));

    }

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        log.info("收到服务端{}的消息：{}", ctx.channel().remoteAddress(), byteBuf.toString(CharsetUtil.UTF_8));
    }
}
