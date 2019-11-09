package DesignPattern.ProxyPattern.step2;

/**
 * Description: 代理来代替追求者
 * Created by 徐礼林 on 2017/5/4.
 */
public class Proxy {
    Girl girl;
    public Proxy(Girl girl){
        this.girl = girl;
    }
    public void giveDolls(){
        System.out.println(girl.name+": 送你洋娃娃");
    }
    public void giveFlowers(){
        System.out.println(girl.name+": 送你鲜花");
    }
}
