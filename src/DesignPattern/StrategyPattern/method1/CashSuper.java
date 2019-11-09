package DesignPattern.StrategyPattern.method1;

/**
 * Description:收钱的抽象类：包含一个抽象方法（子类中必须实现这个抽象方法）
 * Created by 徐礼林 on 2017/4/22.
 */
public abstract class CashSuper {
    public abstract Double acceptCash(Double price,Double num);
}
