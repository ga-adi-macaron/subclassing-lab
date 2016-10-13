package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class MSpeices extends Mammal {
    private String mSubClass;
    private String mMamSpeices;

    public MSpeices(int numberLegs, float topSpeed, boolean isEndangered, String name, String furType, float gestationLength, String subClass, String mamSpeices) {
        super(numberLegs, topSpeed, isEndangered, name, furType, gestationLength);
        mSubClass = subClass;
        mMamSpeices = mamSpeices;
    }

    public String getSubClass() {
        return mSubClass;
    }

    public String getMamSpeices() {
        return mMamSpeices;
    }

    public void setSubClass(String subClass) {
        mSubClass = subClass;
    }

    public void setMamSpeices(String mamSpeices) {
        mMamSpeices = mamSpeices;
    }
}
