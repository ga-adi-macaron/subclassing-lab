package com.joelimyx;

public class Main {

    public static void main(String[] args) {
	//Test Animal
        Animal dinosaur = new Animal("Dinosaur", true, 2, 15);
        System.out.println(
                "Name: "+dinosaur.getName()+
                ". \nIs endangered: "+dinosaur.isEndangered() +
                ". \n# of Legs: "+dinosaur.getNumLegs() +
                ". \nTop Speed: "+dinosaur.getTopSpeed());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Test Mammal
        Mammal polar_bear = new Mammal("Polar Bear", true, 4, 30, "White", false);
        System.out.println(
                "Name: "+polar_bear.getName()+
                ". \nIs endangered: "+polar_bear.isEndangered() +
                ". \n# of Leg: "+polar_bear.getNumLegs() +
                ". \nTop Speed: "+polar_bear.getTopSpeed() +
                ". \nFur Color: "+polar_bear.getFurColor() +
                ". \nHas Wing: "+polar_bear.hasWing());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Test Human
        Human tom = new Human("Tom",20,"Black","Asian", false);
        System.out.println(
                "Name: "+tom.getName()+
                ". \nIs endangered: "+tom.isEndangered() +
                ". \n# of Leg: "+tom.getNumLegs() +
                ". \nTop Speed: "+tom.getTopSpeed() +
                ". \nFur Color: "+tom.getFurColor() +
                ". \nHas Wing: "+tom.hasWing() +
                ". \nHas Facial Hair: "+ tom.isHasFacialHair() +
                ". \nRace: "+ tom.getRace());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Test Reptile
        Reptile lizard = new Reptile("Cameleon",false, 4, 12, "Insect", false);
        System.out.println(
                "Name: "+lizard.getName() +
                ". \nIs endangered: "+lizard.isEndangered() +
                ". \n# of Legs: "+lizard.getNumLegs() +
                ". \nTop Speed: "+lizard.getTopSpeed() +
                ". \nFood Type: "+lizard.getFoodType() +
                ". \nHas Teeth: "+lizard.hasTeeth());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Test Snake
        Snake cobra = new Snake("Cobra", false, 10, "Mammal", 20, true);
        System.out.println(
                "Name: "+cobra.getName() +
                ". \nIs endangered: "+cobra.isEndangered() +
                ". \n# of Legs: "+cobra.getNumLegs() +
                ". \nTop Speed: "+cobra.getTopSpeed() +
                ". \nFood Type: "+cobra.getFoodType() +
                ". \nHas Teeth: "+cobra.hasTeeth() +
                ". \nSnake's Length: "+cobra.getLength()+
                ". \nIs Venomous: "+cobra.isVenomous());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        //Bonus Group
        //Test Fish
        Fish eel = new Fish("Electric eel", false, 10, false, false, "Brown");
        System.out.println(
                "Name: " + eel.getName()+
                ". \nIs endangered: "+ eel.isEndangered()+
                ". \n# of Legs: "+ eel.getNumLegs()+
                ". \nTop Speed: "+ eel.getTopSpeed()+
                ". \nFrom the Ocean: "+eel.isOcean() +
                ". \nHas Teeth: "+eel.hasTeeth()+
                ". \nScale Color: "+ eel.getScaleColor());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        //Test Marlin
        Marlin scoot = new Marlin("Blue Marlin", true, 60, "blue", 4, 5);
        System.out.println(
                "Name: " + scoot.getName()+
                ". \nIs endangered: "+ scoot.isEndangered()+
                ". \n# of Legs: "+ scoot.getNumLegs()+
                ". \nTop Speed: "+ scoot.getTopSpeed()+
                ". \nFrom the Ocean: "+scoot.isOcean() +
                ". \nHas Teeth: "+scoot.hasTeeth()+
                ". \nScale Color: "+ scoot.getScaleColor() +
                ". \nSaber Length: "+ scoot.getSaberLength() +
                ". \nDorsal Fin: "+ scoot.getDorsalFinLength());
    }
}
