package com.github.zipcodewilmington;

public class RouletteGamePocket {
    private int number;
    private String color;

    public RouletteGamePocket(int number, String color) {
        this.number = number;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public String getColor() {
        return color;
    }
}
