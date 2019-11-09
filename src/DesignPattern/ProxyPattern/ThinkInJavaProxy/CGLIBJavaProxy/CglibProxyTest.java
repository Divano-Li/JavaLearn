package DesignPattern.ProxyPattern.ThinkInJavaProxy.CGLIBJavaProxy;

import DesignPattern.ProxyPattern.ThinkInJavaProxy.Interface;
import DesignPattern.ProxyPattern.ThinkInJavaProxy.Interface1;
import DesignPattern.ProxyPattern.ThinkInJavaProxy.RealObject;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

public class CglibProxyTest {
    @Test
    public void cglibTest() {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CglibProxy(new RealObject()));
        enhancer.setInterfaces(new Class[]{Interface.class, Interface1.class});
        Interface1 cglibProxy = (Interface1) enhancer.create();
        cglibProxy.doNothing();
    }
}
