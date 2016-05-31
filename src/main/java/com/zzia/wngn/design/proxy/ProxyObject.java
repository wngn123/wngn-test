package com.zzia.wngn.design.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 代理对象角色
 * @date 2016/5/31 9:20
 * @email wanggang@vfou.com
 * @descripe <p>
 * 意图<br>
 * 为其他对象提供一种代理以控制对这个对象的访问。<br>
 * <p>
 * 优点<br>
 * 1、代理模式能够协调调用者和被调用者，在一定程度上降低了系统的耦合度。<br>
 * 2、代理对象可以在客户端和目标对象之间起到中介的作用，这样起到了的作用和保护了目标对象的<br>
 * <p>
 * 缺点<br>
 * 1、由于在客户端和真实主题之间增加了代理对象，因此有些类型的代理模式可能会造成请求的处理速度变慢。<br>
 * 2、实现代理模式需要额外的工作，有些代理模式的实现非常复杂。<br>
 * <p>
 * 模式适用场景<br>
 * 1、远程代理：为一个对象在不同的地址空间提供局部代表。这样可以隐藏一个对象存在于不同地址空间的事实。<br>
 * 2、虚拟代理：通过使用过一个小的对象代理一个大对象。这样就可以减少系统的开销。<br>
 * 3、保护代理：用来控制对真实对象的访问权限。<br>
 * <p>
 * 模式总结
 * 1、代理模式是通过使用引用代理对象来访问真实对象，在这里代理对象充当用于连接客户端和真实对象的中介者。<br>
 * 2、代理模式主要用于远程代理、虚拟代理和保护代理。其中保护代理可以进行访问权限控制。<br>
 */
public class ProxyObject {

    private static Logger logger = LoggerFactory.getLogger(ProxyObject.class);

    RealObject realObject = new RealObject();

    public void proxy() {
        //调用目标对象之前可以做相关操作
        logger.info("before");
        realObject.operation();
        //调用目标对象之后可以做相关操作
        logger.info("after");
    }
}
