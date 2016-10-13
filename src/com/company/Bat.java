package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Bat extends Mammal{
    private boolean isRelatedToBatman;

    public Bat(int numLegs, int topSpeed, boolean isEndangered, String name, int litterSize, boolean isRelatedToBatman) {
        super(numLegs, topSpeed, isEndangered, name, litterSize);
        this.isRelatedToBatman = isRelatedToBatman;
    }

    public boolean isRelatedToBatman() {
        return isRelatedToBatman;
    }

    public void setRelatedToBatman(boolean relatedToBatman) {
        isRelatedToBatman = relatedToBatman;
    }
}
