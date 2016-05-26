package com.zzia.wngn.design.iterator;


import java.util.ArrayList;
import java.util.List;

/**
 * @author wanggang
 * @title 电视据节目
 * @date 2016/5/26 21:29
 * @email wanggang@vfou.com
 * @descripe
 */
public class TeleplayMenu implements TelevisionMenu {

    private List<MenuItem> menuItems;

    /**
     * 构造函数完成初始化
     */
    public TeleplayMenu() {
        this.menuItems = new ArrayList<MenuItem>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    /**
     * 将电视频道节目添加菜单集合中
     *
     * @param channe      频道
     * @param name        名称
     * @param description 描述
     */
    public void addItem(int channel, String name, String description) {
        MenuItem tvMenuItem = new MenuItem(channel, name, description);
        this.menuItems.add(tvMenuItem);
    }

    public Iterator createIrerator() {
        return new TeleplayMenuIterator(menuItems);
    }
}
