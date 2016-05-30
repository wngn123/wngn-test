package com.zzia.wngn.design.command;

/**
 * @author wanggang
 * @title 切换频道命令
 * @date 2016/5/30 9:26
 * @email wanggang@vfou.com
 * @descripe ConcreteCommand 具体命令类
 */
public class ChangeChannelCommand implements Command {

    private Television television;

    public ChangeChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.changeChannel();
    }
}
