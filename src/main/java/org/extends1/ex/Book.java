package org.extends1.ex;

public class Book extends Item {

    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        System.out.println("- 저자:" + author + ", isbn:" + isbn);
    }

}

