package com.zzia.wngn.design.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 9:36
 * @email wanggang@vfou.com
 * @descripe <p>
 * 意图<br>
 * 运用共享技术有效地支持大量细粒度的对象。<br>
 * <p>
 * 适用性<br>
 * 一个应用程序使用了大量的对象。<br>
 * 完全由于使用大量的对象，造成很大的存储开销。<br>
 * 对象的大多数状态都可变为外部状态。<br>
 * 如果删除对象的外部状态，那么可以用相对较少的共享对象取代很多组对象。<br>
 * 应用程序不依赖于对象标识。由于Flyweight 对象可以被共享，对于概念上明显有别的对象，标识测试将返回真值。<br>
 * <p>
 * 优点<br>
 * 1、享元模式的优点在于它能够极大的减少系统中对象的个数。<br>
 * 2、享元模式由于使用了外部状态，外部状态相对独立，不会影响到内部状态，所以享元模式使得享元对象能够在不同的环境被共享。
 * <p>
 * 缺点<br>
 * 1、由于享元模式需要区分外部状态和内部状态，使得应用程序在某种程度上来说更加复杂化了。<br>
 * 2、为了使对象可以共享，享元模式需要将享元对象的状态外部化，而读取外部状态使得运行时间变长。<br>
 * <p>
 * 模式适用场景<br>
 * 1、如果一个系统中存在大量的相同或者相似的对象，由于这类对象的大量使用，会造成系统内存的耗费，
 * 可以使用享元模式来减少系统中对象的数量。<br>
 * 2、对象的大部分状态都可以外部化，可以将这些外部状态传入对象中。<br>
 * <p>
 * 模式总结<br>
 * 1、享元模式可以极大地减少系统中对象的数量。但是它可能会引起系统的逻辑更加复杂化。<br>
 * 2、享元模式的核心在于享元工厂，它主要用来确保合理地共享享元对象。<br>
 * 3、内部状态为不变共享部分，存储于享元享元对象内部，而外部状态是可变部分，它应当油客户端来负责。<br>
 */
public class FlyweightMain {

    private static Logger logger = LoggerFactory.getLogger(FlyweightMain.class);

    public static void main(String[] args) {
        Shape shape1 = FlyweightFactory.getShape("红色");
        shape1.draw();

        Shape shape2 = FlyweightFactory.getShape("灰色");
        shape2.draw();

        Shape shape3 = FlyweightFactory.getShape("绿色");
        shape3.draw();

        Shape shape4 = FlyweightFactory.getShape("红色");
        shape4.draw();

        Shape shape5 = FlyweightFactory.getShape("灰色");
        shape5.draw();

        Shape shape6 = FlyweightFactory.getShape("灰色");
        shape6.draw();

        logger.info("一共绘制了" + FlyweightFactory.getSum() + "中颜色的圆形");
    }
}
