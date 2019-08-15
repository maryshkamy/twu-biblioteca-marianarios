package com.twu.biblioteca;

class Movie {
    private String title;
    private String author;
    private String year;
    private Double rating;
    private Boolean isBorrowed;

    Movie(String title, String author, String year, Double rating, Boolean isBorrowed) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.rating = rating;
        this.isBorrowed = isBorrowed;
    }

    String getInfo() {
        return "Title: " + title + " | Director: " + author + " | Year: " + year + " | Rating: " + rating;
    }

    Boolean getIsBorrowed() {
        return isBorrowed;
    }

    void setIsBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
}
