package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Rabbit extends Mammal {
    private String mColor;

    public Rabbit(String name, int numLegs, float topSpeed,
                  boolean isEndangered, int numberOfOffspring, String color) {
        super(name, numLegs, topSpeed, isEndangered, numberOfOffspring);
        mColor = color;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }
}
