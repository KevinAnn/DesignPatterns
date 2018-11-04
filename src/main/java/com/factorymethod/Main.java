package com.factorymethod;

import com.factorymethod.framework.Factory;
import com.factorymethod.framework.Product;

/**
 * @description: FactoryMethod模式执行类
 * @author: 安琪
 * @create: 2018-11-04 19:14
 */
public class Main {

    public static void main(String[] args) {

        Factory factory = new IDCardFactory();

        Product card1 = factory.creat("kevin");

        card1.use();

    }
}
