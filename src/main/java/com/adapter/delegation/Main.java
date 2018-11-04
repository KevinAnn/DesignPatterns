package com.adapter.delegation;

/**
 * @description: 执行类
 * @author: 安琪
 * @create: 2018-11-04 11:35
 */
public class Main {

    public static void main(String[] args) {
        Print print = new PrintBanner("这是使用委托方式实现的广告内容");

        // 打印弱化显示的内容（带括号）
        print.printWeak();

        // 打印突出显示的内容（带星号）
        print.printStrong();
    }
}
