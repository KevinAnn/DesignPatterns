package com.iterator;

/**
* @Description: 集合接口
* @Author: 安琪
* @Date: 2018/11/1 22:32
*/
public interface Aggregate {

    /**
     * @description: 创建一个可以按顺序访问本类内部元素的迭代器
     * @params: []
     * @return: com.iterator.Iterator
     * @date: 2018/11/1 22:54
     */
    Iterator iterator();

}
