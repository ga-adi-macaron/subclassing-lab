package com.company;

public class Main {

    public static void main(String[] args) {
        Rabbit bugs = new Rabbit("Bugs Bunny", 2, 45, false, 6, "gray and white");
        System.out.println("Name: "+bugs.getName());
        System.out.println("Stands on " + bugs.getNumLegs() + " legs");
        System.out.println("Topspeed: "+bugs.getTopSpeed()+" mph");
        System.out.println("Endangered: "+bugs.isEndangered());
        System.out.println("Average Number of Offspring: "+bugs.getNumberOfOffspring());
        System.out.println("Bug's color: " + bugs.getColor());

        System.out.println("-------------------"); // Separation

        Turtle cecil = new Turtle("Cecil Turtle", 2, 4, false, true, 500);
        System.out.println("Name: "+cecil.getName());
        System.out.println("Stands on " + cecil.getNumLegs() + " legs");
        System.out.println("Topspeed: "+cecil.getTopSpeed()+" mph");
        System.out.println("Endangered: "+cecil.isEndangered());
        System.out.println("Has a shell: "+cecil.isHasShell());
        System.out.println("Cecil's weight: " + cecil.getWeight());
    }
}
