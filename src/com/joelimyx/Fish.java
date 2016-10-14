package com.joelimyx;

/**
 * Created by Joe on 10/13/16.
 */
public class Fish extends Animal {
    private boolean mIsOcean;
    private boolean mHasTeeth;

    public String getScaleColor() {
        return mScaleColor;
    }

    public void setScaleColor(String scaleColor) {
        mScaleColor = scaleColor;
    }

    private String mScaleColor;

    public boolean isOcean() {
        return mIsOcean;
    }

    public void setOcean(boolean ocean) {
        mIsOcean = ocean;
    }

    public boolean hasTeeth() {
        return mHasTeeth;
    }

    public void setTeeth(boolean hasTeeth) {
        mHasTeeth = hasTeeth;
    }

    public Fish(String name, boolean isEndangered, double topSpeed, boolean isOcean, boolean hasTeeth, String scaleColor) {
        super(name, isEndangered, 0, topSpeed);
        mIsOcean = isOcean;
        mHasTeeth = hasTeeth;
        mScaleColor = scaleColor;
    }
}
