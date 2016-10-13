package com.justin;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Mammal gorilla = new Mammal (15,4,false,"Gorilla");
        Reptile iguana = new Reptile(10,4,false,"Iguana");
        Mammal tiger = new Mammal (30,4,true,"Tiger");

        List <Animal> animals = new ArrayList<>();
        animals.add(gorilla);
        animals.add(iguana);
        animals.add(tiger);

        for (int i = 0; i < animals.size(); i++) {
            System.out.println("The " + animals.get(i).getName()
                    + " has a top speed of " + animals.get(i).getTopSpeed()
                    + ", has " + animals.get(i).getNumLegs() + " legs "
                    + "and is " + animals.get(i).getBloodTemp() + " blooded.");
            if (animals.get(i).isEndangered()) {
                System.out.println("It is endangered.");

            }
            System.out.println();
        }

    }
}
