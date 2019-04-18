package com.builder;

/**
* @description: Builder模式执行方法
* @author: An Qi
* @date: 2019/4/18 7:47
*/
public class Main {

    public static void main(String[] args) {

        // 纯文本文档
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);

        // HTML文档
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director2 = new Director(htmlBuilder);
        director2.construct();
        String filename = htmlBuilder.getResult();
        System.out.println(filename + "文件编写完成。");

    }

}
