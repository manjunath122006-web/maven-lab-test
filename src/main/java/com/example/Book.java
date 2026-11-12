
package com.example;

public class Book {

    private int bookId;
    private String title;
    private boolean issued;

    public Book(int bookId, String title) {
        this.bookId = bookId;
        this.title = title;
        this.issued = false;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isIssued() {
        return issued;
    }

    public void setIssued(boolean issued) {
        this.issued = issued;
    }
}
