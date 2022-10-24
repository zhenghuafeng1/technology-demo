package zhf.bio.oneToMany;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName BioHandler
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BioHandler implements Runnable {

    private Socket socket;

    public BioHandler(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String msg = br.readLine();
            if (msg != null) {
                log.info("{}接收到：{}", Thread.currentThread().getName(), msg);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
