package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Animal {
    private int mNumlegs;
    private float mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(String name, int numLegs, float topSpeed, boolean isEndangered) {
        mName = name;
        mNumlegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
    }

    public int getmNumlegs() {
        return mNumlegs;
    }

    public void setmNumlegs(int numlegs) {
        mNumlegs = numlegs;
    }

    public float getmTopSpeed() {
        return mTopSpeed;
    }

    public void setmTopSpeed(float topSpeed) {
        mTopSpeed = topSpeed;
    }

    public boolean ismIsEndangered() {
        return mIsEndangered;
    }

    public void setisEndangered(boolean isEndangered) {
        mIsEndangered = isEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public void printAll(){
        System.out.println("\nAnimal name: "+mName+"\nNumber of legs: "+mNumlegs+
        "\nTop Speed is: " +mTopSpeed+"kph"+
        "\nIs "+mName+" endangered: "+mIsEndangered);
    }
}

//    Create an Animal class with the following properties set in the constructor: mNumLegs, mTopSpeed, mIsEndangered, mName.
//        Create subclasses of Animal called Mammal and Reptile
//        Create at least one subclass of Mammal, and one subclass of Reptile
//        Each subclass must have something that makes it unique from its parent class.
//        Create a main method that instantiates each class and prints out its details.