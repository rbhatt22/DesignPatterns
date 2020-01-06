package com.practice.bhpatterns.strategy;

/**
 * Created by rbhatt22 on 11/21/19.
 * strategy implementation 2
 */
public class FrostDragon extends Dragon implements Attack {

    FrostDragon() {
        setName("Frost Dragon");
        setLevel(1);
        setHealth(950);
    }


    @Override
    public String attack() {
        return "Ice Storm";
    }
}
