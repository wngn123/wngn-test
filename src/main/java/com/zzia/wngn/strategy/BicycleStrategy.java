package com.zzia.wngn.strategy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 自行车方式旅游
 * @date 2016/5/21 13:37
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 */
public class BicycleStrategy implements TravelStrategy {

    private static Logger logger = LoggerFactory.getLogger(BicycleStrategy.class);

    @Override
    public void travel() {
        logger.info("travel by Bicycle");
    }
}
