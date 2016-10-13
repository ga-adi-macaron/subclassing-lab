package com.company;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(4, 70, false, "Cheetah");
        Mammal mammal = new Mammal(4, 30, false, "Grizzly Bear", 3);
        Reptile reptile = new Reptile(0, 40, true, "Cobra", true);
        Bat bat = new Bat(2, 55, false, "Vampire Bat", 6, false);
        Dolphin dolphin = new Dolphin(0, 50, false, "Bottlenose Dolphin", 1, true);
        Python python = new Python(0, 45, false, "Python", true, true);
        Salamander salamander = new Salamander(4, 40, true, "Charmander", true, true);

        System.out.println("The name of the creature: " + animal.getName() + " - Number of Legs: " + animal.getNumLegs() + " - Top Speed: " + animal.getTopSpeed() +
        " - Is it Endangered?: " + animal.isEndangered());
        System.out.println("The name of the creature: " + mammal.getName() + " - Number of Legs: " + mammal.getNumLegs() + " - Top Speed: " + mammal.getTopSpeed() +
                " - Is it Endangered?: " + mammal.isEndangered() + " - How many offsprings a year?: " + mammal.getLitterSize());
        System.out.println("The name of the creature: " + reptile.getName() + " - Number of Legs: " + reptile.getNumLegs() + " - Top Speed: " + reptile.getTopSpeed() +
                " - Is it Endangered?: " + reptile.isEndangered() + " - Has scales?: " + reptile.isScaly());
        System.out.println("The name of the creature: " + bat.getName() + " - Number of Legs: " + bat.getNumLegs() + " - Top Speed: " + bat.getTopSpeed() +
                " - Is it Endangered?: " + bat.isEndangered() + " - Is related with Batman?: " + bat.isRelatedToBatman() + " - How many offsprings a year?: " + bat.getLitterSize());
        System.out.println("The name of the creature: " + dolphin.getName() + " - Number of Legs: " + dolphin.getNumLegs() + " - Top Speed: " + dolphin.getTopSpeed() +
                " - Is it Endangered?: " + dolphin.isEndangered() + " - Is actually pretty smart?: " + dolphin.isSmart() + " - How many offsprings a year?: " + dolphin.getLitterSize());
        System.out.println("The name of the creature: " + python.getName() + " - Number of Legs: " + python.getNumLegs() + " - Top Speed: " + python.getTopSpeed() +
                " - Is it Endangered?: " + python.isEndangered() + " - Is it also a programming language? " + python.isAlsoAProgrammingLanguage() + " - Has scales?: " + python.isScaly());
        System.out.println("The name of the creature: " + salamander.getName() + " - Number of Legs: " + salamander.getNumLegs() + " - Top Speed: " + salamander.getTopSpeed() +
                " - Is it Endangered?: " + salamander.isEndangered() + " - Does it look like it's smiling?: " + salamander.isSmiling() + " - Has scales?: " + salamander.isScaly());
    }
}
