package Thread;

public class First extends Thread{
    @Override
    public void run() {
        System.out.println(1);
        System.out.println(Thread.currentThread());
    }

    public static void main(String[] args) {
        First f = new First();
        // f.run 方法仅仅是调用了 上面的run 方法，并不会真正的启动一个线程, 还是在main线程中
        f.run();
        // 而下面的start() 方法会真正的在main线程 中启动一个线程
        f.start();
    }
}
