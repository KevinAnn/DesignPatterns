package com.builder;


/**
* @description: 使用Builder中声明的方法来编写文档
* @author: An Qi
* @date: 2019/4/16 8:01
*/
public class Director {

    private Builder builder;

    /**
     * 构造方法：给保存的builder对象赋值
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 构造文档内容
     */
    public void construct() {
        builder.makeTitle("Greeting");
        builder.makeString("从早上至下午");
        builder.makeItems(new String[]{
                "早上好。","下午好。"
        });
        builder.makeString("晚上");
        builder.makeItems(new String[]{
                "晚上好。","晚安。","再见。"
        });
        builder.close();
    }

}
