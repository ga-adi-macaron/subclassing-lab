/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Crocodile extends Reptile{
    private int mNumberOfTeeth;

    public Crocodile(double topSpeed, String name, int numberOfTeeth) {
        super(4, topSpeed, false, name);
        mNumberOfTeeth = numberOfTeeth;
    }

    @Override
    public void move() {
        super.move();
        System.out.println("(belly dragging slide)");
    }


    @Override
    public void makeSound() {
        System.out.println("GRRRRRR");
    }
}
