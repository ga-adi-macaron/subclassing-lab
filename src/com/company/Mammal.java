package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Mammal extends Animal {
    private int mNumberOfOffspring;

    public Mammal(String name, int numLegs, float topSpeed,
                  boolean isEndangered, int numberOfOffspring) {
        super(name, numLegs, topSpeed, isEndangered);
        mNumberOfOffspring = numberOfOffspring;
    }

    public int getNumberOfOffspring() {
        return mNumberOfOffspring;
    }

    public void setNumberOfOffspring(int numberOfOffspring) {
        mNumberOfOffspring = numberOfOffspring;
    }
}
