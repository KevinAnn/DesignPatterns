package com.templatemethod;

/**
 * @description: 显示内容抽象类（模板类）
 * @author: 安琪
 * @create: 2018-11-04 13:49
 */
public abstract class AbstractDisplay {

    /**
     * 抽象方法打开
     */
    public abstract void open();

    /**
     * 抽象方法打印
     */
    public abstract void print();

    /**
     * 抽象方法关闭
     */
    public abstract void close();

    /**
     * 显示内容，将内容打印5次
     * 这个方法用于设置模板类中方法的执行流程
     */
    public final void display() {

        open();
        for (int i = 0; i < 5; i ++) {
            print();
        }
        close();

    }

}
