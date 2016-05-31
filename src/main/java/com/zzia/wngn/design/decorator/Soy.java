package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 大豆
 * @date 2016/5/31 22:17
 * @email wanggang@vfou.com
 * @descripe
 */
public class Soy extends Condiment {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
