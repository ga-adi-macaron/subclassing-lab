package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Dolphin extends Mammal {
    private boolean isSmart;

    public Dolphin(int numLegs, int topSpeed, boolean isEndangered, String name, int litterSize, boolean isSmart) {
        super(numLegs, topSpeed, isEndangered, name, litterSize);
        this.isSmart = isSmart;
    }

    public boolean isSmart() {
        return isSmart;
    }

    public void setSmart(boolean smart) {
        isSmart = smart;
    }
}
