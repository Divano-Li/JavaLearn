package DesignPattern.ProxyPattern.step1;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/4.
 */
public class View {
    public static void main(String args[]){
        Girl mm = new Girl("王玺浩");
        Persuit chunjie = new Persuit(mm);
        chunjie.giveDolls();
        chunjie.giveFlowers();
    }
}
