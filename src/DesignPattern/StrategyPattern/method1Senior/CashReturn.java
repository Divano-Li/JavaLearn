package DesignPattern.StrategyPattern.method1Senior;


/**
 * Description:满减类
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashReturn extends CashSuper {
    private  Double standard;
    private Double  cut;
    public CashReturn(Double standard,Double cut){
        standard = standard;
        cut = cut;
    }
    @Override
    public Double acceptCash(Double moeny) {
        return moeny>standard?moeny-cut:moeny;
    }
}
