package com.zzia.wngn.design.vistor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 具体访问者角色
 * @date 2016年5月20日 上午8:55:36
 * @email wanggang@vfou.com
 * @descripe 实现Visitor声明的接口
 */
public class CartVisitor implements Visitor {

    private Logger logger = LoggerFactory.getLogger(CartVisitor.class);

    public int visit(Book book) {
        int cost = 0;
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else
            cost = book.getPrice();
        logger.info("Book ISBN::" + book.getNumber() + " cost =" + cost);
        return cost;
    }

    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg() * fruit.getWeight();
        logger.info(fruit.getName() + " cost = " + cost);
        return cost;
    }

}
