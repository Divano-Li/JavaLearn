package DesignPattern.AdapterPattern.primary;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/4.
 */
public class View {
    public static void main(String[] args) {
        Target target = new Adapter();
        target.request();
    }
}
