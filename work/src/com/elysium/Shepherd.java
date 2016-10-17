package com.elysium;

/**
 * Created by jay on 10/17/16.
 */
public class Shepherd extends Mammal {

    private boolean mLiveBirth;
    private boolean mMultipleYoung;

    public GermanShepherd(int numLegs, int topSpeed, boolean isEndangered, String name, boolean liveBirth, boolean multipleYoung) {

        super(numLegs, topSpeed, isEndangered, name, liveBirth, multipleYoung);
        multipleYoung = liveBirth;
        mLiveBirth = liveBirth;
    }

    public boolean isLiveBirth() {
        return mLiveBirth;
    }

    public boolean isMultipleYoung() {
        return mMultipleYoung;
    }
}
