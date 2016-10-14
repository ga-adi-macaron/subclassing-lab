package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Turtle extends Reptile{
    private float mWeight;

    public Turtle(String name, int numLegs, float topSpeed, boolean isEndangered,
                  boolean hasShell, float weight) {
        super(name, numLegs, topSpeed, isEndangered, hasShell);
        mWeight = weight;
    }

    public float getWeight() {
        return mWeight;
    }

    public void setWeight(float weight) {
        mWeight = weight;
    }
}
