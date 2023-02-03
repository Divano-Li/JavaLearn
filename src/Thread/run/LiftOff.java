package Thread.run;

/**
 * @author lilin
 * @date 2019-11-23 16:34
 */
public class LiftOff implements Runnable {
    protected  int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){

    }
    public LiftOff(int countDown){
        this.countDown = countDown;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "), ";
    }
    @Override
    public void run() {
        while(countDown -- > 0) {
            System.out.print(status());
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        LiftOff launch = new LiftOff();
        launch.run();
    }
}
