package com.zzia.wngn.design.command;

/**
 * @author wanggang
 * @title 控制器
 * @date 2016/5/30 9:26
 * @email wanggang@vfou.com
 * @descripe 接收者
 */
public class Controller {

    private Command open;
    private Command close;
    private Command change;

    public Controller(Command open, Command close, Command change) {
        this.open = open;
        this.close = close;
        this.change = change;
    }

    /**
     * 打开电视剧
     */
    public void open() {
        open.execute();
    }

    /**
     * 关闭电视机
     */
    public void close() {
        close.execute();
    }

    /**
     * 换频道
     */
    public void change() {

        change.execute();
    }
}
