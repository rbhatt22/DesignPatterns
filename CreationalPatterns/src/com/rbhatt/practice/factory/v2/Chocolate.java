package com.rbhatt.practice.factory.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbhatt22 on 2/15/21.
 */
public class Chocolate extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> chocolatePackage = new ArrayList<>();

        for (int i = 1; i <= quantity; i++) {
            Chocolate chocolate = new Chocolate();
            chocolatePackage.add(chocolate);
        }

        System.out.println("One package of " + quantity + " chocolates has been made!");
        return  chocolatePackage;
    }
}
