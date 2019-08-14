package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {
    private Book book;

    @Before
    public void setUp() throws Exception {
        this.book = new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997");
    }

    @Test
    public void shouldReturnTitle() {
        assertThat(this.book.getTitle(), is("Harry Potter and the Sorcerer's Stone"));
    }

    @Test
    public void shouldReturnAuthor() {
        assertThat(this.book.getAuthor(), is("J. K. Rowling"));
    }

    @Test
    public void shouldReturnYearPublished() {
        assertThat(this.book.getYearPublished(), is("1997"));
    }
}