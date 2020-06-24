package com.rbhatt.practice.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype Registry
 */
public class Registry {

    Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public Item createItem(String type) {
        Item item = null;
        try {
            item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return item;
    }

    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setGenre("Genre");
        movie.setRunTime("2 hours");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Basoc Book");
        book.setPrice(14.99);
        book.setAuthor("Author");
        book.setNumberOfPage(100);
        items.put("Book", book);

    }
}
