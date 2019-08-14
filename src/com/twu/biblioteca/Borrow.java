package com.twu.biblioteca;

import java.util.Scanner;

public class Borrow {
    private LibraryDatabase libraryDatabase;

    public Borrow() {
        this.libraryDatabase = new LibraryDatabase();
    }

    public void getListOfBooks() {
        System.out.println("\nList of Books:");

        for (int i = 0; i < libraryDatabase.getListOfBooks().length - 1; i++) {
            if (!libraryDatabase.getListOfBooks()[i].getIsBorrowed()) {
                System.out.println(i + " - " + libraryDatabase.getListOfBooks()[i].getInfo());
            }
        }
    }

    public Boolean checkout(int id) {
        if (!libraryDatabase.getListOfBooks()[id].getIsBorrowed()) {
            libraryDatabase.getListOfBooks()[id].setBorrowed(true);
            System.out.println("Thank you! Enjoy the book");
            return true;
        }

        System.out.println("Sorry, that book is not available");
        return false;
    }
}
