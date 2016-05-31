package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 牛奶
 * @date 2016/5/31 22:17
 * @email wanggang@vfou.com
 * @descripe
 */
public class Milk extends Condiment {

    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.3;
    }
}
