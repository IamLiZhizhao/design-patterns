package com.lizhizhao.practice.designpatterns.proxy;

import com.lizhizhao.practice.designpatterns.service.UserService;

/**
 * @author lizhizhao
 * @since 2020-07-23 16:38
 */
public class StaticProxy implements UserService {

    private UserService target;

    public StaticProxy(UserService target) {
        this.target = target;
    }

    @Override
    public void add() {
        System.out.println("静态代理-前置");
        target.add();
        System.out.println("静态代理-后置");
    }
}