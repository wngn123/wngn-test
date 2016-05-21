package com.zzia.wngn.strategy;

/**
 * @author wanggang
 * @title 旅游策略
 * @date 2016/5/21 13:29
 * @email wanggang@vfou.com
 * @descripe <p>
 * 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
 */
public interface TravelStrategy {

    public void travel();

}
