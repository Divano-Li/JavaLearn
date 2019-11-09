package DesignPattern.StrategyPattern.method1;

/**
 * Description:收费对象生成工厂
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashFactory {
    public CashSuper cs;
    public CashSuper createCashAccept(String flag){
        switch(flag){
            case "CashNormal":
                cs = new CashNormal();
                break;
            case "CashRebate":
                cs = new CashRebate();
                break;
            case "CashReturn":
                cs = new CashReturn();
                break;
        }
        return cs;
    }
}
