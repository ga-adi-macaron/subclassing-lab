package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class Animal {
    private int mNumberLegs;
    private float mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int numberLegs, float topSpeed, boolean isEndangered, String name) {
        mNumberLegs = numberLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public int getNumberLegs() {
        return mNumberLegs;
    }

    public float getTopSpeed() {
        return mTopSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setNumberLegs(int numberLegs) {
        mNumberLegs = numberLegs;
    }

    public void setTopSpeed(float topSpeed) {
        mTopSpeed = topSpeed;
    }

    public void setEndangered(boolean endangered) {
        mIsEndangered = endangered;
    }

    public void setName(String name) {
        mName = name;
    }
}
