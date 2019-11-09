package DesignPattern.PrototypePattern.demo;

import DesignPattern.PrototypePattern.deepCopy.Resume;

/**
 * Description:让一个原型克隆自身，从而创建一个新的对象
 * Created by 徐礼林 on 2017/5/9.
 */
public class Client  {
    public static void main(String[] args) {
        ConcretePrototype cp = new ConcretePrototype();
        for (int i = 0; i <10 ; i++) {
            ConcretePrototype concretePrototype = (ConcretePrototype)cp.clone();
            concretePrototype.show();
        }
    }
}
