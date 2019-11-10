package Thread.CreateThread;

import java.util.concurrent.Callable;

public class Third implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 1;
    }

    public static void main(String[] args) {
        try {
            Integer a = new Third().call();
            System.out.println(a);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
