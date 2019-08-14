package com.twu.biblioteca;

public class LibraryDatabase {
    private Book[] books;

    public LibraryDatabase() {
        this.books = new Book[]{
                new Book("Harry Potter and the Sorcerer's Stone", "J. K. Rowling", "1997", false),
                new Book("Harry Potter and the Chamber of Secrets", "J. K. Rowling", "1998", true),
                new Book("Harry Potter and the Prisoner of Azkaban", "J. K. Rowling", "1999", false),
                new Book("Harry Potter and the Goblet of Fire", "J. K. Rowling", "2000", false),
                new Book("Harry Potter and the Order of the Phoenix", "J. K. Rowling", "2003", true),
                new Book("Harry Potter and the Half Blood Prince", "J. K. Rowling", "2005", false),
                new Book("Harry Potter and the Deathly Hallows", "J. K. Rowling", "2007", true)};
    }

    public Book[] getListOfBooks() {
        return  this.books;
    }
}
