package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {
    private Book book;

    @Before
    public void setUp() throws Exception {
        this.book = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997", true);
    }

    @Test
    public void shouldReturnBookInfo() {
        assertThat(this.book.getInfo(), is("Title: Harry Potter and the Sorcerer's Stone | Author: J. K. Rowling | Year Published: 1997"));
    }

    @Test
    public void shouldReturnIsBorrowed() {
        assertThat(this.book.getIsBorrowed(), is(true));
    }

    @Test
    public void shouldSetIsBorrowed() {
        boolean before = this.book.getIsBorrowed();
        this.book.setIsBorrowed(false);

        assertNotEquals(this.book.getIsBorrowed(), before);
    }
}