package DesignPattern.FacadePattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/11.
 */
public class Client {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method1();
        System.out.println("------------");
        facade.mehtod2();
    }
}
