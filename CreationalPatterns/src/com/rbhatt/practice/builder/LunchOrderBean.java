package com.rbhatt.practice.builder;

/**
 * LunchOrder bean with no arg constructor with setters for all fields.
 * Problem with this approach is that you can create a LunchOrder without bread
 * or you can change the order after it is created and all fields are set once.
 * Also you cannot enforce a contract like order should have at least bread and meat.
 * */

public class LunchOrderBean {

    private String bread;
    private String greens;
    private String dressing;
    private String meat;

    public LunchOrderBean() {

    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getGreens() {
        return greens;
    }

    public void setGreens(String greens) {
        this.greens = greens;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}
