package DesignPattern.ProxyPattern.step3;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/4.
 */
public class Proxy implements SendGift {
    Persuit persuit;
    public Proxy(Girl girl){
        this.persuit = new Persuit(girl);
    }
    public void giveDolls(){
        persuit.giveDolls();
    }
    public void giveFlowers(){
        persuit.giveFlowers();
    }
}