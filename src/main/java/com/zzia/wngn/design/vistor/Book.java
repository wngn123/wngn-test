package com.zzia.wngn.design.vistor;

/**
 * @author wanggang
 * @title 书籍商品
 * @date 2016年5月20日 上午8:58:53
 * @email wanggang@vfou.com
 * @descripe 具体元素，实现了抽象元素所定义的接受操作接口
 */
public class Book implements Merchandise {

    private int price;
    private String number;

    public Book(int cost, String number) {
        this.price = cost;
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public String getNumber() {
        return number;
    }

    public int accept(Visitor visitor) {
        return visitor.visit(this);
    }

}
