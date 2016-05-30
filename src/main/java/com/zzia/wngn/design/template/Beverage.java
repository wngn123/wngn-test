package com.zzia.wngn.design.template;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 饮料
 * @date 2016/5/30 20:43
 * @email wanggang@vfou.com
 * @descripe AbstractClass: 抽象类
 * <p/>
 * 意图<br>
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。TemplateMethod 使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 * <p/>
 * 优点<br>
 * 1、模板方法模式在定义了一组算法，将具体的实现交由子类负责。<br>
 * 2、模板方法模式是一种代码复用的基本技术。<br>
 * 3、模板方法模式导致一种反向的控制结构，通过一个父类调用其子类的操作，通过对子类的扩展增加新的行为，符合“开闭原则”。<br>
 * <p/>
 * 缺点<br>
 * 每一个不同的实现都需要一个子类来实现，导致类的个数增加，是的系统更加庞大。<br>
 * <p/>
 * 使用场景<br>
 * 1、一次性实现一个算法的不变的部分，并将可变的行为留给子类来实现。<br>
 * 2、各子类中公共的行为应被提取出来并集中到一个公共父类中以避免代码重复。<br>
 * 3、控制子类的扩展。<br>
 * <p/>
 * 模式总结<br>
 * 1、模板方法模式定义了算法的步骤，将这些步骤的实现延迟到了子类。<br>
 * 2、模板方法模式为我们提供了一种代码复用的重要技巧。<br>
 * 3、模板方法模式的抽象类可以定义抽象方法、具体方法和钩子。<br>
 */
public abstract class Beverage {

    private static Logger logger = LoggerFactory.getLogger(Beverage.class);

    /**
     * 模板方法，用来控制泡茶与冲咖啡的流程
     * 申明为final，不希望子类覆盖这个方法，防止更改流程的执行顺序
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 用沸水冲泡
     * 将brew()、addCondiment()声明为抽象类，具体操作由子类实现
     */
    public abstract void brew();

    /**
     * 加入调料
     */
    public abstract void addCondiments();

    /**
     * 把水煮沸
     */
    public void boilWater() {
        logger.info("1.Boiling water...");
    }


    /**
     * 倒入杯子中
     */
    public void pourInCup() {
        logger.info("3.Pouring into Cup...");
    }
}
