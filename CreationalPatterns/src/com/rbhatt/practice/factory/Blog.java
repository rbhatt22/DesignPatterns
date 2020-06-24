package com.rbhatt.practice.factory;

//Concrete class Blog which implements Factory method
public class Blog extends Website {

    @Override
    public void createWebsite() {
        pages.add(new PostPage());
        pages.add(new AboutPage());
        pages.add(new ContactPage());
    }
}
