package DesignPattern.ObserverPattern.introduction;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/19.
 */
public class Client {
    public static void main(String[] args) {
        Secretary secretary = new Secretary("小明");
        Colleague colleague1 = new Colleague("lilin","炉石传说");
        Colleague colleague2 = new Colleague("chunjie","王者荣耀");
        secretary.add(colleague1);
        secretary.add(colleague2);
        secretary.setBossAction("回来了");
        secretary.notifys();
    }
}
