package org.extends1.ex;

public class Book extends Item {
    private String author;
    private String isbn;

    public Book(String name, int price, String author, String isbn) {
        super(name, price); //부모의 생성자 호출
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn:" + isbn);
    }


}


