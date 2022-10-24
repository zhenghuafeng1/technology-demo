package zhf.bio.oneOnOne;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName BioServerApplication
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BioServerApplication {
    public static void main(String[] args) {
        log.info("服务端启动......");
        try {
            ServerSocket serverSocket = new ServerSocket(9999);
            Socket socket = serverSocket.accept();
            //从socket管道中得到一个字节输入流对象
            InputStream is = socket.getInputStream();
            //把字节输入流包装秤一个缓冲字符输入流
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg;
            while ((msg = br.readLine()) != null) {
                log.info("{}线程接收到：{}", Thread.currentThread().getName(), msg);
            }
        }
        catch (IOException e) {
            log.error(e.getMessage());
        }
    }
}
