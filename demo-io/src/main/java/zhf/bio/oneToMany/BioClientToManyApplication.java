package zhf.bio.oneOnOne;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName BioClientApplication
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BioClientApplication {
    public static void main(String[] args) throws IOException {
        //创建socket对象请求服务器的连接
        Socket socket = new Socket("127.0.0.1", 9999);
        //从socket对象中获取一个字节输出流
        OutputStream os = socket.getOutputStream();
        //把字节输出流包装成一个打印流
        PrintStream ps = new PrintStream(os);
        Scanner sc = new Scanner(System.in);
        while (true) {
            log.info("请输入内容：");
            String msg = sc.nextLine();
            ps.println(msg);
            ps.flush();
        }
    }
}
