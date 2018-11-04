package com.iterator;

/**
 * @description: 书架类
 * @author: 安琪
 * @create: 2018-11-01 22:23
 */
public class BookShelf implements Aggregate{

    /**
     * 书名数组
     */
    private Book[] books;

    /**
     * 书架上的最后一本书的索引号，也就是书名数量
     */
    private int last = 0;

    /**
     * 构造方法，设置书名数组的长度
     * @param maxsize
     */
    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    /**
     * 根据放入书名的顺序号获取书名
     * @param index
     * @return
     */
    public Book getBookAt(int index) {
        return books[index];
    }

    /**
     * 添加书名
     * @param book
     */
    public void appendBook(Book book) {
        this.books[last] = book;
        last ++;
    }

    /**
     * 获取书架上书的数量
     * @return
     */
    public int getLength() {
        return last;
    }

    /**
     * 重写iterator方法，返回书架迭代器对象
     * @return
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }


}
