package com.zzia.wngn.design.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 火车方式旅游
 * @date 2016/5/21 13:35
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 */
public class TrainStrategy implements TravelStrategy {

    private static Logger logger = LoggerFactory.getLogger(TrainStrategy.class);

    @Override
    public void travel() {
        logger.info("travel by Train");
    }
}
