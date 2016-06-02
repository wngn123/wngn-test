package com.zzia.wngn.design.bridge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 男人
 * @date 2016/6/1 19:00
 * @email wanggang@vfou.com
 * @descripe
 */
public class Man extends AbstractPeople {

    private static Logger logger = LoggerFactory.getLogger(Man.class);

    @Override
    public String getDescripe() {
        return "男人" + super.road.getDescripe();
    }

    @Override
    public void run() {
        logger.info(getDescripe());
    }
}
