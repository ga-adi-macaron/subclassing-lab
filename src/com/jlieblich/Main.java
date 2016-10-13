package com.jlieblich;

public class Main {

    public static void main(String[] args) {
        Cheetah cheetah = new Cheetah(4, 65.0f, false, "The Cheetos Cheeta", "Spotted", 0);
        System.out.println(cheetah.getAntelopeKills());
        System.out.println(cheetah.getFurColor());
        System.out.println(cheetah.getName());
        System.out.println(cheetah.getNumLegs());
        System.out.println(cheetah.getTopSpeed());
        System.out.println(cheetah.isEndangered());
        System.out.println();

        Snake snake = new Snake(0, 0.5f, true, "Medusa's Hair", new String[]{"Stone Grey", "Marble White"}, "Unknown");
        System.out.println(snake.getTopSpeed());
        System.out.println(snake.getNumLegs());
        System.out.println(snake.getName());
        System.out.println(snake.isEndangered());
        System.out.println(snake.getSpecies());
        System.out.println(snake.getScaleColors(0));
        System.out.println(snake.getScaleColors(1));
        System.out.println();

        Reptile reptile = new Reptile(4, 5.0f, true, "Komodo Dragon", new String[]{"Brown", "Green"});
        System.out.println(reptile.getScaleColors(0));
        System.out.println(reptile.getScaleColors(1));
        System.out.println(reptile.isEndangered());
        System.out.println(reptile.getName());
        System.out.println(reptile.getTopSpeed());
        System.out.println(reptile.getNumLegs());
        System.out.println();

        Mammal mammal = new Mammal(2, 28.0f, false, "Usain Bolt", "No fur");
        System.out.println(mammal.getFurColor());
        System.out.println(mammal.getNumLegs());
        System.out.println(mammal.getTopSpeed());
        System.out.println(mammal.getName());
        System.out.println(mammal.isEndangered());
        System.out.println();

        Animal animal = new Animal(46, 3.0f, false, "That Really Scary-Looking Centipede");
        System.out.println(animal.getName());
        System.out.println(animal.getTopSpeed());
        System.out.println(animal.isEndangered());
        System.out.println(animal.getNumLegs());
    }
}
