package com.zzia.wngn.design.factorymethod;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 22:48
 * @email wanggang@vfou.com
 * @descripe
 */
public class Pizza {

    private static Logger logger = LoggerFactory.getLogger(Pizza.class);

    protected String name;        //名称
    protected String dough;       //面团
    protected String sause;       //酱料
    protected List<String> toppings = new ArrayList<String>();       //佐料


    public void prepare() {
        logger.info("Preparing " + name);
        logger.info("Tossing dough");
        logger.info("Adding sause");
        logger.info("Adding toppings");
        for (int i = 0; i < toppings.size(); i++) {
            logger.info("   " + toppings.get(i));
        }
    }

    public void bake() {
        logger.info("Bake for 25 minutes at 350");
    }

    public void cut() {
        logger.info("Cutting the pizza into diagonal slices");
    }

    public void box() {
        logger.info("Place pizza in official SimplePizzaMain box");
    }

    public String getName() {
        return name;
    }
}
