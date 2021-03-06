package com.flyingdigital.reflact;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyHandler  implements InvocationHandler {



    private Object target;

    public ProxyHandler(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                this.target.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target,args);

        return result;
    }
}
