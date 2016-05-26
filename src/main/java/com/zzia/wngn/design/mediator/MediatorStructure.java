package com.zzia.wngn.design.mediator;

/**
 * @author wanggang
 * @title 具体中介者角色
 * @date 2016/5/26 11:23
 * @email wanggang@vfou.com
 * @descripe
 */
public class MediatorStructure extends Mediator {

    //首先中介结构必须知道所有房主和租房者的信息
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public void constact(String message, Person person) {
        //如果是房主，则租房者获得信息；反正则是房主获得信息
        if (person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }
}
