package com.zzia.wngn.design.command;

/**
 * @author wanggang
 * @title
 * @date 2016/5/30 9:27
 * @email wanggang@vfou.com
 * @descripe
 */
public class CommandMain {

    public static void main(String a[]) {

        Command openCommand, closeCommand, changeCommand;

        Television television = new Television();
        openCommand = new OpenTelevisionCommand(television);
        closeCommand = new CloseTelevisionCommand(television);
        changeCommand = new ChangeChannelCommand(television);

        Controller control = new Controller(openCommand, closeCommand, changeCommand);

        control.open();           //打开电视机
        control.change();         //换频道
        control.close();          //关闭电视机
    }
}
