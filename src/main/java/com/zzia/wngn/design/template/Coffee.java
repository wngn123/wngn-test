package com.zzia.wngn.design.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 咖啡
 * @date 2016/5/30 20:45
 * @email wanggang@vfou.com
 * @descripe ConcreteClass:  具体子类
 */
public class Coffee extends Beverage {

    private static Logger logger = LoggerFactory.getLogger(Coffee.class);

    public void addCondiments() {
        logger.info("4.Adding Sugar and Milk...");
    }

    public void brew() {
        logger.info("2.Dripping Coffee through filter...");
    }
}
