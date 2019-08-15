package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Borrow borrow;

    Menu() {
        this.scanner = new Scanner(System.in);
        this.borrow = new Borrow();
    }

    @Override
    public String toString() {
        return "\nSelect one options:\n0 - Quit\n1 - List of Books\n2 - Borrow a Book\n3 - Return a Book\n4 - List of Movies";
    }

    void start() {
        int input;
        int id;

        while (true) {
            System.out.println(this);
            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 0:
                    System.exit(0);
                case 1:
                    borrow.getAllBooks();
                    break;
                case 2:
                    do {
                        borrow.getAvailableBooks();
                        System.out.println("\nWhich book do you want to borrow?");
                        id = Integer.parseInt(scanner.nextLine());

                    } while (!borrow.checkoutABook(id));

                    break;
                case 3:
                    do {
                        borrow.getUnavailableBooks();
                        System.out.println("\nWhich book do you want to return?");
                        id = Integer.parseInt(scanner.nextLine());
                    } while (!borrow.returnABook(id));

                    break;
                case 4:
                    borrow.getAllMovies();
                    break;
                default:
                    System.out.println("Please select a valid option!");
                    break;
            }
        }
    }
}
