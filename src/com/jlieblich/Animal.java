package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Animal {
    private int mNumLegs;
    private float mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int numLegs, float topSpeed, boolean isEndangered, String name) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public float getTopSpeed() {
        return mTopSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }
}
