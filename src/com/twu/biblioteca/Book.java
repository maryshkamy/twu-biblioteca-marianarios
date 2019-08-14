package com.twu.biblioteca;

public class Book {
    private String title;
    private String author;
    private String yearPublished;
    private Boolean isBorrowed;

    public Book(String title, String author, String yearPublished, Boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isBorrowed = isBorrowed;
    }

    public String getInfo() {
        return "Title: " + title + " | Author: " + author + " | Year Published: " + yearPublished;
    }

    public Boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(Boolean borrowed) {
        isBorrowed = borrowed;
    }
}