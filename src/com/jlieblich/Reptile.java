package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Reptile extends Animal {
    private String[] mScaleColors;

    public Reptile(int numLegs, float topSpeed, boolean isEndangered, String name, String[] scaleColors) {
        super(numLegs, topSpeed, isEndangered, name);
        mScaleColors = scaleColors;
    }

    public String getScaleColors(int n) {
        return mScaleColors[n];
    }
}
