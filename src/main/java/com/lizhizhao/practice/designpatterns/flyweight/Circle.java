package com.lizhizhao.practice.designpatterns.flyweight;

/**
 * 具体的享元类
 * 可重用
 */
public class Circle extends Shape{
    private String color;
    public Circle(String color){
        this.color = color;
    }

    public void draw() {
        System.out.println("画了一个" + color +"的圆形");
    }

}