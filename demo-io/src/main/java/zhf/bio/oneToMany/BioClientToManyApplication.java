package zhf.bio.oneToMany;

import lombok.extern.slf4j.Slf4j;
import zhf.bio.utils.ThreadExecutorUtil;

import java.io.IOException;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName BioClientApplication
 * @Description
 * @Version 1.0
 **/
@Slf4j
public class BioClientToManyApplication {
    public static void main(String[] args) throws IOException {

        ThreadExecutorUtil threadExecutorUtil = new ThreadExecutorUtil();

        for (int i = 0; i < 2; i++) {
            Runnable target = new BioClientHandler();
            threadExecutorUtil.executor(target);
        }


    }
}
