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
public class ClamPizza extends SimplePizza {

    private static Logger logger = LoggerFactory.getLogger(ClamPizza.class);

    @Override
    public void bake() {
        logger.info("bake ClamPizza ...");
    }

    @Override
    public void box() {
        logger.info("box ClamPizza ...");
    }

    @Override
    public void cut() {
        logger.info("cut ClamPizza ...");
    }

    @Override
    public void prepare() {
        logger.info("prepare ClamPizza ...");
    }
}
