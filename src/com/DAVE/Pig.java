package com.DAVE;

/**
 * Created by ds on 10/13/16.
 */
public class Pig extends Mammal {

    private String mColor;
    private String mOriginCountry;


    public String getColor() {
        return mColor;
    }

    public void setColor(String color) {
        mColor = color;
    }

    public String getOriginCountry() {
        return mOriginCountry;
    }

    public void setOriginCountry(String originCountry) {
        mOriginCountry = originCountry;
    }

    public Pig(int numLegs, int topSpeed, boolean isEndangered, float weight, int heightinInches, String color, String originCountry) {
        super(numLegs, topSpeed, isEndangered, weight, heightinInches);
        mColor = color;
        mOriginCountry = originCountry;
    }
}
