package com.zzia.wngn.design.chain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 10:49
 * @email wanggang@vfou.com
 * @descripe
 */
public class Departmentor extends Leader {

    private static Logger logger = LoggerFactory.getLogger(Departmentor.class);

    public Departmentor(String name) {
        super(name);
        super.limit = Leader.DEPAETMENTOR_DAY;
    }

    @Override
    public String getDescription() {
        return "系主任";
    }
}
