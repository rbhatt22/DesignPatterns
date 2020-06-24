package com.rbhatt.practice.factory;

import java.util.ArrayList;
import java.util.List;

//Factory class Website
//This can be interface
public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public List<Page> getPages() {
        return pages;
    }

    public Website() {
        this.createWebsite();
    }

    //FACTORY METHOD
    public abstract void createWebsite();
}
