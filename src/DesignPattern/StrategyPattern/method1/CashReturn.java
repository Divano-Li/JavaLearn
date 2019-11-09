package DesignPattern.StrategyPattern.method1;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashReturn extends CashSuper {
    @Override
    public Double acceptCash(Double price, Double num) {
        return price*num>500?price*num-100:price*num;
    }
}
