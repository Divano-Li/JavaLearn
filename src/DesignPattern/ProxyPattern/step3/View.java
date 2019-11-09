package DesignPattern.ProxyPattern.step3;

/**
 * Description:许论代替春杰给玺浩送花
 * Created by 徐礼林 on 2017/5/4.
 */
public class View {
    public static  void main(String args[]){
        Proxy xulun = new Proxy(new Girl("玺浩"));
        xulun.giveFlowers();
        xulun.giveFlowers();
    }
}
