package DesignPattern.ProxyPattern.ThinkInJavaProxy;

/**
 * Description:
 *
 * @author 徐礼林 on 2018/1/17.
 */
public class RealObject implements Interface, Interface1{
    public void doSomething() {
        System.out.println("doSomething");
    }

    public void doSomethingElse(String args) {
        System.out.println("doSomethingElse");
    }

    public void doNothing() {
        System.out.println("doNothing");
    }
}
