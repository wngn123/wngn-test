package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:49
 * @email wanggang@vfou.com
 * @descripe
 */
public class ChicagoStyleCheesePizza extends Pizza {

    private static Logger logger = LoggerFactory.getLogger(ChicagoStyleCheesePizza.class);

    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }

    public void cut() {
        logger.info("Cutting the Pizza into square slices");
    }
}
