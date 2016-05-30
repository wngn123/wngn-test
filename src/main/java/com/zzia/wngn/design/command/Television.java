package com.zzia.wngn.design.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 电视机类
 * @date 2016/5/30 9:25
 * @email wanggang@vfou.com
 * @descripe
 */
public class Television {

    private static Logger logger = LoggerFactory.getLogger(Television.class);

    private Status status = Status.OFF;

    public void open() {
        if (status == Status.OFF) {
            logger.info("打开电视机......");
            this.status = Status.ON;
        } else {
            logger.info("电视机已经处于打开状态......");
        }
    }

    public void close() {
        if (status == Status.ON) {
            logger.info("关闭电视机......");
            this.status = Status.OFF;
        } else {
            logger.info("电视机已经处于关闭状态......");
        }
    }

    public void changeChannel() {
        if (status == Status.ON) {
            logger.info("切换电视频道......");
        } else {
            logger.info("请先打开电视机......");
        }
    }
}
