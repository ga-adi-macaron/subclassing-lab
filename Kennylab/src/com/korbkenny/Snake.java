package com.korbkenny;

/**
 * Created by KorbBookProReturns on 10/13/16.
 */
public class Snake extends Reptile {
    private boolean mHasRattle;

    public Snake(int numLegs, int topSpeed, boolean isEndangered, String name, boolean hasBeadySoullessEyes, int hoursItLaysOnPavement, boolean hasRattle) {
        super(numLegs, topSpeed, isEndangered, name, hasBeadySoullessEyes, hoursItLaysOnPavement);
        mHasRattle = hasRattle;
    }

    public boolean isHasRattle() {
        return mHasRattle;
    }

    public void setHasRattle(boolean hasRattle) {
        mHasRattle = hasRattle;
    }
}
