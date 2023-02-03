package Thread.createThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Third implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread());
        return 1;
    }

    public static void main(String[] args)  throws Exception{
        try {
            // 这样调用也是错误的
            Integer a = new Third().call();
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 包装成FutureTask 类同时 传入Thread 类中
        FutureTask<Integer> futureTask = new FutureTask<>(new Third());
        new Thread(futureTask, "A").start();
        System.out.println(futureTask.get());

    }
}
