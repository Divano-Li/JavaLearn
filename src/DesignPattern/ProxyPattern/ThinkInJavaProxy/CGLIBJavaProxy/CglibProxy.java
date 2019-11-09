package DesignPattern.ProxyPattern.ThinkInJavaProxy.CGLIBJavaProxy;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    private Object proxied;
    public CglibProxy(Object proxied) {
        this.proxied = proxied;
    }
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("name: " + method.getName());
        //return method.invoke(proxied, objects);
        return method.invoke(proxied, objects);
    }
}
