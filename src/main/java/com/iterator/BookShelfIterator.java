package com.iterator;

/**
 * @description: 书架迭代器类
 * @author: 安琪
 * @create: 2018-11-01 22:31
 */
public class BookShelfIterator implements Iterator{

    /**
     * 书架
     */
    private BookShelf bookShelf;

    /**
     * 书名索引号
     */
    private int index;

    /**
     * 构造方法，获取书架对象
     * @param bookShelf
     */
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    /**
     * 根据index和书架容量判断是否还有下一个元素
     * @return
     */
    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength() ? true : false;
    }

    /**
     * 获取当前元素，增加index指向下一个元素
     * @return
     */
    @Override
    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index ++;
        return book;
    }
}
