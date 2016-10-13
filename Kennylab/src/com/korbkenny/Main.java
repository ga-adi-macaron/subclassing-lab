package com.korbkenny;

public class Main {

    public static void main(String[] args) {

        Moose roger = new Moose(4, 5, false, "Roger the Moose", "Brown", true, true);
        Snake noFeet = new Snake(0, 15, false, "No Feet", true, 16, true);

        System.out.println("This snake's name is "+noFeet.getName());
        System.out.println("It has "+noFeet.getNumLegs() +" legs");
        System.out.println("It can travel at speeds of " +noFeet.getTopSpeed()+ "mph");
        System.out.println("Endangered? "+noFeet.isEndangered());
        System.out.println("As for a rattle, it is "+noFeet.isHasRattle()+ " that it has one");
        System.out.println("It lays on the pavement for "+noFeet.getHoursItLaysOnPavement()+" hours per day");
        System.out.println("It is "+noFeet.isHasBeadySoullessEyes()+" that it has beady, soulless eyes");

        System.out.println("");

        System.out.println("This moose's name is "+roger.getName());
        System.out.println("It has "+roger.getNumLegs() +" legs");
        System.out.println("It can travel at speeds of " +roger.getTopSpeed()+"mph");
        System.out.println("Endangered? " +roger.isEndangered());
        System.out.println("It's fur is "+roger.getFurColor());
        System.out.println("As for antlers, it is "+roger.isHasAntlers()+" that it has them");
        System.out.println("It is "+roger.livesOnLand()+" that it lives on land");
    }
}
