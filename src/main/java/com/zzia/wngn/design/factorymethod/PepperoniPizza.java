package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:36
 * @email wanggang@vfou.com
 * @descripe
 */
public class PepperoniPizza extends SimplePizza {

    private static Logger logger = LoggerFactory.getLogger(PepperoniPizza.class);

    @Override
    public void bake() {
        logger.info("bake PepperoniPizza ...");
    }

    @Override
    public void box() {
        logger.info("box PepperoniPizza ...");
    }

    @Override
    public void cut() {
        logger.info("cut PepperoniPizza ...");
    }

    @Override
    public void prepare() {
        logger.info("prepare PepperoniPizza ...");
    }
}
