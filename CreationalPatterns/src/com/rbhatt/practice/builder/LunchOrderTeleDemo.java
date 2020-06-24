package com.rbhatt.practice.builder;

/**
 * Demo for LunchOrderTele
 */
public class LunchOrderTeleDemo {

    public static void main(String[] args) {

        LunchOrderTele lunchOrderTele = new LunchOrderTele("wheat", "lettuce", "ranch", "chicken");

        System.out.println(lunchOrderTele.getBread());
        System.out.println(lunchOrderTele.getGreens());
        System.out.println(lunchOrderTele.getDressing());
        System.out.println(lunchOrderTele.getMeat());

    }

}
