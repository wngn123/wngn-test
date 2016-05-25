package com.zzia.wngn.design.state;

/**
 * @author wanggang
 * @title 房间
 * @date 2016/5/24 18:04
 * @email wanggang@vfou.com
 * @descripe <p>
 * 环境类。可以包括一些内部状态
 */
public class Room {

    /**
     * 空闲状态
     */
    private RoomState freeTimeState;
    /**
     * 入住状态
     */
    private RoomState checkInState;
    /**
     * 预订状态
     */
    private RoomState bookedState;
    /**
     * 当前状态
     */
    private RoomState state;
    /**
     * 客户
     */
    private Customer customer;

    public Room() {
        freeTimeState = new FreeTimeState(this);
        checkInState = new CheckInState(this);
        bookedState = new BookedState(this);
        //初始状态为空闲
        state = freeTimeState;
    }

    /**
     * 预订房间
     */
    public boolean bookRoom(Customer customer) {
        if (state.bookRoom()) {
            this.setCustomer(customer);
            return true;
        }
        return false;
    }

    /**
     * 退订房间
     */
    public boolean unsubscribeRoom() {
        if (state.checkOutRoom()) {
            this.setCustomer(null);
            return true;
        }
        return false;
    }

    /**
     * 入住
     */
    public boolean checkInRoom() {
        if (state.checkInRoom()) {
            this.setCustomer(customer);
            return true;
        }
        return false;
    }

    /**
     * 退房
     */
    public boolean checkOutRoom() {
        if (state.checkOutRoom()) {
            this.setCustomer(null);
            return true;
        }
        return false;
    }

    public String toString() {
        return "该房间的状态是:" + getState().getClass().getName();
    }

    public RoomState getFreeTimeState() {
        return freeTimeState;
    }

    public RoomState getCheckInState() {
        return checkInState;
    }

    public RoomState getBookedState() {
        return bookedState;
    }

    public RoomState getState() {
        return state;
    }

    public void setState(RoomState state) {
        this.state = state;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
