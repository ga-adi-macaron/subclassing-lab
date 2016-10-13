import java.util.ArrayList;

/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Main {
    public static void main(String[] args) {
        Elephant elephant1 = new Elephant(25,"mr elephant",6);
        Dog dog1 = new Dog(30,"spot");
        Cobra cobra1 = new Cobra(6,"mr slithers", 5);
        Crocodile crocodile1 = new Crocodile(5, "snappy",56);

        System.out.println(elephant1.getName()+" has "+elephant1.getNumLegs()+" legs.");
        System.out.println(elephant1.hasHair()+", "+elephant1.getName()+"doesn't have hair.");
        System.out.println(dog1.isFriendly()+", "+dog1.getName()+" is friendly.");
        System.out.println(cobra1.HasForkedTongue()+", "+cobra1.getName()+" has a forked tongue.");
        System.out.println(cobra1.isVenomous()+", "+cobra1.getName()+" is venomous.");
        System.out.println(crocodile1.HasForkedTongue()+", "+crocodile1.getName()+" doesn't have a forked tongue.");
        System.out.println(crocodile1.isVenomous()+", "+crocodile1.getName()+" is not venomous.");


        ArrayList<Animal> myZoo = new ArrayList<>();

        myZoo.add(new Dog(32,"Clifford"));
        myZoo.add(new Elephant(24,"Dumbo",6.5));
        myZoo.add(new Cobra(9,"Sir Hiss",5.6));
        myZoo.add(new Crocodile(5.4, "Killer Croc", 57));


        System.out.println("*************************");

        for(Animal a: myZoo){
            System.out.println("Name:"+a.getName());
            System.out.println("Is endangered?: "+a.isEndangered());
            System.out.println("Number of legs:"+a.getNumLegs());
            a.makeSound();
            a.move();
            System.out.println("****************");
        }

    }
}
