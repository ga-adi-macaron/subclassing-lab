/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Dog extends Mammal{
    private boolean mIsFriendly;

    public Dog(double topSpeed, String name) {
        super(4, topSpeed, false, name);
        mIsFriendly = true;
    }

    @Override
    public void makeSound() {
        System.out.println("WOOF!");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("(Happy and excited running)");
    }

    public boolean isFriendly() {
        return mIsFriendly;
    }


}
