package com.zzia.wngn.design.command;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 9:51
 * @email wanggang@vfou.com
 * @descripe
 */
public enum Status {

    ON(1), OFF(1);

    private int status;

    Status(int status) {
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }
}
