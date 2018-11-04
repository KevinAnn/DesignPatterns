package com.singleton;

/**
 * @description: 单例类
 * @author: 安琪
 * @create: 2018-11-04 19:38
 */
public class Singleton {

    /**
     * 实例对象
     */
    private static Singleton singleton = new Singleton();

    /**
     * 构造方法，打印内容
     */
    private Singleton() {
        System.out.println("创建了一个实例");
    }

    /**
     * 获取实例方法
     * @return
     */
    public static Singleton getInstance() {
        return singleton;
    }


}
