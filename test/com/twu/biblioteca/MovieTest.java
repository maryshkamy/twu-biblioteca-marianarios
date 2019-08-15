package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class MovieTest {
    private Movie movie;

    @Before
    public void setUp() throws Exception {
        this.movie = new Movie("The Lord of the Rings: The Fellowship of the Ring", "2001", "Peter Jackson", 8.8, true);
    }

    @Test
    public void shouldReturnMovieInfo() {
        assertThat(this.movie.getInfo(), is("Title: The Lord of the Rings: The Fellowship of the Ring | Director: J. K. Rowling | Year: 1997 | Rating: 8.8"));
    }
}