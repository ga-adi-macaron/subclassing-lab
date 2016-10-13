package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class Mammal extends Animal{
    private String mFurType;
    private float mGestationLength;

    public Mammal(int numberLegs, float topSpeed, boolean isEndangered, String name, String furType, float gestationLength) {
        super(numberLegs, topSpeed, isEndangered, name);
        mFurType = furType;
        mGestationLength = gestationLength;
    }

    public String getFurType() {
        return mFurType;
    }

    public float getGestationLength() {
        return mGestationLength;
    }

    public void setFurType(String furType) {
        mFurType = furType;
    }

    public void setGestationLength(float gestationLength) {
        mGestationLength = gestationLength;
    }
}
