package com.adapter.delegation;

/**
 * @description: 打印输出抽象类（需求情况）
 * @author: 安琪
 * @create: 2018-11-04 11:28
 */
public abstract class Print {

    /**
     * 打印弱化显示的内容（带括号）
     */
    public abstract void printWeak();

    /**
     * 打印突出显示的内容（带星号）
     */
    public abstract void printStrong();

}
