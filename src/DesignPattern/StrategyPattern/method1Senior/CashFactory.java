package DesignPattern.StrategyPattern.method1Senior;



/**
 * Description:收费对象生成工厂
 * Created by 徐礼林 on 2017/4/22.
 */
public class CashFactory {
    public CashSuper cs;
    public CashSuper createCashAccept(String flag){
        switch(flag){
            case "正常收费":
                cs = new CashNormal();
                break;
            case "打8折":
                cs = new CashRebate(0.8);
                break;
            case "满300减100":
                cs = new CashReturn(300d,100d);
                break;
        }
        return cs;
    }
}
