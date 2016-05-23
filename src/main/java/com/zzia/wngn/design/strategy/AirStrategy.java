package com.zzia.wngn.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 飞机方式旅游
 * @date 2016/5/21 13:29
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 */
public class AirStrategy implements TravelStrategy {

    private static Logger logger = LoggerFactory.getLogger(AirStrategy.class);

    @Override
    public void travel() {
        logger.info("travel by Air");
    }
}
