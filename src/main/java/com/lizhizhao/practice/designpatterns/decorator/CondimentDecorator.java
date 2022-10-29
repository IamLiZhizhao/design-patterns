package com.lizhizhao.practice.designpatterns.decorator;


/**
 * 装饰类
 * 动态拓展功能
 */
public abstract class CondimentDecorator extends Beverage{
  public abstract String getDescription();
}