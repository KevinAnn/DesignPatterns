package com.adapter.inheritance;

/**
 * @description: 横幅打印类（适配器），继承Banner，实现Print，重写Print的打印方法，在方法中调用父类Banner的打印方法
 * @author: 安琪
 * @create: 2018-11-04 10:49
 */
public class PrintBanner extends Banner implements Print{


    /**
     * 含参构造方法，接收string
     * @param string
     */
    public PrintBanner(String string) {
        super(string);
    }

    /**
     * 重写Print接口方法，调用父类打印括号方法
     */
    @Override
    public void printWeak() {
        showWithParen();
    }

    /**
     * 重写Print接口方法，调用父类打印星号方法
     */
    @Override
    public void printStrong() {
        showWithAster();
    }
}
