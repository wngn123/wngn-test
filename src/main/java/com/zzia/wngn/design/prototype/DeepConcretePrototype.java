package com.zzia.wngn.design.prototype;

import java.io.*;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:39
 * @email wanggang@vfou.com
 * @descripe
 */
public class DeepConcretePrototype extends DeepPrototype implements Serializable {

    private String id;
    private String group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    protected DeepPrototype clone() {
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //将对象写到流里
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            //从流里读回来
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (DeepPrototype) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(bos, oos, bis, ois);
        }
        return null;
    }

    private void close(ByteArrayOutputStream bos, ObjectOutputStream oos, ByteArrayInputStream bis, ObjectInputStream ois) {
        if (bos != null) {
            try {
                bos.close();
            } catch (Exception e) {
            }
        }

        if (oos != null) {
            try {
                oos.close();
            } catch (Exception e) {
            }
        }

        if (bis != null) {
            try {
                bis.close();
            } catch (Exception e) {
            }
        }

        if (ois != null) {
            try {
                ois.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public String toString() {

        return "DeepConcretePrototype{" +
                "id='" + id + '\'' +
                ", group='" + group + '\'' +
                ", name='" + super.name + '\'' +
                ", createDate='" + createDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", statue=" + super.status +
                '}';
    }
}
