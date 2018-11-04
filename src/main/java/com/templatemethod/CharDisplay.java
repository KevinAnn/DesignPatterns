package com.templatemethod;

/**
 * @description: 字符显示类
 * @author: 安琪
 * @create: 2018-11-04 13:55
 */
public class CharDisplay extends AbstractDisplay {

    /**
     * 用来打印的字符
     */
    private char ch;

    /**
     * 含参构造方法，接收用来打印的字符
     * @param ch
     */
    public CharDisplay(char ch) {
        this.ch = ch;
    }

    /**
     * 重写AbstractDisplay抽象类的open方法，打印“<<”
     */
    @Override
    public void open() {
        System.out.print("<<");
    }

    /**
     * 重写AbstractDisplay抽象类的print方法，打印字符
     */
    @Override
    public void print() {
        System.out.print(ch);
    }

    /**
     * 重写AbstractDisplay抽象类的close方法，打印“>>”
     */
    @Override
    public void close() {
        System.out.println(">>");
    }

}
