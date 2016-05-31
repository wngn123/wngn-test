package com.zzia.wngn.design.decorator;

/**
 * @author wanggang
 * @title 综合咖啡
 * @date 2016/5/31 22:14
 * @email wanggang@vfou.com
 * @descripe
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
