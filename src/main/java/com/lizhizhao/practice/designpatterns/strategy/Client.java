package com.lizhizhao.practice.designpatterns.strategy;

public class Client {

    public static void main(String[] args) {
        int[] arr ={1,4,6,2,5,3,7,10,9};
        int[] result;
        ArraySortHandler sortHandler=new ArraySortHandler();

        Sort sort = new SelectionSort();    //使用选择排序

        sortHandler.setSortObj(sort); //设置具体策略
        result=sortHandler.sort(arr);

        for (int value : result) {
            System.out.print(value + ",");
        }
    }
}