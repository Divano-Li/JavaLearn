package DesignPattern.StrategyPattern.StrategyBindFactory;



/**
 * Description:打折策略类
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashRebate extends CashSuper {
    //折扣率
    private Double rate;
    //构造器
    public CashRebate(Double rate){
        this.rate = rate;
    }
    @Override
    public Double acceptCash(Double moeny) {
        return moeny*rate;
    }
}
