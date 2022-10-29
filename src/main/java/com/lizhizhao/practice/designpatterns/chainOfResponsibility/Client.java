package com.lizhizhao.practice.designpatterns.chainOfResponsibility;

/**
 * 优点
 * ​ 1、降低耦合度。它将请求的发送者和接受者解耦。
 * ​ 2、简化了对象。使得对象不需要知道链的结构。
 * ​ 3、增强给对象指派职责的灵活性。通过改变链内的成员或者调动它们的次序，允许动态地新增或者删除责任。
 * ​ 4、增加新的请求处理类很方便。
 *
 * 缺点
 * ​ 1、不能保证请求一定被接收。
 * ​ 2、系统性能将受到一定影响，而且在进行代码调试时不太方便；可能会造成循环调用。
 * ​ 3、可能不容易观察运行时的特征，有碍于除错。
 */
public class Client {
    public static void main(String[] args) {
        Leader instructor = new Instructor("陈毅");       //辅导员
        Leader departmentHead = new DepartmentHead("王明");    //系主任
        Leader dean = new Dean("张强");      //院长
        Leader president = new President("王晗");     //校长

        instructor.setSuccessor(departmentHead);       //辅导员的后续者是系主任
        departmentHead.setSuccessor(dean);             //系主任的后续者是院长
        dean.setSuccessor(president);                  //院长的后续者是校长

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 3);
        instructor.handleRequest(leaveNode1);

        //请假9天的请假条
        LeaveNode leaveNode2 = new LeaveNode("李四", 9);
        instructor.handleRequest(leaveNode2);

        //请假15天的请假条
        LeaveNode leaveNode3 = new LeaveNode("王五", 15);
        instructor.handleRequest(leaveNode3);

        //请假20天的请假条
        LeaveNode leaveNode4 = new LeaveNode("赵六", 20);
        instructor.handleRequest(leaveNode4);
    }
}