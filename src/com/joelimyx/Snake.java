package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Snake extends Reptile {
    private double mLength;
    private boolean isVenomous;

    public double getLength() {
        return mLength;
    }

    public void setLength(double length) {
        mLength = length;
    }

    public boolean isVenomous() {
        return isVenomous;
    }

    public void setVenomous(boolean venomous) {
        isVenomous = venomous;
    }

    public Snake(String name, boolean isEndangered, double topSpeed, String foodType, double length, boolean isVenomous) {
        super(name, isEndangered, 0, topSpeed, foodType, true);
        mLength = length;
        this.isVenomous = isVenomous;
    }
}
