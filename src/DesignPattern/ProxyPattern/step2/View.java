package DesignPattern.ProxyPattern.step2;



/**
 * Description: 代理代替春杰给玺浩送礼物
 * Created by 徐礼林 on 2017/5/4.
 */
public class View {
    public static void main(String args[]){
        Girl mm = new Girl("王玺浩");
        Proxy proxy = new Proxy(mm);
        proxy.giveDolls();
        proxy.giveFlowers();
    }
}
