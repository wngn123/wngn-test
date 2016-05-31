package com.zzia.wngn.design.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 23:00
 * @email wanggang@vfou.com
 * @descripe
 */
public class Folder extends File {

    private static Logger logger = LoggerFactory.getLogger(Folder.class);

    private List<File> files;

    public Folder(String name) {
        super(name);
        files = new ArrayList<File>();
    }

    /**
     * 浏览文件夹中的文件
     */
    public void display() {
        logger.info("这是文件夹，文件夹名:{}", super.getName());
        for (File file : this.files) {
            file.display();
        }
    }

    /**
     * 浏览文件夹中的文件
     */
    public void display(String parent) {
        logger.info("这是文件夹，路径:{}/{}", parent, super.getName());
        for (File file : this.files) {
            file.display(parent + "/" + super.getName());
        }
    }

    /**
     * @param file
     * @return void
     * @desc 向文件夹中添加文件
     */
    public void add(File file) {
        files.add(file);
    }

    /**
     * @param file
     * @return void
     * @desc 从文件夹中删除文件
     */
    public void remove(File file) {
        files.remove(file);
    }
}
