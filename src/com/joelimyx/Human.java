package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Human extends Mammal{
    private String mRace;
    private boolean mHasFacialHair;

    public Human(String name, double topSpeed, String furColor, String race, boolean hasFacialHair) {
        super(name, false, 2 , topSpeed, furColor, false);
        mRace = race;
        mHasFacialHair = hasFacialHair;
    }

    public String getRace() {
        return mRace;
    }

    public boolean isHasFacialHair() {
        return mHasFacialHair;
    }

    public void setHasFacialHair(boolean hasFacialHair) {
        mHasFacialHair = hasFacialHair;
    }
}
