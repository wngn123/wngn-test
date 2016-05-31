package com.zzia.wngn.design.composite;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/31 23:03
 * @email wanggang@vfou.com
 * @descripe
 */
public class ImageFile extends File {

    private static Logger logger = LoggerFactory.getLogger(ImageFile.class);

    public ImageFile(String name) {
        super(name);
    }

    public void display() {
        logger.info("这是图像文件，文件名:{}", super.getName());
    }

    public void display(String parent) {
        logger.info("这是图像文件，路径:{}/{}", parent, super.getName());
    }
}
