package com.lizhizhao.practice.designpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkDynamicProxy implements InvocationHandler {

    private Object target;

    public JdkDynamicProxy(Object target) {

        super();
        this.target = target;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        PerformanceMonior.begin(target.getClass().getName()+"."+method.getName());
        System.out.println("-----------------begin "+method.getName()+"-----------------");
        Object result = method.invoke(target, args);
        System.out.println("-----------------end "+method.getName()+"-----------------");
//        PerformanceMonior.end();
        return result;
    }

    public Object getProxy(){

        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(), this);
    }

}