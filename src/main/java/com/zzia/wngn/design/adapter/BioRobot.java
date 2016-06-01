package com.zzia.wngn.design.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 仿机器人
 * @date 2016/6/1 21:07
 * @email wanggang@vfou.com
 * @descripe
 */
public class BioRobot implements Robot {

    private static Logger logger = LoggerFactory.getLogger(BioRobot.class);

    public void cry() {
        logger.info("仿生机器人叫.....");
    }

    public void move() {
        logger.info("仿生机器人慢慢移动....");
    }
}
