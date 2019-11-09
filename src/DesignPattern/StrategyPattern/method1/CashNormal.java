package DesignPattern.StrategyPattern.method1;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double price, Double num) {
        return price*num;
    }
}
