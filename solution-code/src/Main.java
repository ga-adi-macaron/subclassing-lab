
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(10,true,"Panda");

        System.out.println("Animal: "+animal.getName());
        System.out.println("Animal: "+animal.getTopSpeed());
        System.out.println("Animal: "+animal.isEndangered());

        Mammal mammal = new Mammal(4,5,false,"Dog");
        System.out.println("Mammal: "+mammal.getName());
        System.out.println("Mammal: "+mammal.getNumLegs());

        Reptile reptile = new Reptile(true,50,true,"Turtle");
        System.out.println("Reptile: "+reptile.getName());
        System.out.println("Reptile: "+reptile.getHasShell());

        Lion lion = new Lion(true);
        System.out.println("Lion: "+lion.isAlpha());

        Snake snake = new Snake(true);
        System.out.println("Snake: "+snake.isPoisonous());

    }
}
