package com.lizhizhao.practice.designpatterns.flyweight;


/**
 * 模式优缺点
 * ## 优点
 * ​1、享元模式的优点在于它能够极大的减少系统中对象的个数。
 * ​2、享元模式由于使用了外部状态，外部状态相对独立，不会影响到内部状态，所以享元模式使得享元对象能够在不同的环境被共享。
 *
 * ## 缺点
 * ​ 1、由于享元模式需要区分外部状态和内部状态，使得应用程序在某种程度上来说更加复杂化了。
 * ​ 2、为了使对象可以共享，享元模式需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。
 */
public class FlyweightClient {

    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        System.out.println("一共绘制了"+FlyweightFactory.getSum()+"种颜色的圆形");
    }
}