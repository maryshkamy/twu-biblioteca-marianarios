package com.twu.biblioteca;

public class BibliotecaApp {
    public static void main(String[] args) {
        System.out.println(welcomeMessage());

        Menu menu = new Menu();
        menu.startMenu();
    }

    private static String welcomeMessage() {
        return "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
    }
}
