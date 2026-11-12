
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    // Test 1: Adding and searching a book
    @Test
    public void testAddAndSearchBook() {

        Library library = new Library();

        Book book = new Book(101, "Java Programming");

        library.addBook(book);

        Book result = library.searchBook(101);

        assertEquals("Java Programming", result.getTitle());
    }

    // Test 2: Handling duplicate book IDs
    @Test
    public void testDuplicateBook() {

        Library library = new Library();

        library.addBook(new Book(101, "Java"));

        assertThrows(IllegalArgumentException.class, () -> {
            library.addBook(new Book(101, "Python"));
        });
    }

    // Test 3: Issuing an available book
    @Test
    public void testIssueBook() {

        Library library = new Library();

        library.addBook(new Book(102, "C Programming"));

        library.issueBook(102);

        assertTrue(library.searchBook(102).isIssued());
    }

    // Test 4: Issuing an already-issued book
    @Test
    public void testIssueAlreadyIssuedBook() {

        Library library = new Library();

        library.addBook(new Book(103, "DBMS"));

        library.issueBook(103);

        assertThrows(IllegalStateException.class, () -> {
            library.issueBook(103);
        });
    }

    // Test 5: Returning an issued book
    @Test
    public void testReturnBook() {

        Library library = new Library();

        library.addBook(new Book(104, "Operating Systems"));

        library.issueBook(104);

        library.returnBook(104);

        assertFalse(library.searchBook(104).isIssued());
    }

    // Test 6: Returning a book that is not issued
    @Test
    public void testReturnAvailableBook() {

        Library library = new Library();

        library.addBook(new Book(105, "Computer Networks"));

        assertThrows(IllegalStateException.class, () -> {
            library.returnBook(105);
        });
    }
}
