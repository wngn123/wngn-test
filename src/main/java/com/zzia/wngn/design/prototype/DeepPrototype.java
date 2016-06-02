package com.zzia.wngn.design.prototype;

import java.io.Serializable;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:33
 * @email wanggang@vfou.com
 * @descripe
 */
public abstract class DeepPrototype implements Serializable {

    protected String name;
    protected int status;
    protected String createDate;
    protected String updateDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    protected abstract DeepPrototype clone();
}
