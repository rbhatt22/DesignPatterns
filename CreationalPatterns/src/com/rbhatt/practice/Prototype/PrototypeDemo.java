package com.rbhatt.practice.Prototype;

/**
 * PrototypeDemo class with main methdd
 */
public class PrototypeDemo {

    public static void main(String[] args) {

        Registry registry = new Registry();

        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("The Matrix");
        movie.setGenre("Action");

        System.out.println("Movie");
        System.out.println(movie.getTitle());
        System.out.println(movie.getPrice());
        System.out.println(movie.getGenre());
        System.out.println(movie.getRunTime());

        Book book = (Book) registry.createItem("Book");
        book.setTitle("Sapiens");
        book.setAuthor("Yuval Noah Harari");
        book.setNumberOfPage(443);

        System.out.println();
        System.out.println("Book");
        System.out.println(book.getTitle());
        System.out.println(book.getPrice());
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPage());
    }

}
