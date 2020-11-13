package com.lizhizhao.practice.designpatterns;

import com.lizhizhao.practice.designpatterns.observer.DemoPublisher;
import com.lizhizhao.practice.designpatterns.proxy.CglibProxy;
import com.lizhizhao.practice.designpatterns.proxy.JdkDynamicProxy;
import com.lizhizhao.practice.designpatterns.proxy.StaticProxy;
import com.lizhizhao.practice.designpatterns.service.UserService;
import com.lizhizhao.practice.designpatterns.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 观察者模式测试
 * @author lizhizhao
 * @since 2020-07-23 16:46
 */
@SpringBootTest
public class ObserverTest {

    @Test
    void test() {
        DemoPublisher demoPublisher = new DemoPublisher();
        demoPublisher.publish("发布观察者消息");
    }



}
