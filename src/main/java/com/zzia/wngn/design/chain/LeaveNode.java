package com.zzia.wngn.design.chain;

/**
 * @author wanggang
 * @title 请假条
 * @date 2016/5/30 10:47
 * @email wanggang@vfou.com
 * @descripe
 */
public class LeaveNode {

    /**
     * 请假天数
     **/
    private int number;

    /**
     * 请假人
     **/
    private String student;

    public LeaveNode(String student, int number) {
        this.student = student;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
