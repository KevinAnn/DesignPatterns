package com.builder;

/**
* @description:
* @author: An Qi
* @date: 2019/4/15 8:08
*/
public abstract class Builder {

    /**
     * 生成标题
     * @param title
     */
    public abstract void makeTitle(String title);

    /**
     * 生成内容
     * @param str
     */
    public abstract void makeString(String str);

    /**
     * 生成目录
     * @param items
     */
    public abstract void makeItems(String[] items);

    /**
     * 关闭
     */
    public abstract void close();


}
