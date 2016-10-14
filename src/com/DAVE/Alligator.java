package com.DAVE;

/**
 * Created by ds on 10/13/16.
 */
public class Alligator extends Reptile {

    private String mColor;

    public Alligator(int numLegs, int topSpeed, boolean isEndangered, String bloodTemp, String color) {
        super(numLegs, topSpeed, isEndangered, bloodTemp);
        mColor = color;
    }

    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }
}