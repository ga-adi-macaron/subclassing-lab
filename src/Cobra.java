/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Cobra extends Reptile{
    private double mBodyLength;

    public Cobra(double topSpeed, String name, double bodyLength) {
        super(0, topSpeed, false, name);
        mBodyLength = bodyLength;
        super.setVenomous(true);
        super.setHasForkedTongue(true);
    }

    @Override
    public void move() {
        System.out.println(getName()+"is moving at a top speed of "+getTopSpeed());
        System.out.println("Slither Slither");
    }


    @Override
    public void makeSound() {
        System.out.println("SsSsSsSsSsSs");
    }

}
