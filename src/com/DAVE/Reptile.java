package com.DAVE;

/**
 * Created by ds on 10/13/16.
 */
public class Reptile extends Animals {

    private String mBloodTemp;

    public Reptile(int numLegs, int topSpeed, boolean isEndangered, String bloodTemp) {
        super(numLegs, topSpeed, isEndangered);
        this.mBloodTemp = bloodTemp;
    }

    public String getBloodTemp(){
        return mBloodTemp;
    }

    public void setBloodTemp(String bloodTemp) {
        mBloodTemp = bloodTemp;
    }
}

