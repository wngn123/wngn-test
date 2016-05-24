package com.zzia.wngn.design.vistor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VistorMain {

    private static Logger logger = LoggerFactory.getLogger(VistorMain.class);

    public static void main(String[] args) {
        Merchandise[] items = new Merchandise[]{new Book(20, "1234"), new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};
        int total = calculatePrice(items);
        logger.info("Total Cost = " + total);

        test(items);
    }

    private static void test(Merchandise[] items) {
        CartVisitor visitor = new CartVisitor();
        Structure structure = new Structure();
        for (Merchandise item : items) {
            structure.addElement(item);
        }
        structure.accept(visitor);
    }

    private static int calculatePrice(Merchandise[] items) {
        CartVisitor visitor = new CartVisitor();
        int sum = 0;
        for (Merchandise item : items) {
            sum = sum + item.accept(visitor);
        }
        return sum;
    }

}
