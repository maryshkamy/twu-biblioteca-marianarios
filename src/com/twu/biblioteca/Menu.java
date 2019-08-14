package com.twu.biblioteca;

import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private Borrow borrow;

    public Menu() {
        this.scanner = new Scanner(System.in);
        this.borrow = new Borrow();
    }

    @Override
    public String toString() {
        return "\nSelect one options:\n0 - Quit\n1 - List of Books";
    }

    public void startMenu() {
        int input;

        while (true) {
            System.out.println(this);
            input = Integer.parseInt(scanner.nextLine());

            switch (input) {
                case 0:
                    System.exit(0);
                case 1:
                    int id;

                    while (true) {
                        borrow.getListOfBooks();
                        System.out.println("\nWhich book do you want to borrow?");
                        id = Integer.parseInt(scanner.nextLine());

                        if (borrow.checkout(id)) {
                            break;
                        }
                    }
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
