package com.builder;

/**
 * @description: Builder的子类，使用纯文本编辑文档
 * @author: An Qi
 * @date: 2019/4/16 8:08
 */
public class TextBuilder extends Builder {

    /**
     * 储存文档内容
     */
    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("====================\n");
        buffer.append("【" + title + "】\n");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("@" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++) {
            buffer.append("  ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("====================\n");
    }

    /**
     * 将StringBuffer转为String
     * @return
     */
    public String getResult() {
        return buffer.toString();
    }
}
