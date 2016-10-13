package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Animal {
    private String mName;
    private boolean mIsEndangered;
    private int mNumLegs;
    private double mTopSpeed;

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setEndangered(boolean endangered) {
        mIsEndangered = endangered;
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public void setNumLegs(int numLegs) {
        mNumLegs = numLegs;
    }

    public double getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        mTopSpeed = topSpeed;
    }

    public Animal(String name, boolean isEndangered, int numLegs, double topSpeed) {

        mName = name;
        mIsEndangered = isEndangered;
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
    }
}
