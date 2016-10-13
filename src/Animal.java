/**
 * Created by Scott Lindley on 10/13/2016.
 */
public abstract class Animal {
    private int mNumLegs;
    private double mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int numLegs, double topSpeed, boolean isEndangered, String name) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public abstract void move();

    public abstract void makeSound();

    public int getNumLegs() {
        return mNumLegs;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public String getName() {
        return mName;
    }

    public double getTopSpeed(){return mTopSpeed;}
}
