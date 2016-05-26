package com.zzia.wngn.design.iterator;

/**
 * @author wanggang
 * @title 电影菜单迭代器
 * @date 2016/5/26 21:27
 * @email wanggang@vfou.com
 * @descripe
 */
public class FilmMenuIterator implements Iterator {

    private MenuItem[] menuItems;
    private int position = 0;

    public FilmMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position > menuItems.length - 1 || menuItems[position] == null) {
            return false;
        }
        return true;
    }

    public Object next() {
        MenuItem menuItem = menuItems[position];
        position++;
        return menuItem;
    }
}
