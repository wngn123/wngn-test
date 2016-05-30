package com.zzia.wngn.design.command;

/**
 * @author wanggang
 * @title 关闭电视命令
 * @date 2016/5/30 9:27
 * @email wanggang@vfou.com
 * @descripe ConcreteCommand 具体命令类
 */
public class CloseTelevisionCommand implements Command {

    private Television television;

    public CloseTelevisionCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.close();
    }
}
