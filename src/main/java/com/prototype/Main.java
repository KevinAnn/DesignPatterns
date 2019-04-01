package com.prototype;

/**
 * @description: prototype的执行类
 * @author: 安琪
 * @create: 2019-04-01 07:59
 */
public class Main {

    public static void main(String[] args) {
        // 准备
        Manager manager = new Manager();
        UnderlinePen underlinePen = new UnderlinePen('~');
        MessageBox mBox = new MessageBox('*');
        MessageBox sBox = new MessageBox('/');
        manager.register("strong message", underlinePen);
        manager.register("warning box", mBox);
        manager.register("slash box", sBox);

        // 生成
        Product p1 = manager.create("strong message");
        p1.use("Hello,world.");
        Product p2 = manager.create("warning box");
        p2.use("Hello,world.");
        Product p3 = manager.create("slash box");
        p3.use("Hello,world.");
    }

}
