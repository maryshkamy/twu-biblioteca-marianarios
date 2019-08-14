package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        System.out.println("\nBook's list:");
        String[] books = new String[] {
                "Harry Potter and the Sorcerer's Stone",
                "Harry Potter and the Chamber of Secrets",
                "Harry Potter and the Prisoner of Azkaban",
                "Harry Potter and the Goblet of Fire",
                "Harry Potter and the Order of the Phoenix",
                "Harry Potter and the Half Blood Prince",
                "Harry Potter and the Deathly Hallows"};

        for (int i = 0; i < books.length - 1; i++) {
            System.out.println(books[i]);
        }
    }
}
