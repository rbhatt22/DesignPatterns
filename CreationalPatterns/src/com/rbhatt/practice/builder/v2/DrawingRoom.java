package com.rbhatt.practice.builder.v2;

/**
 * Created by rbhatt22 on 2/12/21.
 */
public class DrawingRoom {

    int numberOfWindows;
    int numberOfDoors;
    int length;
    int width;
    int height;
    int numberOfLights;
    String color;
    String flooringType;


    public DrawingRoom(int numberOfWindows, int numberOfDoors, int length, int width, int height, int numberOfLights, String color, String flooringType) {
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.length = length;
        this.width = width;
        this.height = height;
        this.numberOfLights = numberOfLights;
        this.color = color;
        this.flooringType = flooringType;
    }
}
