package com.zzia.wngn.design.state;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wanggang
 * @title
 * @date 2016/5/24 18:15
 * @email wanggang@vfou.com
 * @descripe
 */
public class RoomStateMain {

    private static Logger logger = LoggerFactory.getLogger(RoomStateMain.class);

    public static void main(String[] args) {
        /* 有3间房 */
        Room[] rooms = new Room[2];
        Customer[] customers = new Customer[2];
        /* 初始化 */
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room();
            customers[i] = new Customer("customer_" + i);
        }


        //第一间房
        rooms[0].bookRoom(customers[0]);    //预订
        rooms[0].bookRoom(customers[1]);    //预订
        rooms[0].checkInRoom();   //入住
        rooms[0].bookRoom(customers[0]);    //预订
        logger.info("" + rooms[0]);

        //第二间房
        rooms[1].checkInRoom();
        rooms[1].bookRoom(customers[0]);
        rooms[1].checkOutRoom();
        rooms[1].bookRoom(customers[0]);
        logger.info("" + rooms[1]);
    }
}
