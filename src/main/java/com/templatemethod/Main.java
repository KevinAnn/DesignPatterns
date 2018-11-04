package com.templatemethod;

/**
 * @description: 模板方法模式执行类
 * Template Method模式
 * 在父类中定义处理流程的框架，在子类中实现具体处理
 * @author: 安琪
 * @create: 2018-11-04 13:30
 */
public class Main {

    public static void main(String[] args) {

        AbstractDisplay charDisplay = new CharDisplay('a');

        AbstractDisplay stringDisplay = new StringDisplay("你好，世界！");

        AbstractDisplay stringDisplay2 = new StringDisplay("Hello,World!");

        charDisplay.display();

        stringDisplay.display();

        stringDisplay2.display();

    }

}
