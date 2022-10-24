package zhf.bio.oneToMany;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName BioClientHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BioClientHandler implements Runnable {

    @Override
    public void run() {

        //创建socket对象请求服务器的连接
        Socket socket = null;
        try {
            while (true) {
                socket = new Socket("127.0.0.1", 9999);
                //从socket对象中获取一个字节输出流
                OutputStream os = socket.getOutputStream();
                //把字节输出流包装成一个打印流
                PrintStream ps = new PrintStream(os);
                log.info("{}访问服务端", Thread.currentThread().getName());
                String msg = Thread.currentThread().getName() + "\n";
                ps.println(msg);
                ps.flush();
                Thread.sleep(2000);
            }
        }
        catch (IOException | InterruptedException e) {
            log.error(e.getMessage());
        }

    }
}
