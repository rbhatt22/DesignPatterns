package com.rbhatt.practice.factory.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbhatt22 on 2/15/21.
 */
public class CandyFactory {

    private static Candy getCandy(String type) {
        switch (type) {
            case "chocolate":
                return new Chocolate();
            case "hard candy":
                return new HardCandy();
            default:
                return null;
        }
    }

    public static List<Candy> getCandyPackage(int quantity, String type) {
        Candy candy = getCandy(type);
        List<Candy> candyPackage = candy.makeCandyPackage(quantity);
        return candyPackage;
    }

}
