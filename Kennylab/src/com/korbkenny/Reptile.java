package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Reptile extends Animal{
    private boolean mHasBeadySoullessEyes;
    private int mHoursItLaysOnPavement;

    public Reptile(int numLegs, int topSpeed, boolean isEndangered, String name, boolean hasBeadySoullessEyes, int hoursItLaysOnPavement) {
        super(numLegs, topSpeed, isEndangered, name);
        mHasBeadySoullessEyes = hasBeadySoullessEyes;
        mHoursItLaysOnPavement = hoursItLaysOnPavement;
    }

    public boolean isHasBeadySoullessEyes() {
        return mHasBeadySoullessEyes;
    }

    public int getHoursItLaysOnPavement() {
        return mHoursItLaysOnPavement;
    }

    public void setHasBeadySoullessEyes(boolean hasBeadySoullessEyes) {
        mHasBeadySoullessEyes = hasBeadySoullessEyes;
    }

    public void setHoursItLaysOnPavement(int hoursItLaysOnPavement) {
        mHoursItLaysOnPavement = hoursItLaysOnPavement;
    }
}
