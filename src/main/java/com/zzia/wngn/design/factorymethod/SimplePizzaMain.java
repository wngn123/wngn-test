package com.zzia.wngn.design.factorymethod;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:33
 * @email wanggang@vfou.com
 * @descripe
 */
public class SimplePizzaMain {

    public static void main(String[] args) {
        SimplePizzaFactory factory = new SimplePizzaFactory();
        SimplePizza pizza = factory.createPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

}
