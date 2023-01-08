package com.lizhizhao.practice.designpatterns.strategy;

public class ArraySortHandler {
    private Sort sortObj;

    int[] sort(int[] arr)
    {
        sortObj.sort(arr);
        return arr;
    }

    void setSortObj(Sort sortObj) {
        this.sortObj = sortObj;
    }
}