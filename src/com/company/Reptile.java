package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Reptile extends Animal{
    private boolean mHasShell;

    public Reptile(String name, int numLegs, float topSpeed,
                   boolean isEndangered, boolean hasShell) {
        super(name, numLegs, topSpeed, isEndangered);
        mHasShell = hasShell;
    }

    public boolean isHasShell() {
        return mHasShell;
    }

    public void setHasShell(boolean hasShell) {
        mHasShell = hasShell;
    }
}
