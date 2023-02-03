package Thread.run;

/**
 * @author lilin
 * @date 2019-11-23 17:19
 * 通过任务实现斐波那契数列
 */
public class Ex2 {
    public static void main(String[] args) {
        for(int i = 10; i< 15; i++){
            new Thread(new Ex2Runner(i)).start();
        }
    }
}
class Ex2Runner implements Runnable{
    private int n = 0;
    public Ex2Runner(int n) {
        this.n = n;
    }
    private  int fib(int n) {
        if(n <2 ) return  1;
        return fib(n-2) + fib(n-1);
    }
    @Override
    public void run() {
        for(int i=0; i< n; i++) {
          System.out.print(fib(i) + " ");
        }
        Thread.yield();
        System.out.println();
    }
}
