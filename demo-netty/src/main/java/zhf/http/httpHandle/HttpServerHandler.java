package zhf.http.httpHandle;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @Autor zhenghf
 * @Date 2022/10/17
 * @ClassName HttpServerHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class HttpServerHandler extends ChannelInboundHandlerAdapter {

    private HttpRequest request;
    private HttpContent content;
    private FullHttpResponse response;
    private StringBuilder sb = new StringBuilder();

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpRequest) {
            request = (HttpRequest) msg;
            log.info(request.uri());
            log.info("request received success");
            sb.append("request received success \n");
        }
        if (msg instanceof HttpContent) {
            content = (HttpContent) msg;
            ByteBuf buf = content.content();
            String result = buf.toString(CharsetUtil.UTF_8);
            log.info(result);
            buf.release();
            log.info("content received success");
            sb.append("content received success");
            response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK, Unpooled.wrappedBuffer(sb.toString().getBytes()));
            ctx.writeAndFlush(response);
        }
    }

    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        ctx.close();
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        HttpResponse response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.BAD_GATEWAY);
        ctx.writeAndFlush(response);
        ctx.close();
    }
}
