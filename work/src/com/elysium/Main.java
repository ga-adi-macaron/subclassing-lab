package com.elysium;

public class Main {

    public static void main(String[] args) {

        Mammal Dog = new Mammal("German Shepherd", 4, 12.00f, false, false, true);
        Reptile Snake = new Reptile("Cotton Mouth", 0, 7.00f, false, false);

        System.out.println("I'm a dog " +getName() + "with" +getNumLegs() +" legs");
        System.out.println("I can run " +getTopSpeed() + " MPH");
        System.out.println("Am I endangered? " +getIsEndangered());

        System.out.println("");

        System.out.println("I'm a snake " +getName() + "with" +getNumLegs() +"legs");
        System.out.println("I can slither " +getTopSpeed() + " MPH");
        System.out.println("Am I endangered? " +getIsEndangered());

    }
}

