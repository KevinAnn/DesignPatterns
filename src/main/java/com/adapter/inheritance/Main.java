package com.adapter.inheritance;

/**
 * @description: 使用继承的适配器模式执行类
 * Adapter模式的使用场景：用于将已有的类去适配新的接口。
 * Adapter模式可以在不改变现有类的基础上通过Adapter类来适配新的接口。
 * 当已有的类已经通过测试，Bug较少的时候，我们更希望将这些类作为组件复用，当通过Adpater类将Adaptee类进行复用，如果出现问题，则可以明确
 * 地知道问题不在Adaptee类中，只用调查Adapter类即可。
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
