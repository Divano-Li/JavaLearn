package DesignPattern.ProxyPattern.ThinkInJavaProxy;



import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * Description:
 *
 * @author 徐礼林 on 2018/1/17.
 */
public class ProxyTest {

   void testProxy(Interface interfaces){
        interfaces.doSomething();
        interfaces.doSomethingElse("testProxy");
    }
    @Test
    public void SimpleTest(){
        testProxy(new RealObject());
        testProxy(new SimpleProxy(new RealObject()));
    }
    @Test
    public void DynamicTest(){
        Interface o = (Interface)Proxy.newProxyInstance(Interface.class.getClassLoader(), new Class[]{Interface.class}, new DynamicProxy(new RealObject()));
        testProxy(o);
    }
}
