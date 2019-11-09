package DesignPattern.StrategyPattern.Strategy;

/**
 * Description:
 * Created by 徐礼林 on 2017/4/23.
 */
public class Context {
     public Strategy strategy;
     public Context(Strategy strategy){
         this.strategy = strategy;
     }
     public void contextInterface(){
         strategy.algorithmInterface();
     }
}
