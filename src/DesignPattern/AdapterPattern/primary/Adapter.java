package DesignPattern.AdapterPattern.primary;

/**
 * Description:通过在内部包装一个Adapter对象，把源接口转换成目标接口
 * Created by 徐礼林 on 2017/5/4.
 */
public class Adapter extends Target {
    private Adaptee adaptee;
    public void request(){
        if(adaptee==null){
            adaptee = new Adaptee();
        }
        adaptee.specificRequest();
    }
}
