package com.jlieblich;

/**
 * Created by jonlieblich on 10/13/16.
 */
public class Cheetah extends Mammal {
    private int mAntelopeKills;

    public Cheetah(int numLegs, float topSpeed, boolean isEndangered, String name, String furColor, int antelopeKills) {
        super(numLegs, topSpeed, isEndangered, name, furColor);
        mAntelopeKills = antelopeKills;
    }

    public int getAntelopeKills() {
        return mAntelopeKills;
    }

    public void addNewKill() {
        mAntelopeKills++;
    }
}
