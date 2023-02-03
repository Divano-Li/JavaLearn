package Thread.run;

/**
 * @author lilin
 * @date 2019-11-23 16:58
 */
public class BasicThread {
    public static void main(String[] args) {
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");
    }
}
