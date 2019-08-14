package com.twu.biblioteca;

import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.*;

public class BibliotecaAppTest {
    private BibliotecaApp bibliotecaApp;

    @Before
    public void setUp() throws Exception {
        this.bibliotecaApp = new BibliotecaApp();
    }

    @Test
    public void shouldReturnWelcomeMessage() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = this.bibliotecaApp.getClass().getDeclaredMethod("welcomeMessage");
        method.setAccessible(true);
        assertThat(method.invoke(this.bibliotecaApp), CoreMatchers.<Object>is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!"));
    }
}