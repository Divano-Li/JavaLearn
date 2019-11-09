package DesignPattern.FlyweightPattern;

/**
 * Description: 指那些不需要共享的flyweight子类，并不要求强制共享
 * Created by 徐礼林 on 2017/12/27.
 */
public class UnsharedConcreteFlyweight extends  Flyweight {
    private int a ;
    public UnsharedConcreteFlyweight(int a){
        this.a = a ;
    }
    @Override
    public void Operation() {
        System.out.println("不需要共享的具体的flyweight" + a);
    }
}
