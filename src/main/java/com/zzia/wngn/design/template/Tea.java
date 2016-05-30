package com.zzia.wngn.design.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 茶
 * @date 2016/5/30 20:46
 * @email wanggang@vfou.com
 * @descripe ConcreteClass:  具体子类
 */
public class Tea extends Beverage {

    private static Logger logger = LoggerFactory.getLogger(Coffee.class);

    public void addCondiments() {
        logger.info("4.Adding Lemon...");

    }

    public void brew() {
        logger.info("2.Steeping the tea...");
    }
}
