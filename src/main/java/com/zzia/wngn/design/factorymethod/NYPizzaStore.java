package com.zzia.wngn.design.factorymethod;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:50
 * @email wanggang@vfou.com
 * @descripe
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String item) {
        Pizza pizza = null;
        if ("cheese".equals(item)) {
            pizza = new NYStyleCheesePizza();
        } else if ("veggie".equals(item)) {
            pizza = new NYStyleVeggiePizza();
        } else if ("clam".equals(item)) {
            pizza = new NYStyleClamPizza();
        } else if ("pepperoni".equals(item)) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
