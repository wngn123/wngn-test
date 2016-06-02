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
public abstract class Pizza {

    private static Logger logger = LoggerFactory.getLogger(Pizza.class);

    /*
     * 每个披萨都持有一组在准备时会用到的原料
     */
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clams;

    /*
     * prepare()方法声明为抽象方法。在这个方法中，我们需要收集披萨所需要的原料，而这些原料都是来自原料工厂
     */
    public abstract void prepare();

    public void bake() {
        logger.info("Bake for 25 munites at 350");
    }

    void cut() {
        logger.info("Cutting the pizza into diagonal slices");
    }

    void box() {
        logger.info("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
