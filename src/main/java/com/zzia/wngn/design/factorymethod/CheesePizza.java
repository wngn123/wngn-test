package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 具体披萨
 * @date 2016/6/2 22:33
 * @email wanggang@vfou.com
 * @descripe
 */
public class CheesePizza extends SimplePizza {

    private static Logger logger = LoggerFactory.getLogger(CheesePizza.class);

    @Override
    public void bake() {
        logger.info("bake CheesePizza ...");
    }

    @Override
    public void box() {
        logger.info("box CheesePizza ...");
    }

    @Override
    public void cut() {
        logger.info("cut CheesePizza ...");
    }

    @Override
    public void prepare() {
        logger.info("prepare CheesePizza ...");
    }
}
