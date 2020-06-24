package com.rbhatt.practice.Prototype;

/**
 * A class Movie
 * Movie is an Item.
 */
public class Movie extends Item {

    private String genre;
    private String runTime;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRunTime() {
        return runTime;
    }

    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }
}
