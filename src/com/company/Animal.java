package com.company;

/**
 * Created by student on 10/13/16.
 */
public class Animal {
    private String mName;
    private int mNumLegs;
    private float mTopSpeed;
    private boolean mIsEndangered;

    public Animal(String name, int numLegs, float topSpeed, boolean isEndangered) {
        mName = name;
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public void setNumLegs(int numLegs) {
        mNumLegs = numLegs;
    }

    public float getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(float topSpeed) {
        mTopSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setEndangered(boolean endangered) {
        mIsEndangered = endangered;
    }
}
