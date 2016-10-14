package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Mammal extends Animal {
    private String mFurColor;

    public Mammal(int numLegs, float topSpeed, boolean isEndangered, String name, String furColor) {
        super(numLegs, topSpeed, isEndangered, name);
        mFurColor = furColor;
    }

    public String getFurColor() {
        return mFurColor;
    }
}
