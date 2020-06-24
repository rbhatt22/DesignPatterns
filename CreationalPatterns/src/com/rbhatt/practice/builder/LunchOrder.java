package com.rbhatt.practice.builder;

/**
 * LunchOrder with builder patter
 * with contract that you cannot have order without bread and meat.
 */
public class LunchOrder {

    public static class Builder {

        private String bread;
        private String greens;
        private String dressing;
        private String meat;

        //constructor that enforces a contract of having bread and meat for order
        public Builder(String bread, String meat) {
            this.bread = bread;
            this.meat = meat;
        }

        //Build method returns LunchOrder instance
        public LunchOrder build() {
            return new LunchOrder(this);
        }

        //method that adds green to the order
        public Builder greens(String greens) {
            this.greens = greens;
            return this;
        }

        //methid that adds dressing to the order
        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

    }

    private String bread;
    private String greens;
    private String dressing;
    private String meat;

    private LunchOrder(Builder builder) {
        this.bread = builder.bread;
        this.greens = builder.greens;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    //only getters. No setters
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
