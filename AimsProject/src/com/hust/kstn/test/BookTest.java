package com.hust.kstn.test;

import com.hust.kstn.models.Book;
import com.hust.kstn.models.BookAuthor;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("J.K. Rowling", 1965, "British author");
        BookAuthor author2 = new BookAuthor("Stephen King", 1947, "American author");

        Book book = new Book("Harry Potter", "Fantasy", 19.99f, 500);

        book.addAuthor(author1);
        book.addAuthor(author2);

        System.out.println(book.toString());
    }
}