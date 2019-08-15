package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowTest {
    private Borrow borrow;

    @Before
    public void setUp() throws Exception {
        this.borrow = new Borrow();
    }

    @Test
    public void shouldCheckoutABookSuccessful() {
        assertTrue(this.borrow.checkoutABook(0));
    }

    @Test
    public void shouldCheckoutABookUnsuccessful() {
        assertFalse(this.borrow.checkoutABook(1));
    }

    @Test
    public void shouldReturnABookSuccessful() {
        assertTrue(this.borrow.returnABook(1));
    }

    @Test
    public void shouldReturnABookUnsuccesful() {
        assertFalse(this.borrow.returnABook(0));
    }
}