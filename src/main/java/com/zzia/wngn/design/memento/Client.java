package com.zzia.wngn.design.memento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 客户端
 * @date 2016/5/25 13:54
 * @email wanggang@vfou.com
 * @descripe
 */
public class Client {

    private static Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        //打BOSS之前：血、蓝全部满值
        Role role = new Role(100, 100);
        logger.info("----------大战BOSS之前----------");
        role.display();

        //保持进度
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(role.saveMemento());

        //大战BOSS，快come Over了
        role.setBloodFlow(20);
        role.setMagicPoint(20);
        logger.info("----------大战BOSS----------");
        role.display();

        //恢复存档
        role.restoreMemento(caretaker.getMemento());
        logger.info("----------恢复----------");
        role.display();

    }
}
