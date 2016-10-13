package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Animal {
    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int numLegs, int topSpeed, boolean isEndangered, String name) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setNumLegs(int numLegs) {
        mNumLegs = numLegs;
    }

    public void setTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }

    public void setEndangered(boolean endangered) {
        mIsEndangered = endangered;
    }

    public void setName(String name) {
        mName = name;
    }
}
