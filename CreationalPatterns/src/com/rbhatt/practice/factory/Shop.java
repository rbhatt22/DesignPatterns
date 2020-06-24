package com.rbhatt.practice.factory;

//concrete class Shop which implements factory method
public class Shop extends Website {

    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ContactPage());
    }
}
