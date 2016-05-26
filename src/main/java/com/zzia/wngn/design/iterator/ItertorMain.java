package com.zzia.wngn.design.iterator;

/**
 * @author wanggang
 * @title
 * @date 2016/5/26 21:33
 * @email wanggang@vfou.com
 * @descripe
 */
public class ItertorMain {

    public static void main(String[] args) {
        TeleplayMenu tvMenu = new TeleplayMenu();
        FilmMenu filmMenu = new FilmMenu();
        MenuPrinter mainMenu = new MenuPrinter(tvMenu, filmMenu);
        mainMenu.printMenu();
    }
}
