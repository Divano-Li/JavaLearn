package DesignPattern.StrategyPattern.StrategyBindFactory;


/**
 * Description: 正常收费策略类
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashNormal extends CashSuper {
    @Override
    public Double acceptCash(Double moeny) {
        return moeny;
    }
}
