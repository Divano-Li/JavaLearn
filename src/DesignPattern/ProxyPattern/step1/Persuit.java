package DesignPattern.ProxyPattern.step1;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/4.
 */
public class Persuit {
    Girl girl;
    public Persuit(Girl girl){
        this.girl = girl;
    }
    public void giveDolls(){
        System.out.println(girl.name+": 送你洋娃娃");
    }
    public void giveFlowers(){
        System.out.println(girl.name+": 送你鲜花");
    }
}
