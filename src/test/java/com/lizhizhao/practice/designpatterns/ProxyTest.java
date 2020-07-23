package com.lizhizhao.practice.designpatterns;

import com.lizhizhao.practice.designpatterns.proxy.CglibProxy;
import com.lizhizhao.practice.designpatterns.proxy.JdkDynamicProxy;
import com.lizhizhao.practice.designpatterns.proxy.StaticProxy;
import com.lizhizhao.practice.designpatterns.service.UserService;
import com.lizhizhao.practice.designpatterns.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 代理单元测试
 * @author lizhizhao
 * @since 2020-07-23 16:46
 */
@SpringBootTest
public class ProxyTest {

    @Test
    void jdkTest() {
        UserService service = new UserServiceImpl();
        JdkDynamicProxy handler = new JdkDynamicProxy(service);
        UserService proxy = (UserService) handler.getProxy();
        proxy.add();
    }

    @Test
    void cglibTest() {
        CglibProxy proxy = new CglibProxy();
        //通过生成子类的方式创建代理类
        UserServiceImpl proxyImp = (UserServiceImpl)proxy.getProxy(UserServiceImpl.class);
        proxyImp.add();
    }

    @Test
    void staticTest() {
        UserService userService = new UserServiceImpl();
        StaticProxy staticProxy = new StaticProxy(userService);
        staticProxy.add();

    }

}
