package com.adapter.delegation;

/**
 * @description: 打印横幅内容类（适配器），继承Print类，在类中存放Banner类的对象，通过构造方法实例化Banner类对象，再在重写的print
 * 类的方法中通过Banner类对象调用Banner类中的打印方法。
 * @author: 安琪
 * @create: 2018-11-04 11:31
 */
public class PrintBanner extends Print{

    /**
     * Banner类对象
     */
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    /**
     * 重写Print抽象类方法，打印弱化显示的内容（带括号）
     */
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    /**
     * 重写Print抽象类方法，打印突出显示的内容（带星号）
     */
    @Override
    public void printStrong() {
        banner.showWithAster();
    }

}
