package DesignPattern.StrategyPattern.StrategyBindFactory;


/**
 * Description:
 * Created by 徐礼林 on 2017/4/23.
 */
public class Context {
     public CashSuper cs;
     public Context(String flag){
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
     }
     public Double getResult(Double moeny){
        return cs.acceptCash(moeny);
     }
}
