package com.zzia.wngn.design.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:53
 * @email wanggang@vfou.com
 * @descripe
 */
public class Screen {

    private static Logger logger = LoggerFactory.getLogger(Screen.class);

    public void up() {
        logger.info("升起了频幕....");
    }

    public void down() {
        logger.info("下降了频幕....");
    }
}
