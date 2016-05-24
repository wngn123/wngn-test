package com.zzia.wngn.design.vistor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wanggang
 * @title
 * @date 2016年5月20日 上午9:05:40
 * @email wanggang@vfou.com
 * @descripe 对象结构角色: 这是使用访问者模式必备的角色. 它要具备以下特征: 能枚举它的元素; 可以提供一个高层的接口以允许该访问者访问它的元素; 可以是一个复合(组合模式)或是一个集合, 如一个列表或一个无序集合.
 */
public class Structure {

    private final List<Merchandise> elements = new ArrayList<Merchandise>();

    public void addElement(final Merchandise element) {
        elements.add(element);
    }

    public void removeElement(final Merchandise element) {
        elements.remove(element);
    }

    public void accept(final Visitor visitor) {
        for (final Merchandise element : elements) {
            element.accept(visitor);
        }
    }
}
