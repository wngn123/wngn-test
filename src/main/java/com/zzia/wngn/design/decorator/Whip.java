package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 奶油
 * @date 2016/5/31 22:18
 * @email wanggang@vfou.com
 * @descripe
 */
public class Whip extends Condiment {

    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " , Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
