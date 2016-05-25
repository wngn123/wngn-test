package com.zzia.wngn.design.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 空闲状态
 * @date 2016/5/24 18:11
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体状态类。具体状态类，用于处理来自Context的请求，
 * 每一个ConcreteState都提供了它对自己请求的实现，所以，当Context改变状态时行为也会跟着改变。
 */
public class FreeTimeState implements RoomState {

    private static Logger logger = LoggerFactory.getLogger(FreeTimeState.class);

    private Room room;

    public FreeTimeState(Room room) {
        this.room = room;
    }


    public boolean bookRoom() {
        logger.info("您已经成功预订了...");
        room.setState(room.getBookedState());
        return true;
    }

    public boolean checkInRoom() {
        logger.info("您已经成功入住了...");
        room.setState(room.getCheckInState());
        return true;
    }

    public boolean checkOutRoom() {
        logger.info("你还没有入住该房间...");
        return false;
    }

    public boolean unsubscribeRoom() {
        logger.info("你没有订阅过该房间...");
        return false;
    }
}
