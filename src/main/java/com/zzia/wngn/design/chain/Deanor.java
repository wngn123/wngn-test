package com.zzia.wngn.design.chain;

/**
 * @author wanggang
 * @title 院长
 * @date 2016/5/30 10:49
 * @email wanggang@vfou.com
 * @descripe
 */
public class Deanor extends Leader {

    public Deanor(String name) {
        super(name);
        super.limit = Leader.DEANOR_DAY;
    }

    @Override
    public String getDescription() {
        return "院长";
    }

}
