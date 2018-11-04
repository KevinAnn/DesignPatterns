package com.iterator;

/**
 * @description: Book类
 * @author: 安琪
 * @create: 2018-11-01 22:21
 */
public class Book {

    /**
     * 书名
     */
    private String name;

    /**
     * @description: 构造方法，初始化时存入书名
     * @params: [name]
     * @return:
     * @date: 2018/11/1 22:58
     */
    public Book(String name) {
        this.name = name;
    }

    /**
     * @description: 获取书名
     * @params: []
     * @return: java.lang.String
     * @date: 2018/11/1 22:58
     */
    public String getName() {
        return name;
    }

}
