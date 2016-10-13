package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Animal {
    private static int mNumlegs;
    private static float mTopSpeed;
    private static boolean mIsEndangered;
    private static String mName;

    public Animal(String name, int numLegs, float topSpeed, boolean isEndangered) {
        mName = name;
        mNumlegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
    }

    public static int getmNumlegs() {
        return mNumlegs;
    }

    public static void setmNumlegs(int mNumlegs) {
        Animal.mNumlegs = mNumlegs;
    }

    public static float getmTopSpeed() {
        return mTopSpeed;
    }

    public static void setmTopSpeed(float mTopSpeed) {
        Animal.mTopSpeed = mTopSpeed;
    }

    public static boolean ismIsEndangered() {
        return mIsEndangered;
    }

    public static void setmIsEndangered(boolean mIsEndangered) {
        Animal.mIsEndangered = mIsEndangered;
    }

    public static String getmName() {
        return mName;
    }

    public static void setmName(String mName) {
        Animal.mName = mName;
    }
}

//    Create an Animal class with the following properties set in the constructor: mNumLegs, mTopSpeed, mIsEndangered, mName.
//        Create subclasses of Animal called Mammal and Reptile
//        Create at least one subclass of Mammal, and one subclass of Reptile
//        Each subclass must have something that makes it unique from its parent class.
//        Create a main method that instantiates each class and prints out its details.