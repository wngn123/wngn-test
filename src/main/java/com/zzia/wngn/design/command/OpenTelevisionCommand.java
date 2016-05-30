package com.zzia.wngn.design.command;

/**
 * @author wanggang
 * @title 打开电视命令
 * @date 2016/5/30 9:26
 * @email wanggang@vfou.com
 * @descripe ConcreteCommand 具体命令类
 */
public class OpenTelevisionCommand implements Command {

    private Television television;

    public OpenTelevisionCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.open();
    }
}
