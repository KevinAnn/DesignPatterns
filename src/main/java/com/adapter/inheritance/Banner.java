package com.adapter.inheritance;

/**
 * @description: 广告横幅类（实际情况）
 * @author: 安琪
 * @create: 2018-11-04 10:46
 */
public class Banner {

    /**
     * 横幅内容
     */
    private String string;

    /**
     * 含参构造方法，接收string
     * @param string
     */
    public Banner(String string) {
        this.string = string;
    }

    /**ut
     * 打印带括号的string内容
     */
    public void showWithParen() {
        System.out.println("(" + string + ")");
    }

    /**
     * 打印带星号的string内容
     */
    public void showWithAster() {
        System.out.println("*" + string + "*");
    }

}
