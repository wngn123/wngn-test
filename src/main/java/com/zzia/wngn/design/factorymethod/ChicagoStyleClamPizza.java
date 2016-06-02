package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:59
 * @email wanggang@vfou.com
 * @descripe
 */
public class ChicagoStyleClamPizza extends Pizza {

    private static Logger logger = LoggerFactory.getLogger(ChicagoStyleClamPizza.class);

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sause = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Clam");
    }

    public void cut() {
        logger.info("Cutting the Pizza into square slices");
    }
}
