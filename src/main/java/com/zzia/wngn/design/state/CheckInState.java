package com.zzia.wngn.design.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title 入住状态
 * @date 2016/5/24 18:15
 * @email wanggang@vfou.com
 * @descripe <p>
 * 具体状态类。具体状态类，用于处理来自Context的请求，
 * 每一个ConcreteState都提供了它对自己请求的实现，所以，当Context改变状态时行为也会跟着改变。
 */
public class CheckInState implements RoomState {

    private static Logger logger = LoggerFactory.getLogger(BookedState.class);

    private Room room;

    public CheckInState(Room hotelManagement) {
        this.room = hotelManagement;
    }

    public boolean bookRoom() {
        logger.info("该房间已经有人入住了...");
        return false;
    }

    public boolean checkInRoom() {
        logger.info("该房间已经有人入住了...");
        return false;
    }

    public boolean checkOutRoom() {
        logger.info("退房成功....");
        room.setState(room.getFreeTimeState());     //状态变成空闲
        return true;
    }

    public boolean unsubscribeRoom() {
        logger.info("该房间已经有人入住了...");
        return false;
    }
}
