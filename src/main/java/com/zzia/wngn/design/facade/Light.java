package com.zzia.wngn.design.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:51
 * @email wanggang@vfou.com
 * @descripe
 */
public class Light {

    private static Logger logger = LoggerFactory.getLogger(Light.class);

    public void on() {
        logger.info("打开了灯....");
    }

    public void off() {
        logger.info("关闭了灯....");
    }
}
