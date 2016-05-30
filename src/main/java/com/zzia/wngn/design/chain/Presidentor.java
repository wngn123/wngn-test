package com.zzia.wngn.design.chain;

/**
 * @author wanggang
 * @title 校长
 * @date 2016/5/30 10:50
 * @email wanggang@vfou.com
 * @descripe
 */
public class Presidentor extends Leader {

    public Presidentor(String name) {
        super(name);
        super.limit = Leader.PRESIDENTOR_DAY;
    }

    @Override
    public String getDescription() {
        return "校长";
    }
}
