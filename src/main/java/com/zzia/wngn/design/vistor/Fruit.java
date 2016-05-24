package com.zzia.wngn.design.vistor;

/**
 * @author wanggang
 * @title 水果商品
 * @date 2016年5月20日 上午8:59:55
 * @email wanggang@vfou.com
 * @descripe 具体元素，实现了抽象元素所定义的接受操作接口
 */
public class Fruit implements Merchandise {

    private int pricePerKg;
    private int weight;
    private String name;

    public Fruit(int priceKg, int wt, String nm) {
        this.pricePerKg = priceKg;
        this.weight = wt;
        this.name = nm;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return this.name;
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
