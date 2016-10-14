package com.DAVE;

/**
 * Created by ds on 10/13/16.
 */
public class Mammal extends Animals {

    private float mWeight;
    private int mHeightinInches;

    public Mammal(int numLegs, int topSpeed, boolean isEndangered, float weight, int heightinInches) {
        super(numLegs, topSpeed, isEndangered);
        mWeight = weight;
        mHeightinInches = heightinInches;
    }

    public float getWeight() {
        return mWeight;
    }

    public void setWeight(float weight) {
        mWeight = weight;
    }

    public int getHeightinInches() {
        return mHeightinInches;
    }

    public void setHeightinInches(int heightinInches) {
        mHeightinInches = heightinInches;
    }
}
