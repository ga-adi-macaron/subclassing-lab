package com.elysium;

/**
 * Created by jay on 10/17/16.
 */
public class Cottonmouth extends Reptile {

    private boolean mLiveBirth;
    private boolean mMultipleYoung;

    public Cottonmouth(int numLegs, int topSpeed, boolean isEndangered, String name, boolean liveYoung, boolean multipleYoung) {
        super(numLegs, topSpeed, isEndangered, name, liveYoung, multipleYoung);

        mMultipleYoung = multipleYoung;
        mLiveBirth = liveYoung;
    }

    public boolean isLiveBirth() {
        return mLiveBirth;
    }

    public boolean isMultipleYoung() {
        return mMultipleYoung;

    }
}
