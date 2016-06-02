package com.zzia.wngn.design.abstractfactory;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 23:08
 * @email wanggang@vfou.com
 * @descripe
 */
public interface PizzaIngredientFactory {
    /*
     * 在接口中，每个原料都有一个对应的方法创建该原料
     */
    public Dough createDough();

    public Sauce createSauce();

    public Cheese createCheese();

    public Veggies[] createVeggies();

    public Pepperoni createPepperoni();

    public Clams createClams();
}
