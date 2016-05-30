package com.zzia.wngn.design.chain;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 10:50
 * @email wanggang@vfou.com
 * @descripe
 */
public class ChainMain {

    public static void main(String[] args) {

        Leader monitor = new Monitor("王晗");
        Leader instructor = new Instructor("陈毅");
        Leader departmentor = new Departmentor("王明");
        Leader deanor = new Deanor("张强");
        Leader presidentor = new Presidentor("王晗");

        monitor.setSuccessor(instructor);
        instructor.setPrecursor(monitor);
        instructor.setSuccessor(departmentor);
        departmentor.setPrecursor(instructor);
        departmentor.setSuccessor(deanor);
        deanor.setPrecursor(departmentor);
        deanor.setSuccessor(presidentor);
        presidentor.setPrecursor(deanor);

        //请假3天的请假条
        LeaveNode leaveNode1 = new LeaveNode("张三", 1);
        //请假3天的请假条
        LeaveNode leaveNode3 = new LeaveNode("张三", 3);
        //请假9天的请假条
        LeaveNode leaveNode9 = new LeaveNode("李四", 9);
        //请假15天的请假条
        LeaveNode leaveNode15 = new LeaveNode("王五", 15);
        //请假20天的请假条
        LeaveNode leaveNode20 = new LeaveNode("赵六", 20);

        monitor.handleLeave(leaveNode1);
        monitor.handleLeave(leaveNode3);
        monitor.handleLeave(leaveNode9);
        monitor.handleLeave(leaveNode15);
        monitor.handleLeave(leaveNode20);
    }
}
