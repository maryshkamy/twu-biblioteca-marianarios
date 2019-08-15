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
        assertThat(this.movie.getInfo(), is("Title: The Lord of the Rings: The Fellowship of the Ring | Director: 2001 | Year: Peter Jackson | Rating: 8.8"));
    }

    @Test
    public void shouldReturnIsBorrowed() {
        assertThat(this.movie.getIsBorrowed(), is(true));
    }

    @Test
    public void shouldSetIsBorrowed() {
        boolean before = this.movie.getIsBorrowed();
        this.movie.setIsBorrowed(false);

        assertNotEquals(this.movie.getIsBorrowed(), before);
    }
}