package com.rbhatt.practice.builder;

/**
 * Lunch order demo
 */
public class LunchOrderDemo {

    public static void main(String[] args) {

        //Lunchorder must have bread and meat
        LunchOrder.Builder builder = new LunchOrder.Builder("Wheat", "chicken");

        //greens and dressing are optional
        builder.greens("spinach").dressing("ranch");

        LunchOrder lunchOrder = builder.build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getMeat());
        System.out.println(lunchOrder.getGreens());
        System.out.println(lunchOrder.getDressing());

        System.out.println("Lunch Order 2:");
        LunchOrder.Builder builder_1 = new LunchOrder.Builder("Wheat", "chicken");

        LunchOrder lunchOrder_1 = builder_1.build();

        System.out.println(lunchOrder_1.getBread());
        System.out.println(lunchOrder_1.getMeat());
        System.out.println(lunchOrder_1.getGreens());
        System.out.println(lunchOrder_1.getDressing());

    }

}
