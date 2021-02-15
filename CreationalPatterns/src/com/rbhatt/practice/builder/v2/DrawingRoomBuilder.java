package com.rbhatt.practice.builder.v2;

public class DrawingRoomBuilder {
    private int numberOfWindows;
    private int numberOfDoors;
    private int length;
    private int width;
    private int height;
    private int numberOfLights;
    private String color;
    private String flooringType;

    public DrawingRoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public DrawingRoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public DrawingRoomBuilder setLength(int length) {
        this.length = length;
        return this;
    }

    public DrawingRoomBuilder setWidth(int width) {
        this.width = width;
        return this;
    }

    public DrawingRoomBuilder setHeight(int height) {
        this.height = height;
        return this;
    }

    public DrawingRoomBuilder setNumberOfLights(int numberOfLights) {
        this.numberOfLights = numberOfLights;
        return this;
    }

    public DrawingRoomBuilder setColor(String color) {
        this.color = color;
        return this;
    }

    public DrawingRoomBuilder setFlooringType(String flooringType) {
        this.flooringType = flooringType;
        return this;
    }

    public DrawingRoom createDrawingRoom() {
        return new DrawingRoom(numberOfWindows, numberOfDoors, length, width, height, numberOfLights, color, flooringType);
    }
}