
package com.example;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        // Add books
        library.addBook(new Book(101, "Java Programming"));
        library.addBook(new Book(102, "Python Programming"));

        System.out.println("LIBRARY BOOK MANAGEMENT SYSTEM");

        // Search book
        Book book = library.searchBook(101);
        System.out.println("Book Found: " + book.getTitle());

        // Issue book
        library.issueBook(101);
        System.out.println("Book Issued: " + book.getTitle());

        // Return book
        library.returnBook(101);
        System.out.println("Book Returned: " + book.getTitle());

        System.out.println("Book Available: "
                + !book.isIssued());

        System.out.println("Application executed successfully!");
    }
}
