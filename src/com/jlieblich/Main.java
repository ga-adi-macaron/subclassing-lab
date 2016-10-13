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
    }
}
