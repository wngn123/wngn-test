package com.zzia.wngn.design.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 模仿鸟机器人
 * @date 2016/6/1 21:12
 * @email wanggang@vfou.com
 * @descripe
 */
public class BirdAdapter implements Robot {

    private static Logger logger = LoggerFactory.getLogger(BirdAdapter.class);

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void cry() {
        logger.info("机器人模拟鸟叫...");
        bird.jiji();
    }

    public void move() {
        logger.info("机器人模拟鸟飞...");
        bird.fly();
    }
}

