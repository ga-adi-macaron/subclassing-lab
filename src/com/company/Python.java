package com.company;

/**
 * Created by Serkan on 13/10/16.
 */
public class Python extends Reptile {
    private boolean isAlsoAProgrammingLanguage;

    public Python(int numLegs, int topSpeed, boolean isEndangered, String name, boolean isScaly, boolean isAlsoAProgrammingLanguage) {
        super(numLegs, topSpeed, isEndangered, name, isScaly);
        this.isAlsoAProgrammingLanguage = isAlsoAProgrammingLanguage;
    }

    public boolean isAlsoAProgrammingLanguage() {
        return isAlsoAProgrammingLanguage;
    }

    public void setAlsoAProgrammingLanguage(boolean alsoAProgrammingLanguage) {
        isAlsoAProgrammingLanguage = alsoAProgrammingLanguage;
    }
}
