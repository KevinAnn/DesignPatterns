package com.iterator;

/**
 * @description: 执行类
 * @author: 安琪
 * @create: 2018-11-01 22:42
 */
public class Main {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.appendBook(new Book("不疯魔不成活"));
        bookShelf.appendBook(new Book("三体"));
        bookShelf.appendBook(new Book("追风筝的人"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
