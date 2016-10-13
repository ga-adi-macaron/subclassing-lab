package com.justin;

/**
 * Created by justinwells on 10/13/16.
 */
public class Reptile extends Animal {

    public Reptile(int topSpeed, int numLegs, boolean isEndangered, String name) {
        super(topSpeed, numLegs, isEndangered, name);
    }

    @Override
    public String getBloodTemp() {
        super.setBloodTemp("Cold");
        return super.getBloodTemp();
    }
}
