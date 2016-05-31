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
public class VideoFile extends File {

    private static Logger logger = LoggerFactory.getLogger(VideoFile.class);

    public VideoFile(String name) {
        super(name);
    }

    public void display() {
        logger.info("这是影像文件，文件名:{}", super.getName());
    }

    public void display(String parent) {
        logger.info("这是影像文件，路径:{}/{}", parent, super.getName());
    }
}
