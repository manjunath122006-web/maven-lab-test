
package com.example;

import java.util.HashMap;
import java.util.Map;

public class Library {

    private Map<Integer, Book> books = new HashMap<>();

    // Add a new book
    public void addBook(Book book) {

        if (books.containsKey(book.getBookId())) {
            throw new IllegalArgumentException("Duplicate Book ID");
        }

        books.put(book.getBookId(), book);
    }

    // Search book using ID
    public Book searchBook(int bookId) {

        if (!books.containsKey(bookId)) {
            throw new IllegalArgumentException("Book not found");
        }

        return books.get(bookId);
    }

    // Issue an available book
    public void issueBook(int bookId) {

        Book book = searchBook(bookId);

        if (book.isIssued()) {
            throw new IllegalStateException("Book already issued");
        }

        book.setIssued(true);
    }

    // Return an issued book
    public void returnBook(int bookId) {

        Book book = searchBook(bookId);

        if (!book.isIssued()) {
            throw new IllegalStateException("Book is not issued");
        }

        book.setIssued(false);
    }
}
