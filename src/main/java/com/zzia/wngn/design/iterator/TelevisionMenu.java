package com.zzia.wngn.design.iterator;

/**
 * @author wanggang
 * @title
 * @date 2016/5/26 21:28
 * @email wanggang@vfou.com
 * @descripe
 */
public interface TelevisionMenu {

    public void addItem(int channel, String name, String description);

    public Iterator createIrerator();
}
