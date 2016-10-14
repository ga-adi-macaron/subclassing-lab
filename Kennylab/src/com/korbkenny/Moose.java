package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Moose extends Mammal {
    private boolean mHasAntlers;

    public Moose(int numLegs, int topSpeed, boolean isEndangered, String name, String furColor, boolean livesOnLand, boolean hasAntlers) {
        super(numLegs, topSpeed, isEndangered, name, furColor, livesOnLand);
        mHasAntlers = hasAntlers;
    }

    public boolean isHasAntlers() {
        return mHasAntlers;
    }

    public void setHasAntlers(boolean hasAntlers) {
        mHasAntlers = hasAntlers;
    }
}
