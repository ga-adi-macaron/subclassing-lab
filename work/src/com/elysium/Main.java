package com.elysium;

public class Main {

    public static void main(String[] args) {

        Mammal Dog = new Mammal("German Shepherd", 4, 12.00f, false, true);
        Reptile Snake = new Reptile("Cotton Mouth", 0, 7.00f, false, false);

        Dog.printAll();
        System.out.println("");

        Reptile.printAll();
        System.out.println("");
    }
}

