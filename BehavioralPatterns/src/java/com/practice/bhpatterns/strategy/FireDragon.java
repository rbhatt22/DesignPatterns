package com.practice.bhpatterns.strategy;

/**
 * Created by rbhatt22 on 11/21/19.
 * strategy implementation 1
 */
public class FireDragon extends Dragon implements Attack {

    FireDragon() {
        setName("Fire Dragon");
        setLevel(1);
        setHealth(950);
    }

    @Override
    public String attack() {
        return "Fire Ball";
    }
}
