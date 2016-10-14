package com.DAVE;

/**
 * Created by ds on 10/13/16.
 */
public class Animals {

    private int mNumLegs;
    private int mTopSpeed;
    private boolean mIsEndangered;

    public Animals(int numLegs, int topSpeed, boolean isEndangered) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;

    }

    public int getNumLegs() {return mNumLegs; }

    public void setNumLegs(int numLegs) {
        mNumLegs = numLegs;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        mTopSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setEndangered(boolean endangered) {
        mIsEndangered = endangered;
    }
}
