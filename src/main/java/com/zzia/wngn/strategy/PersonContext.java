package com.zzia.wngn.strategy;

/**
 * @author wanggang
 * @title 旅游者
 * @date 2016/5/21 16:35
 * @email wanggang@vfou.com
 * @descripe <p>
 * 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
 */
public class PersonContext {

    private TravelStrategy strategy;

    public TravelStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public PersonContext() {
    }

    public PersonContext(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void travel() {
        this.strategy.travel();
    }
}
