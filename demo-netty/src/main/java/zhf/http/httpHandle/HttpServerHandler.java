package zhf.http.httpHandle;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.codec.http.DefaultFullHttpResponse;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpContent;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.HttpResponseStatus;
import io.netty.handler.codec.http.HttpVersion;
import io.netty.util.CharsetUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

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

    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if (msg instanceof HttpRequest) {
            request = (HttpRequest) msg;
            log.info(request.uri());
        }
        if (msg instanceof HttpContent) {
            content = (HttpContent) msg;
            ByteBuf buf = content.content();
            String result = buf.toString(CharsetUtil.UTF_8);
            log.info(result);
            buf.release();
        }
        //1：创建httpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //2：通过httpGet发起get方式，传入网址为参数，并创建httpGet对象。
        HttpGet httpGet = new HttpGet("http://127.0.0.1:8111/linux/sayHello");
        //3：使用httpClient对象发起请求，
        CloseableHttpResponse response1 = httpClient.execute(httpGet);
        String content = EntityUtils.toString(response1.getEntity(), "UTF-8");
        log.info("http msg: {}", content);
        response = new DefaultFullHttpResponse(HttpVersion.HTTP_1_1,
                HttpResponseStatus.OK,
                Unpooled.copiedBuffer(content, CharsetUtil.UTF_8));
        response.headers().set("Content-Type", "application/json");
        response.headers().set("Content-Length", response.content().readableBytes());
        response.headers().set(HttpHeaderNames.CONNECTION, HttpHeaderNames.KEEP_ALIVE);
        ctx.write(response);
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        ctx.close();
    }
}
