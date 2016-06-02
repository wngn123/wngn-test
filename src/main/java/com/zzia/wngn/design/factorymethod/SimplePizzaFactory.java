package com.zzia.wngn.design.factorymethod;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:32
 * @email wanggang@vfou.com
 * @descripe
 */
public class SimplePizzaFactory {

    public SimplePizza createPizza(String type) {

        SimplePizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizze();
        }
        return pizza;
    }
}
