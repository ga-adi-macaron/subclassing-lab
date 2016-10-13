package com.justin;

/**
 * Created by justinwells on 10/13/16.
 */
public class Animal {
    private int numLegs, topSpeed;
    private boolean isEndangered;
    private String name, bloodTemp = "Unknown";

    public Animal(int topSpeed, int numLegs, boolean isEndangered, String name) {
        this.topSpeed = topSpeed;
        this.numLegs = numLegs;
        this.isEndangered = isEndangered;
        this.name = name;
    }

    public int getNumLegs() {
        return numLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public String getName() {
        return name;
    }

    public String getBloodTemp () {
        return bloodTemp;
    }

    public void setBloodTemp (String bloodTemp) {
        this.bloodTemp = bloodTemp;
    }
}
