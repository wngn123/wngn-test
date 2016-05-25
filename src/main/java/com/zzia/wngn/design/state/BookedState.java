package com.zzia.wngn.design.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 预定状态
 * @date 2016/5/24 18:15
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体状态类。具体状态类，用于处理来自Context的请求，
 * 每一个ConcreteState都提供了它对自己请求的实现，所以，当Context改变状态时行为也会跟着改变。
 */
public class BookedState implements RoomState {

    private static Logger logger = LoggerFactory.getLogger(BookedState.class);

    private Room room;

    public BookedState(Room room) {
        this.room = room;
    }

    public boolean bookRoom() {
        logger.info("该房间已经有人预定了...");
        return false;
    }

    public boolean checkInRoom() {
        logger.info("入住成功...");
        room.setState(room.getCheckInState()); //状态变成入住
        return true;
    }

    public boolean checkOutRoom() {
        logger.info("你还没有入住该房间...");
        return false;
    }

    public boolean unsubscribeRoom() {
        logger.info("退订成功,欢迎下次光临...");
        room.setState(room.getFreeTimeState());   //变成空闲状态
        return true;
    }
}
