package com.adapter.inheritance;

/**
 * @description: 执行类
 * @author: 安琪
 * @create: 2018-11-04 10:50
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("这是使用继承方式实现的广告内容");

        // 打印带括号的内容
        print.printWeak();

        // 打印带星号的内容
        print.printStrong();
    }

}
