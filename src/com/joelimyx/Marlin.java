package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Marlin extends Fish {
    private double mSaberLength;
    private double mDorsalFinLength;

    public Marlin(String name, boolean isEndangered, double topSpeed, String scaleColor, double saberLength, double dorsalFinLength) {
        super(name, isEndangered, topSpeed, true, false, scaleColor);
        mSaberLength = saberLength;
        mDorsalFinLength = dorsalFinLength;
    }

    public double getSaberLength() {

        return mSaberLength;
    }

    public void setSaberLength(double saberLength) {
        mSaberLength = saberLength;
    }

    public double getDorsalFinLength() {
        return mDorsalFinLength;
    }

    public void setDorsalFinLength(double dorsalFinLength) {
        mDorsalFinLength = dorsalFinLength;
    }
}
