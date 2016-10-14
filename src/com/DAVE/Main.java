package com.DAVE;

public class Main {

    public static void main(String[] args) {

        Mammal human= new Mammal(2, 20, true, 185, 69);
        System.out.println("\nHUMAN");
        System.out.println("Legs: "  + human.getNumLegs());
        System.out.println("Weight: " + human.getWeight());
        System.out.println("Height: " + human.getHeightinInches());
        System.out.println("Top Speed: " + human.getTopSpeed());
        System.out.println("Endangered: " + human.isEndangered());

        Reptile lizard= new Reptile(4, 30, false, "hot");
        System.out.println("\nLIZARD");
        System.out.println("Legs " + lizard.getNumLegs());
        System.out.println("Top Speed: " + lizard.getTopSpeed());
        System.out.println("Blood Temperature: " + lizard.getBloodTemp());
        System.out.println("Endangered:" + lizard.isEndangered());

        Pig landrace= new Pig(2, 15, false, 120, 35, "Black", "America");
        System.out.println("\nLANDRACE PIG");
        System.out.println("Legs: "  + landrace.getNumLegs());
        System.out.println("Weight: " + landrace.getWeight());
        System.out.println("Height: " + landrace.getHeightinInches());
        System.out.println("Top Speed: " + landrace.getTopSpeed());
        System.out.println("Endangered: " + landrace.isEndangered());
        System.out.println("Color :" + landrace.getColor());
        System.out.println("Country of Origin:" + landrace.getOriginCountry());

        Alligator chinese= new Alligator( 4, 17, true, "Warm", "Purple");
        System.out.println("\nCHINESE ALLIGATOR");

        System.out.println("Legs: "  + chinese.getNumLegs());
        System.out.println("Blood Temperature: " + chinese.getBloodTemp());
        System.out.println("Top Speed: " + chinese.getTopSpeed());
        System.out.println("Endangered: " + chinese.isEndangered());
        System.out.println("Color :" + chinese.getColor());
    }
}
