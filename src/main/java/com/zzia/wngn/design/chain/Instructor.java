package com.zzia.wngn.design.chain;

/**
 * @author wanggang
 * @title 辅导员
 * @date 2016/5/30 10:49
 * @email wanggang@vfou.com
 * @descripe
 */
public class Instructor extends Leader {

    public Instructor(String name) {
        super(name);
        super.limit = Leader.INSTRUCTOR_DAY;
    }

    @Override
    public String getDescription() {
        return "辅导员";
    }
}
