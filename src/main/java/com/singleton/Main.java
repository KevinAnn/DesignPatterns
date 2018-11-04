package com.singleton;

/**
 * @description: Singleton模式执行类
 * 单例模式确保该类只生成一个实例对象
 * @author: 安琪
 * @create: 2018-11-04 19:41
 */
public class Main {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        if (singleton1 == singleton2) {
            System.out.println("生成了相同的实例");
        } else {
            System.out.println("生成了不同的实例");
        }

    }
}
