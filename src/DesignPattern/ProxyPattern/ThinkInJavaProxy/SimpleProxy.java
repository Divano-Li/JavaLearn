package DesignPattern.ProxyPattern.ThinkInJavaProxy;

/**
 * Description:
 *
 * @author 徐礼林 on 2018/1/17.
 */
public class SimpleProxy implements Interface {

    private RealObject realObject;

    public SimpleProxy(RealObject realObject){
        this.realObject = realObject;
    }

    public void doSomething() {
        realObject.doSomething();
    }

    public void doSomethingElse(String args) {
        realObject.doSomethingElse(args);
    }
}
