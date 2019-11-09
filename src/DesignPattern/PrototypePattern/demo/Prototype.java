package DesignPattern.PrototypePattern.demo;

/**
 * Description:原型类
 * Created by 徐礼林 on 2017/5/9.
 */
public class Prototype implements Cloneable {
    public Prototype clone(){
        Prototype prototype = null;
        try {
            //调用object中的clone方法，直接在内存中复制对象
            prototype = (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return  prototype;
    }
}
