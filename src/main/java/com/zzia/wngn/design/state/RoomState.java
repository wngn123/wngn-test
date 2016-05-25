package com.zzia.wngn.design.state;

/**
 * @author wanggang
 * @title 房间状态
 * @date 2016/5/24 18:00
 * @email wanggang@vfou.com
 * @descripe <p>
 * 抽象状态类。State定义了一个所有具体状态的共同接口，任何状态都实现这个相同的接口，
 * 这样一来，状态之间就可以互相转换了。
 */
public interface RoomState {
    /**
     * 预订房间
     */
    public boolean bookRoom();

    /**
     * 退订房间
     */
    public boolean unsubscribeRoom();

    /**
     * 入住
     */
    public boolean checkInRoom();

    /**
     * 退房
     */
    public boolean checkOutRoom();

}
