package com.zzia.wngn.design.chain;

/**
 * @author wanggang
 * @title 班长
 * @date 2016/5/30 11:36
 * @email wanggang@vfou.com
 * @descripe
 */
public class Monitor extends Leader {

    public Monitor(String name) {
        super(name);
        super.limit = 0;
    }

    @Override
    public String getDescription() {
        return "班长";
    }

    @Override
    public void handleLeave(LeaveNode leaveNode) {
        super.getSuccessor().handleLeave(leaveNode);
    }
}
