package com.zzia.wngn.design.abstractfactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 23:10
 * @email wanggang@vfou.com
 * @descripe
 */
public class CheesePizza extends Pizza {

    private static Logger logger = LoggerFactory.getLogger(CheesePizza.class);

    PizzaIngredientFactory ingredientFactory;

    /*
     * 要制作披萨必须要有制作披萨的原料，而这些原料是从原料工厂运来的
     */
    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
        prepare();
    }

    /**
     * 实现prepare方法
     * prepare 方法一步一步地创建芝士比萨，每当需要原料时，就跟工厂要
     */
    public void prepare() {
        logger.info("Prepareing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
