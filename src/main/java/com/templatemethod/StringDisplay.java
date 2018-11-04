package com.templatemethod;

/**
 * @description: 字符串显示类
 * @author: 安琪
 * @create: 2018-11-04 14:00
 */
public class StringDisplay extends AbstractDisplay{

    /**
     * 用于打印的字符串
     */
    private String string;

    /**
     * 打印文本框的宽度
     */
    private int width;

    /**
     * 含参构造器，接收用于打印的字符串
     */
    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    /**
     * 打印文本上边框
     */
    @Override
    public void open() {
        printLine();
    }

    /**
     * 打印字符串内容
     */
    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    /**
     * 打印文本下边框
     */
    @Override
    public void close() {
        printLine();
    }

    /**
     * 打印文本边框
     */
    private void printLine() {

        System.out.print("+");
        for (int i = 0; i < width; i ++) {
            System.out.print("-");
        }
        System.out.println("+");

    }



}
