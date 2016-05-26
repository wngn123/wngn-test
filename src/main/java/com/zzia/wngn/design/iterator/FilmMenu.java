package com.zzia.wngn.design.iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 电影菜单
 * @date 2016/5/26 21:28
 * @email wanggang@vfou.com
 * @descripe
 */
public class FilmMenu implements TelevisionMenu {

    private static Logger logger = LoggerFactory.getLogger(FilmMenu.class);

    /**
     * 菜单最大长度
     */
    private static final int MAX_ITEMS = 5;

    private int numberOfItems = 0;

    private MenuItem[] menuItems;

    /**
     * 构造函数完成初始化
     */
    public FilmMenu() {
        this.menuItems = new MenuItem[MAX_ITEMS];
        addItem(1, "绝世天劫", "这是布鲁斯威利斯主演的...");
        addItem(2, "达芬奇密码", "这是我最喜欢的电影之一...");
        addItem(3, "黑客帝国123", "不知道你能够看懂不???");
        addItem(4, "我的女友是机器人", "一部我不反感的经典爱情电影...");
        addItem(5, "肖申克的救赎", "自由，幸福，离你有多远");
    }

    /**
     * 将电影添加到菜单项中
     *
     * @param channe
     * @param name
     * @param description
     */
    public void addItem(int channe, String name, String description) {
        MenuItem menuiItem = new MenuItem(channe, name, description);
        //判断数组是否越界
        if (numberOfItems > MAX_ITEMS) {
            logger.info("不好意思，菜单满了....");
        } else {
            menuItems[numberOfItems] = menuiItem;
            numberOfItems++;
        }
    }

    public Iterator createIrerator() {
        return new FilmMenuIterator(menuItems);
    }
}
