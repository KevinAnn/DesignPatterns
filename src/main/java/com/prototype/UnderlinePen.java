package com.prototype;

/**
 * @description: 带有下划线的字符串
 * @author: 安琪
 * @create: 2019-04-01 07:56
 */
public class UnderlinePen implements Product {

    /**
     * 下划线符号
     */
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar = ulChar;
    }

    @Override
    public void use(String s) {
        int length = s.getBytes().length;
        System.out.println("\"" + s + "\"");
        for (int i = 0; i < length; i++) {
            System.out.print(ulChar);
        }
        System.out.println(" ");
    }

    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
