package Thread.Interview;

/* 找出这个题目中 不合理的地方
**
 */

public class Test1 {
    public static  Boolean active;
    public void run(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(active){
                    doWork();
                }
            }
        });
    }
    private void stop(){
        active = false;
    }
    private void doWork(){
        System.out.println(1);
    }

    public static void main(String[] args) {
        Test1 t = new Test1();
        t.run();
        System.out.println(Test1.active);
    }
}

// 1. Boolean 是包装类， 初始值为null，
// 2. stop 方法为private 但是 active 的变量的初始值却为 public
// 3. run 方法中新建了一个Thread 类， 并没有start（） 方法， 即使有了start 方法， active 的初始值为null，
// 4. active 变量需要添加一个 volatile