package DesignPattern.ProxyPattern.ThinkInJavaProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @author 徐礼林 on 2018/1/18.
 */
public class DynamicProxy implements InvocationHandler {
    private Object proxied;
    public DynamicProxy(Object proxied){
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("name : "+ method.getName());
        if(method.getName().equals("doSomething")){
            System.out.println("拦截这个方法不让它执行");
        }
        return method.invoke(proxied,args);
    }
}
