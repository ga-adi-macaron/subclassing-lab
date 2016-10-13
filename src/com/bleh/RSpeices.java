package com.bleh;

/**
 * Created by colinbradley on 10/13/16.
 */
public class RSpeices extends Reptile {
    private String mOrder;
    private String mSpeices;

    public RSpeices(int numberLegs, float topSpeed, boolean isEndangered, String name, int eggCount, String scaleSize, String order, String speices) {
        super(numberLegs, topSpeed, isEndangered, name, eggCount, scaleSize);
        mOrder = order;
        mSpeices = speices;
    }

    public String getOrder() {
        return mOrder;
    }

    public String getSpeices() {
        return mSpeices;
    }

    public void setOrder(String order) {
        mOrder = order;
    }

    public void setSpeices(String speices) {
        mSpeices = speices;
    }
}
