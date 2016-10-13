/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Elephant extends Mammal{
    private double mTrunkLength;

    public Elephant(double topSpeed, String name, double trunkLength) {
        super(4, topSpeed, true, name);
        mTrunkLength = trunkLength;
        super.setHasHair(false);
    }

    @Override
    public void makeSound() {
        System.out.println("BBRRRRRRUUUUUURRRRT!");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Stomp Stomp Stomp Stomp");
    }

}
