package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Mammal extends Animal {
    private int mLitterSize;

    public Mammal(int numLegs, int topSpeed, boolean isEndangered, String name, int litterSize) {
        super(numLegs, topSpeed, isEndangered, name);
        mLitterSize = litterSize;
    }

    public int getLitterSize() {
        return mLitterSize;
    }

    public void setLitterSize(int litterSize) {
        mLitterSize = litterSize;
    }
}
