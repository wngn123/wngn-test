package com.zzia.wngn.design.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 狗
 * @date 2016/6/1 21:07
 * @email wanggang@vfou.com
 * @descripe
 */
public class Dog {

    private static Logger logger = LoggerFactory.getLogger(Dog.class);

    public void wang() {
        logger.info("小狗叫：汪汪.....");
    }

    public void run() {
        logger.info("小狗快快跑......");
    }
}
