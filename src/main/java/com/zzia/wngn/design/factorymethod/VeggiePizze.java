package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:37
 * @email wanggang@vfou.com
 * @descripe
 */
public class VeggiePizze extends SimplePizza {
    private static Logger logger = LoggerFactory.getLogger(VeggiePizze.class);

    @Override
    public void bake() {
        logger.info("bake VeggiePizze ...");
    }

    @Override
    public void box() {
        logger.info("box VeggiePizze ...");
    }

    @Override
    public void cut() {
        logger.info("cut VeggiePizze ...");
    }

    @Override
    public void prepare() {
        logger.info("prepare VeggiePizze ...");
    }
}
