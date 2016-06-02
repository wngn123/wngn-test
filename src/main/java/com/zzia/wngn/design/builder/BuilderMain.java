package com.zzia.wngn.design.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:15
 * @email wanggang@vfou.com
 * @descripe
 */
public class BuilderMain {

    private static Logger logger = LoggerFactory.getLogger(BuilderMain.class);

    public static void main(String[] args) {
        //服务员
        KFCWaiter waiter = new KFCWaiter();
        //套餐A
        MealEconomic economic = new MealEconomic();
        MealLuxurious luxurious = new MealLuxurious();
        waiter.setMealBuilder(economic);
        Meal meal = waiter.construct();
        logger.info("经济版套餐的组成部分:");
        logger.info(meal.getFood() + "---" + meal.getDrink());

        waiter.setMealBuilder(luxurious);
        meal = waiter.construct();
        logger.info("豪华版套餐的组成部分:");
        logger.info(meal.getFood() + "---" + meal.getDrink());
    }
}
