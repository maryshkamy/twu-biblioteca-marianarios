package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Book[] books;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.books = new Book[]{
                new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997"),
                new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "1998"),
                new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "1999"),
                new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", "2000"),
                new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling", "2003"),
                new Book("Harry Potter and the Half Blood Prince", "J. K. Rowling", "2005"),
                new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling", "2007")};
    }

    public void startMenu() {
        System.out.println("\nSelect one options:\n1 - List of Books");
    }

    public void readAnswer() {
        int input;

        while (true) {
            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 1:
                    listOfBooks();
                    break;
                default:
                    System.out.println(invalidOption());
                    break;
            }
        }
    }

    private String invalidOption() {
        return "Please select a valid option!";
    }

    private void listOfBooks() {
        System.out.println("\nList of Books:");

        for (int i = 0; i < books.length - 1; i++) {
            System.out.println(books[i].getTitle() + ", " + books[i].getAuthor() + ", " + books[i].getYearPublished());
        }
    }
}
