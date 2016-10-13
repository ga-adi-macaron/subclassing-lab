/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Animal {
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

    public void move(){
        System.out.println(mName+" is moving at a top speed of "+mTopSpeed);
    }

    public void makeSound(){
        System.out.println("ANIMAL SOUND");
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public String getName() {
        return mName;
    }
}
