package com.prototype;

/**
 * @description: 产品接口，继承了Cloneable接口，提供了复制的功能
 * @author: 安琪
 * @create: 2018-11-04 19:38
 */
public interface Product extends Cloneable{

    /**
     * 将传入的参数展示出来
     * @param s
     */
    void use(String s);

    /**
     * 赋值一个实例
     * @return
     */
    Product createClone();

}
