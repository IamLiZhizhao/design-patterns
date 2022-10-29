package com.lizhizhao.practice.designpatterns.chainOfResponsibility;

/**
 * 拥有审批权限的抽象类：领导
 */
public abstract class Leader {
    /** 姓名 **/
    public String name;

    /** 后继者 **/
    protected Leader successor;

    public Leader(String name){
        this.name = name;
    }

    public void setSuccessor(Leader successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(LeaveNode LeaveNode);
}