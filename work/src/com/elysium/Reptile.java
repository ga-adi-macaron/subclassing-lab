package com.elysium;

/**
 * Created by jay on 10/14/16.
 */
public class Reptile extends Animal {

    private boolean liveBirth;
    private boolean multipleYoung;

    public Reptile(int numLegs, int topSpeed, boolean isEndangered, boolean liveBirth, String name, boolean multipleYoung) {
        super (numLegs, topSpeed, isEndangered, name);
    }
}
