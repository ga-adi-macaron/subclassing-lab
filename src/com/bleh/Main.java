package com.bleh;

public class Main {

    public static void main(String[] args) {
        RSpeices newReptile = new RSpeices(0, 3.0f, false, "Eastern Diamondback Rattlesnake", 25, "small", "Squamata", "Crotalus adamanteus");
            System.out.println("Common Name: " + newReptile.getName());
            System.out.println("Order: " + newReptile.getOrder());
            System.out.println("Speices: " + newReptile.getSpeices());
            System.out.println("Number of Legs: " + newReptile.getNumberLegs());
            System.out.println("Top Speed: " + newReptile.getTopSpeed() + "MPH");
            System.out.println("Scale Size: " + newReptile.getScaleSize());
            System.out.println("Max amount of eggs: " + newReptile.getEggCount());
            System.out.println("Endangered: " + newReptile.isEndangered());

        System.out.println("\n");

        MSpeices newMammal = new MSpeices(2, 10.0f, true, "Goodfellow's Tree Kangaroo", "Short but Thick Fur", 1.5f, "Diprotodontia", "Dendrolagus goodfellowi");
            System.out.println("Common Name: " + newMammal.getName());
            System.out.println("Order: " + newMammal.getSubClass());
            System.out.println("Species: " + newMammal.getMamSpeices());
            System.out.println("Number of Legs: " + newMammal.getNumberLegs());
            System.out.println("Top Speed: " + newMammal.getTopSpeed() + "MPH on ground. Much faster in trees but no documented rate of speed.");
            System.out.println("Fur Type: " + newMammal.getFurType());
            System.out.println("Gestation Period: " + newMammal.getGestationLength() + " Months");
            System.out.println("Endangered: " + newMammal.isEndangered());


    }
}
