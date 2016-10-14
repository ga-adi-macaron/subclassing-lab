package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Mammal extends Animal {
    private String mFurColor;
    private boolean mHasWing;

    public String getFurColor() {
        return mFurColor;
    }

    public void setFurColor(String furColor) {
        mFurColor = furColor;
    }

    public boolean hasWing() {
        return mHasWing;
    }

    public void setHasWing(boolean hasWing) {
        mHasWing = hasWing;
    }

    public Mammal(String name, boolean isEndangered, int numLegs, double topSpeed, String furColor, boolean hasWing) {

        super(name, isEndangered, numLegs, topSpeed);
        mFurColor = furColor;
        mHasWing = hasWing;
    }
}
