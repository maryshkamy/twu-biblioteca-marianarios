package com.twu.biblioteca;

class Book {
    private String title;
    private String author;
    private String yearPublished;
    private Boolean isBorrowed;

    Book(String title, String author, String yearPublished, Boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isBorrowed = isBorrowed;
    }

    String getInfo() {
        return "Title: " + title + " | Author: " + author + " | Year Published: " + yearPublished;
    }

    Boolean getIsBorrowed() {
        return isBorrowed;
    }

    void setIsBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}