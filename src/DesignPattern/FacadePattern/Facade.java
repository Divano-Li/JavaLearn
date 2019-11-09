package DesignPattern.FacadePattern;

/**
 * Description:
 * Created by 徐礼林 on 2017/5/11.
 */
public class Facade {
    SubSystemOne subSystemOne;
    SubSystemTwo subSystemTwo;
    public Facade(){
        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
    }
    public void method1(){
        subSystemOne.methodOne();
        subSystemTwo.methodTwo();
    }
    public void mehtod2(){
        subSystemOne.methodOne();
        subSystemTwo.methodThree();
    }
}
