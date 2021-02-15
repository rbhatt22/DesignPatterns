package com.rbhatt.practice.factory.v2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rbhatt22 on 2/15/21.
 */
public class HardCandy extends Candy {
    @Override
    List<Candy> makeCandyPackage(int quantity) {
        List<Candy> hardCandyPackage = new ArrayList<>();

        for (int i = 1; i <= quantity; i++) {
            HardCandy hardCandy = new HardCandy();
            hardCandyPackage.add(hardCandy);
        }

        System.out.println("One package of " + quantity + " hard candies has been made!");
        return hardCandyPackage;
    }
}
