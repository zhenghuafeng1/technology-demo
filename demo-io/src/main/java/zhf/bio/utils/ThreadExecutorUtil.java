package zhf.bio.utils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Autor zhenghf
 * @Date 2022/10/24
 * @ClassName ThreadExecutorUtil
 * @Description
 * @Version 1.0
 **/
public class ThreadExecutorUtil {

    private ExecutorService executorService;

    public ThreadExecutorUtil() {
        executorService = new ThreadPoolExecutor(5, 5, 120, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(10));
    }

    public void executor(Runnable runnable) {
        executorService.execute(runnable);
    }
}
