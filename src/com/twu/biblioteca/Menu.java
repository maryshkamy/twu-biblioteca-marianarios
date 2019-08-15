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
        return "\nSelect one options:\n0 - Quit\n1 - List of Books\n3 - Return a Book";
    }

    void startMenu() {
        int input;
        int id;

        while (true) {
            System.out.println(this);
            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 0:
                    System.exit(0);
                case 1:
                    do {
                        borrow.getAvailableBooks();
                        System.out.println("\nWhich book do you want to borrow?");
                        id = Integer.parseInt(scanner.nextLine());

                    } while (!borrow.checkout(id));

                    break;
                case 3:
                    do {
                        borrow.getUnavailableBooks();
                        System.out.println("\nWhich book do you want to return?");
                        id = Integer.parseInt(scanner.nextLine());
                    } while (!borrow.returnABook(id));

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
}
