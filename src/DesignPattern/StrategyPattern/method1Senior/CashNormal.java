package DesignPattern.StrategyPattern.method1Senior;
/**
 * Description:
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double moeny) {
        return moeny;
    }
}
