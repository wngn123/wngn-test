package com.zzia.wngn.design.builder;

/**
 * @author wanggang
 * @title 经济版套餐
 * @date 2016/6/2 22:14
 * @email wanggang@vfou.com
 * @descripe
 */
public class MealEconomic extends MealBuilder {

    public void buildDrink() {
        meal.setDrink("一杯可乐");
    }

    public void buildFood() {
        meal.setFood("一盒薯条");
    }
}
