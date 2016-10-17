package com.elysium;

import javax.lang.model.element.Name;

/**
 * Created by jay on 10/14/16.
 */
public class Animall {

    private String mName;
    private int mNumLegs;
    private float mTopSpeed;
    private boolean mIsEndangered;

    public Animal(String, Name, int numLegs, float topSpeed, boolean isEndangered) {

        mName = Name;
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
    }

    public String getmName

    {

        return mName;
    }

    public void setmName(String Name) {

        mName = Name;
    }

    public void setmNumLegs(int numLegs) {

        mNumLegs = numLegs;
    }

    public void setmTopSpeed(float topSpeed) {

        mTopSpeed = topSpeed;
    }

    public void setmIsEndangered(boolean isEndangered) {

        mIsEndangered = isEndangered;
    }

    public void printAll() {
        System.out.println("Animal name: " +mName +"Number of legs: " +mNumLegs +"Max speed: " +mTopSpeed +"Endangered: " +mIsEndangered);

    }
}

