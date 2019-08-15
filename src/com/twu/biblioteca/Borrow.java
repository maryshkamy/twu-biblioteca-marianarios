package com.twu.biblioteca;

class Borrow {
    private LibraryDatabase libraryDatabase;

    Borrow() {
        this.libraryDatabase = new LibraryDatabase();
    }

    void getAllBooks() {
        System.out.println("List of Books:");

        for (int i = 0; i < libraryDatabase.getListOfBooks().length - 1; i++) {
            System.out.println(i + " - " + libraryDatabase.getListOfBooks()[i].getInfo());
        }
    }

    void getAvailableBooks() {
        System.out.println("\nList of Books Available:");

        for (int i = 0; i < libraryDatabase.getListOfBooks().length - 1; i++) {
            if (!libraryDatabase.getListOfBooks()[i].getIsBorrowed()) {
                System.out.println(i + " - " + libraryDatabase.getListOfBooks()[i].getInfo());
            }
        }
    }

    void getUnavailableBooks() {
        System.out.println("\nList of Books To Return:");

        for (int i = 0; i < libraryDatabase.getListOfBooks().length - 1; i++) {
            if (libraryDatabase.getListOfBooks()[i].getIsBorrowed()) {
                System.out.println(i + " - " + libraryDatabase.getListOfBooks()[i].getInfo());
            }
        }
    }

    Boolean checkoutABook(int id) {
        if (!libraryDatabase.getListOfBooks()[id].getIsBorrowed()) {
            libraryDatabase.getListOfBooks()[id].setIsBorrowed(true);
            System.out.println("Thank you! Enjoy the book!");

            return true;
        }

        System.out.println("Sorry, that book is not available.");

        return false;
    }

    Boolean returnABook(int id) {
        if (libraryDatabase.getListOfBooks()[id].getIsBorrowed()) {
            libraryDatabase.getListOfBooks()[id].setIsBorrowed(false);
            System.out.println("Thank you for returning the book!");

            return true;
        }

        System.out.println("That is not a valid book to return.");

        return false;
    }
}
