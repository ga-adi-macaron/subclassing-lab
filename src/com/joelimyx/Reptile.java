package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Reptile extends Animal {
    private String mFoodType;
    private boolean mHasTeeth;

    public String getFoodType() {
        return mFoodType;
    }

    public void setFoodType(String foodType) {
        mFoodType = foodType;
    }

    public boolean hasTeeth() {
        return mHasTeeth;
    }

    public void setPoisonous(boolean poisonous) {
        mHasTeeth = poisonous;
    }

    public Reptile(String name, boolean isEndangered, int numLegs, double topSpeed, String foodType, boolean hasTeeth) {
        super(name, isEndangered, numLegs, topSpeed);
        mFoodType = foodType;
        mHasTeeth= hasTeeth;

    }
}
