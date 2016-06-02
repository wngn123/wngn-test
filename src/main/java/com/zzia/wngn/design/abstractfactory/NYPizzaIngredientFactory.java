package com.zzia.wngn.design.abstractfactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 23:10
 * @email wanggang@vfou.com
 * @descripe
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Cheese createCheese() {
        return new Cheese();
    }

    @Override
    public Clams createClams() {
        return new Clams();
    }

    @Override
    public Dough createDough() {
        return new Dough();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new Pepperoni();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RefPepper()};
        return veggies;
    }
}
