package com.zzia.wngn.design.iterator;

import java.util.List;

/**
 * @author wanggang
 * @title 电视据节目迭代器
 * @date 2016/5/26 21:28
 * @email wanggang@vfou.com
 * @descripe
 */
public class TeleplayMenuIterator implements Iterator {

    private List<MenuItem> menuItems;
    private int position = 0;

    public TeleplayMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    public boolean hasNext() {
        if (position > menuItems.size() - 1 || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    public Object next() {
        MenuItem menuItem = menuItems.get(position);
        position++;
        return menuItem;
    }
}
