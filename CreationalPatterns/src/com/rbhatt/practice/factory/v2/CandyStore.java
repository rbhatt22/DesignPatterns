package com.rbhatt.practice.factory.v2;

/**
 * Created by rbhatt22 on 2/15/21.
 */
public class CandyStore {

    private static final CandyFactory factory = new CandyFactory();

    public static void main(String[] args) {

        factory.getCandyPackage(5, "chocolate");
        factory.getCandyPackage(10, "hard candy");

    }
}
