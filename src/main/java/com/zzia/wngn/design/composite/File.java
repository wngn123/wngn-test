package com.zzia.wngn.design.composite;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 23:00
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class File {

    private String name;

    public File(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void display();

    public abstract void display(String parent);
}
