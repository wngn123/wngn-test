package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:51
 * @email wanggang@vfou.com
 * @descripe
 */
public class PizzaMain {

    private static Logger logger = LoggerFactory.getLogger(PizzaMain.class);

    public static void main(String[] args) {
        logger.info("---------Joel 需要的芝加哥的深盘披萨---------");
        ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();       //建立芝加哥的披萨店
        Pizza joelPizza = chicagoPizzaStore.orderPizza("cheese");             //下订单
        logger.info("Joel ordered a " + joelPizza.getName() + "\n");

        logger.info("---------Ethan 需要的纽约风味的披萨---------");
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        logger.info("Ethan ordered a " + ethanPizza.getName() + "\n");

    }
}
