package com.zzia.wngn.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 女人
 * @date 2016/6/1 18:55
 * @email wanggang@vfou.com
 * @descripe
 */
public class Woman extends AbstractPeople {

    private static Logger logger = LoggerFactory.getLogger(Woman.class);

    @Override
    public String getDescripe() {
        return "女人" + super.road.getDescripe();
    }

    @Override
    public void run() {
        logger.info(getDescripe());
    }
}
