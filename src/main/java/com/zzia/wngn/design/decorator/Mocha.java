package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 摩卡
 * @date 2016/5/31 22:17
 * @email wanggang@vfou.com
 * @descripe
 */
public class Mocha extends Condiment {

    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
