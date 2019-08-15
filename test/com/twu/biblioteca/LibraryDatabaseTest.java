package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LibraryDatabaseTest {
    LibraryDatabase libraryDatabase;

    @Before
    public void setUp() throws Exception {
        this.libraryDatabase = new LibraryDatabase();
    }

    @Test
    public void shouldReturnListOfBooks() {
        assertThat(libraryDatabase.getListOfBooks(), is(libraryDatabase.getListOfBooks()));
    }
}