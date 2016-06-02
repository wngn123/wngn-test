package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 23:00
 * @email wanggang@vfou.com
 * @descripe
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    private static Logger logger = LoggerFactory.getLogger(ChicagoStyleVeggiePizza.class);

    public ChicagoStyleVeggiePizza() {
        name = "Chicago Style Deep Dish Veggie Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Veggie");
    }

    public void cut() {
        logger.info("Cutting the Pizza into square slices");
    }
}
