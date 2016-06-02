package com.zzia.wngn.design.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 23:11
 * @email wanggang@vfou.com
 * @descripe
 */
public class ClamPizza extends Pizza {

    private static Logger logger = LoggerFactory.getLogger(ClamPizza.class);

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        logger.info("Prepare " + super.name);
        super.dough = ingredientFactory.createDough();
        super.cheese = ingredientFactory.createCheese();
        super.clams = ingredientFactory.createClams();
    }
}
