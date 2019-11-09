package DesignPattern.FlyweightPattern;

/**
 * Description:继承自Flyweight超类或者Flyweight接口，并为内部状态增加存储空间
 * Created by 徐礼林 on 2017/12/27.
 */
public class ConcreteFlyweight extends Flyweight {
    private int a ;
    public ConcreteFlyweight(int a){
        this.a = a ;
    }
    @Override
    public void Operation() {
        System.out.println("具体的flyweight:" + a );
    }
}
