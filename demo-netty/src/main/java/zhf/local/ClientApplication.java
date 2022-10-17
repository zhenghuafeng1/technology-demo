package zhf.local;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import zhf.local.handle.ClientHandle;


/**
 * @Autor zhenghf
 * @Date 2022/10/17
 * @ClassName ClientApplication
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class ClientApplication {
    public static void main(String[] args) throws InterruptedException {
        NioEventLoopGroup eventExecutors = new NioEventLoopGroup();

        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventExecutors)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new ClientHandle());
                        }
                    });
            log.info("client start ......");
            ChannelFuture channelFuture = bootstrap.connect("127.0.0.1", 6666).sync();
            channelFuture.channel().closeFuture().sync();
        }
        finally {
            eventExecutors.shutdownGracefully();
        }
    }
}
