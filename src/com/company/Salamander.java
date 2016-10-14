package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Salamander extends Reptile {
    private boolean isSmiling;

    public Salamander(int numLegs, int topSpeed, boolean isEndangered, String name, boolean isScaly, boolean isSmiling) {
        super(numLegs, topSpeed, isEndangered, name, isScaly);
        this.isSmiling = isSmiling;
    }

    public boolean isSmiling() {
        return isSmiling;
    }

    public void setSmiling(boolean smiling) {
        isSmiling = smiling;
    }
}
