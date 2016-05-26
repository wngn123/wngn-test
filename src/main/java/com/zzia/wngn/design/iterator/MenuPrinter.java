package com.zzia.wngn.design.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/26 21:29
 * @email wanggang@vfou.com
 * @descripe
 */
public class MenuPrinter {

    private static Logger logger = LoggerFactory.getLogger(MenuPrinter.class);

    private TelevisionMenu teleMenu;
    private TelevisionMenu filmMenu;

    public MenuPrinter(TelevisionMenu teleMenu, TelevisionMenu filmMenu) {
        this.teleMenu = teleMenu;
        this.filmMenu = filmMenu;
    }

    public void printMenu() {
        Iterator teleIterator = teleMenu.createIrerator();
        Iterator filmIterator = filmMenu.createIrerator();

        logger.info("电视节目有:");
        printMenu(teleIterator);
        logger.info("----------------------------------------------------------------");
        logger.info("电影节目有:");
        printMenu(filmIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            logger.info("channel:{},  name:{},  description:{}", menuItem.getChannel(), menuItem.getName(), menuItem.getDescription());
        }
    }
}
