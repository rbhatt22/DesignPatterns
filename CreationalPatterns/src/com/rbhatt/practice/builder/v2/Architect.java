package com.rbhatt.practice.builder.v2;

/**
 * Created by rbhatt22 on 2/12/21.
 */
public class Architect {

    public static void main(String[] args) {

        DrawingRoom room = new DrawingRoomBuilder().setNumberOfWindows(4).setNumberOfDoors(2).setLength(50).setWidth(50).setHeight(50).setNumberOfLights(5).setColor("white").setFlooringType("carpet").createDrawingRoom();

        DrawingRoom room1 = new DrawingRoomBuilder().setNumberOfWindows(2).setNumberOfDoors(1).setLength(20).setWidth(20).setHeight(20).createDrawingRoom();

    }

}
