package com.twu.biblioteca;

class Borrow {
    private Book[] books;

    Borrow() {
        this.books = new Book[]{
                new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997", false),
                new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "1998", true),
                new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "1999", false),
                new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", "2000", false),
                new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling", "2003", true),
                new Book("Harry Potter and the Half Blood Prince", "J. K. Rowling", "2005", false),
                new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling", "2007", true)};
    }

    void getAllBooks() {
        System.out.println("List of Books:");

        for (int i = 0; i < books.length - 1; i++) {
            System.out.println(i + " - " + books[i].getInfo());
        }
    }

    void getAvailableBooks() {
        System.out.println("\nList of Books Available:");

        for (int i = 0; i < books.length - 1; i++) {
            if (!books[i].getIsBorrowed()) {
                System.out.println(i + " - " + books[i].getInfo());
            }
        }
    }

    void getUnavailableBooks() {
        System.out.println("\nList of Books To Return:");

        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getIsBorrowed()) {
                System.out.println(i + " - " + books[i].getInfo());
            }
        }
    }

    Boolean checkoutABook(int id) {
        if (!books[id].getIsBorrowed()) {
            books[id].setIsBorrowed(true);
            System.out.println("Thank you! Enjoy the book!");

            return true;
        }

        System.out.println("Sorry, that book is not available.");

        return false;
    }

    Boolean returnABook(int id) {
        if (books[id].getIsBorrowed()) {
            books[id].setIsBorrowed(false);
            System.out.println("Thank you for returning the book!");

            return true;
        }

        System.out.println("That is not a valid book to return.");

        return false;
    }
}
