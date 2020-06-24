package com.rbhatt.practice.Prototype;

/**
 * A class Book.
 * Book is an Item.
 */
public class Book extends Item {

    private String author;
    private int numberOfPage;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }
}
