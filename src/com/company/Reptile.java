package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Reptile extends Animal {
    private boolean isScaly;

    public Reptile(int numLegs, int topSpeed, boolean isEndangered, String name, boolean isScaly) {
        super(numLegs, topSpeed, isEndangered, name);
        this.isScaly = isScaly;
    }

    public boolean isScaly() {
        return isScaly;
    }

    public void setScaly(boolean scaly) {
        isScaly = scaly;
    }
}
