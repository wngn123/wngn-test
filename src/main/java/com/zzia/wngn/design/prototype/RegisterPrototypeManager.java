package com.zzia.wngn.design.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wanggang
 * @title
 * @date 2016/6/2 9:18
 * @email wanggang@vfou.com
 * @descripe
 */
public class RegisterPrototypeManager {
    /**
     * 用来记录原型的编号和原型实例的对应关系
     */
    private static Map<String, RegisterPrototype> map = new HashMap<String, RegisterPrototype>();

    /**
     * 私有化构造方法，避免外部创建实例
     */
    private RegisterPrototypeManager() {
    }

    /**
     * 向原型管理器里面添加或是修改某个原型注册
     *
     * @param prototypeId 原型编号
     * @param prototype   原型实例
     */
    public synchronized static void setPrototype(String prototypeId, RegisterPrototype prototype) {
        map.put(prototypeId, prototype);
    }

    /**
     * 从原型管理器里面删除某个原型注册
     *
     * @param prototypeId 原型编号
     */
    public synchronized static void removePrototype(String prototypeId) {
        map.remove(prototypeId);
    }

    /**
     * 获取某个原型编号对应的原型实例
     *
     * @param prototypeId 原型编号
     * @return 原型编号对应的原型实例
     * @throws Exception 如果原型编号对应的实例不存在，则抛出异常
     */
    public synchronized static RegisterPrototype getPrototype(String prototypeId) throws Exception {
        RegisterPrototype prototype = map.get(prototypeId);
        if (prototype == null) {
            throw new Exception("您希望获取的原型还没有注册或已被销毁");
        }
        return prototype;
    }
}
