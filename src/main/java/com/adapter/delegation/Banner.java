package com.adapter.delegation;

/**
 * @description: 广告横幅类（实际情况）
 * @author: 安琪
 * @create: 2018-11-04 11:25
 */
public class Banner {

    private String string;

    /**
     * 含参构造器，接收内容string
     * @param string
     */
    public Banner(String string) {
        this.string = string;
    }

    /**
     * 打印带括号的内容string
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     * 打印带星号的内容string
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
