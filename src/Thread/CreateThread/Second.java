package Thread.CreateThread;

public class Second implements Runnable {

    @Override
    public void run() {
        System.out.println(1);
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        // 调用 run（） 方法并没有创建线程， 只是这个类的普通方法
        new Second().run();
        // 错误用法二， 还是没有创建线程
        new Thread(new Second()).run();
        // 正确用法
        new Thread(new Second()).start();
    }
}
