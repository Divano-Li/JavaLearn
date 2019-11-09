package DesignPattern.FlyweightPattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/12/27.
 */
public class FlyweightClient {
    FlyweightFactory flyweightFactory = new FlyweightFactory();
    Flyweight flyweight1 = flyweightFactory.getFlyweight(1);
    Flyweight flyweight2 = flyweightFactory.getFlyweight(2);
    Flyweight flyweight3 = flyweightFactory.getFlyweight(3);
    Flyweight flyweight4 = flyweightFactory.getFlyweight(1);
    public void showFlyweightClient(){
        flyweight1.Operation();
        flyweight2.Operation();
        flyweight3.Operation();
        flyweight4.Operation();
        System.out.println("size "+flyweightFactory.getFlyweightSize());
    }

    public static void main(String[] args) {
        FlyweightClient flyweightClient = new FlyweightClient();
        flyweightClient.showFlyweightClient();
    }


}
