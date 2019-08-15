package com.twu.biblioteca;

class Borrow {
    private Book[] books;
    private Movie[] movies;

    Borrow() {
        this.books = new Book[] {
                new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997", false),
                new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "1998", true),
                new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "1999", false),
                new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", "2000", false),
                new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling", "2003", true),
                new Book("Harry Potter and the Half Blood Prince", "J. K. Rowling", "2005", false),
                new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling", "2007", true)
        };

        this.movies = new Movie[] {
                new Movie("The Lord of the Rings: The Fellowship of the Ring", "2001", "Peter Jackson", 8.8, false),
                new Movie("The Lord of the Rings: The Two Towers", "2002", "Peter Jackson", 8.7, true),
                new Movie("The Lord of the Rings: The Return of the King", "2003", "Peter Jackson", 8.9, false),
                new Movie("The Hobbit: An Unexpected Journey", "2012", "Peter Jackson", 7.8, false),
                new Movie("The Hobbit: The Desolation of Smaug", "2013", "Peter Jackson", 7.8, true),
                new Movie("The Hobbit: The Battle of The Five Armies", "2014", "Peter Jackson", 7.4, false)
        };
    }

    void getAllBooks() {
        System.out.println("List of Books:");

        for (int i = 0; i < books.length; i++) {
            System.out.println(i + " - " + books[i].getInfo());
        }
    }

    void getAllMovies() {
        System.out.println("List of Movies:");

        for (int i = 0; i < movies.length; i++) {
            System.out.println(i + " - " + movies[i].getInfo());
        }
    }

    void getAvailableBooks() {
        System.out.println("\nList of Books Available:");

        for (int i = 0; i < books.length; i++) {
            if (!books[i].getIsBorrowed()) {
                System.out.println(i + " - " + books[i].getInfo());
            }
        }
    }

    void getAvailableMovies() {
        System.out.println("\nList of Movies Available:");

        for (int i = 0; i < movies.length; i++) {
            if (!movies[i].getIsBorrowed()) {
                System.out.println(i + " - " + movies[i].getInfo());
            }
        }
    }

    void getUnavailableBooks() {
        System.out.println("\nList of Books To Return:");

        for (int i = 0; i < books.length; i++) {
            if (books[i].getIsBorrowed()) {
                System.out.println(i + " - " + books[i].getInfo());
            }
        }
    }

    void getUnavailableMovies() {
        System.out.println("\nList of Movies To Return:");

        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getIsBorrowed()) {
                System.out.println(i + " - " + movies[i].getInfo());
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

    Boolean checkoutAMovie(int id) {
        if (!movies[id].getIsBorrowed()) {
            movies[id].setIsBorrowed(true);
            System.out.println("Thank you! Enjoy the movie!");

            return true;
        }

        System.out.println("Sorry, that movie is not available.");

        return false;
    }

    Boolean returnAMovie(int id) {
        if (movies[id].getIsBorrowed()) {
            movies[id].setIsBorrowed(false);
            System.out.println("Thank you for returning the movie!");

            return true;
        }

        System.out.println("That is not a valid movie to return.");

        return false;
    }
}
