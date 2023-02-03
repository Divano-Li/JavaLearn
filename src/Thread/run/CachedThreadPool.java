package Thread.run;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lilin
 * @date 2019-11-23 18:53
 */
public class CachedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0 ; i < 5; i++) {
            exec.execute(new LiftOff());
        }
        exec.shutdown();
    }
}
