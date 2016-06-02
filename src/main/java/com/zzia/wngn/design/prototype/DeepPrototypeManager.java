package com.zzia.wngn.design.prototype;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:18
 * @email wanggang@vfou.com
 * @descripe
 */
public class DeepPrototypeManager {

    private static Map<String, DeepPrototype> map;
    public static String DEEP = "deep";

    static {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        map = new HashMap<String, DeepPrototype>();
        DeepConcretePrototype prototype = new DeepConcretePrototype();
        prototype.setName("deep");
        prototype.setStatus(0);
        prototype.setCreateDate(sdf.format(new Date()));
        prototype.setUpdateDate(sdf.format(new Date()));
        prototype.setId("1");
        prototype.setGroup("group");
        map.put(DEEP, prototype);
    }

    private DeepPrototypeManager() {
    }

    public synchronized static DeepPrototype getPrototype(String name) throws Exception {
        DeepPrototype prototype = map.get(name);
        if (prototype == null) {
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return prototype.clone();
    }
}
