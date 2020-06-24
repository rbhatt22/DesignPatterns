package com.rbhatt.practice.builder;

/**
 * LuchOrder with Telescoping constructors
 * With telescoping constructor this class is immutable but it is not possible
 * to create an order without bread. Or an order without dressing.
 */
public class LunchOrderTele {

    private String bread;
    private String greens;
    private String dressing;
    private String meat;

    public LunchOrderTele(String bread) {
        this.bread = bread;
    }

    public LunchOrderTele(String bread, String greens) {
        this(bread);
        this.greens = greens;
    }

    public LunchOrderTele(String bread, String greens, String dressing) {
        this(bread, greens);
        this.dressing = dressing;
    }

    public LunchOrderTele(String bread, String greens, String dressing, String meat) {
        this(bread, greens, dressing);
        this.meat = meat;
    }

    /**
     * below is not possible it will give compilation error
     * This is the exact issue with telescoping constructors.
    */
    //public LunchOrderTele(String bread, String greens, String meat);


    public String getBread() {
        return bread;
    }

    public String getGreens() {
        return greens;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
