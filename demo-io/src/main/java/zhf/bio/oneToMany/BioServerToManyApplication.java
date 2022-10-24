package zhf.bio.oneToMany;

import lombok.extern.slf4j.Slf4j;
import zhf.bio.utils.ThreadExecutorUtil;

import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName BioServerToManyApplication
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BioServerToManyApplication {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(9999);
            //初始化一个线程池对象
            ThreadExecutorUtil pool = new ThreadExecutorUtil();
            while (true) {
                Socket socket = ss.accept();
                //把socket封装成一个任务对象交给线程池处理
                Runnable target = new BioServerHandler(socket);
                pool.executor(target);
            }
        }
        catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
