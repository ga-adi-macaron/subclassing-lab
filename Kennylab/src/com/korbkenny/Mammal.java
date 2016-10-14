package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Mammal extends Animal {
    private String mFurColor;
    private boolean mLivesOnLand;

    public Mammal(int numLegs, int topSpeed, boolean isEndangered, String name, String furColor, boolean livesOnLand) {
        super(numLegs, topSpeed, isEndangered, name);
        mFurColor = furColor;
        mLivesOnLand = livesOnLand;
    }

    public String getFurColor() {
        return mFurColor;
    }

    public boolean livesOnLand() {
        return mLivesOnLand;
    }

    public void setFurColor(String furColor) {
        mFurColor = furColor;
    }

    public void setLivesOnLand(boolean livesOnLand) {
        mLivesOnLand = livesOnLand;
    }
}
