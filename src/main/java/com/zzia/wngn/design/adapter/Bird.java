package com.zzia.wngn.design.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 鸟
 * @date 2016/6/1 21:12
 * @email wanggang@vfou.com
 * @descripe
 */
public class Bird {

    private static Logger logger = LoggerFactory.getLogger(Bird.class);

    public void jiji() {
        logger.info("唧唧..........");
    }

    public void fly() {
        logger.info("我在飞........");
    }
}
