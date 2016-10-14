package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Snake extends Reptile {
    private String mSpecies;

    public Snake(int numLegs, float topSpeed, boolean isEndangered, String name, String[] scaleColors, String species) {
        super(numLegs, topSpeed, isEndangered, name, scaleColors);
        mSpecies = species;
    }

    public String getSpecies() {
        return mSpecies;
    }
}
