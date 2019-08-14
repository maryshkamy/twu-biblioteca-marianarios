package com.twu.biblioteca;

import java.util.Scanner;

public class Borrow {
    private LibraryDatabase libraryDatabase;

    public Borrow() {
        this.libraryDatabase = new LibraryDatabase();
    }

    public void getAvailable() {
        System.out.println("\nList of Books:");

        for (int i = 0; i < libraryDatabase.getListOfBooks().length - 1; i++) {
            if (!libraryDatabase.getListOfBooks()[i].getIsBorrowed()) {
                System.out.println(i + " - " + libraryDatabase.getListOfBooks()[i].getInfo());
            }
        }
    }

    public void checkout(int id) {
        libraryDatabase.getListOfBooks()[id].setBorrowed(true);
    }
}
