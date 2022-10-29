package com.lizhizhao.practice.designpatterns.decorator;

/**
* 基础组件类
* 抽象体，例如：饮料
*/
public abstract class Beverage {
   protected String description = "Unknown Beverage";

   public String getDescription() {
       return description;
   }

   public abstract double cost();
}