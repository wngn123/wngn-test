package com.zzia.wngn.design.factorymethod;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:50
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /*
     * 创建pizza的方法交给子类去实现
     */
    public abstract Pizza createPizza(String type);
}
