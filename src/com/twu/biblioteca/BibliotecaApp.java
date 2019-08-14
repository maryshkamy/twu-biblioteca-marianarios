package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");

        System.out.println("\nBook's list:");
        Book[] books = new Book[] {
                new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997"),
                new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "1998"),
                new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "1999"),
                new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", "2000"),
                new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling", "2003"),
                new Book("Harry Potter and the Half Blood Prince", "J. K. Rowling", "2005"),
                new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling", "2007")};

        for (int i = 0; i < books.length - 1; i++) {
            System.out.println(books[i].getTitle() + ", " + books[i].getAuthor() + ", " + books[i].getYearPublished());
        }
    }
}
