package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class Reptile extends Animal {
    private int mEggCount;
    private String mScaleSize;

    public Reptile(int numberLegs, float topSpeed, boolean isEndangered, String name, int eggCount, String scaleSize) {
        super(numberLegs, topSpeed, isEndangered, name);
        mEggCount = eggCount;
        mScaleSize = scaleSize;
    }

    public int getEggCount() {
        return mEggCount;
    }

    public String getScaleSize() {
        return mScaleSize;
    }

    public void setEggCount(int eggCount) {
        mEggCount = eggCount;
    }

    public void setScaleSize(String scaleSize) {
        mScaleSize = scaleSize;
    }
}
