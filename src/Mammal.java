/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Mammal extends Animal{
    private static final boolean IS_WARM_BLOODED = true;
    private boolean mHasHair;

    public Mammal(int numLegs, double topSpeed, boolean isEndangered, String name) {
        super(numLegs, topSpeed, isEndangered, name);
        mHasHair = true;
    }

    public static boolean isWarmBlooded() {
        return IS_WARM_BLOODED;
    }

    public boolean hasHair() {
        return mHasHair;
    }

    public void setHasHair(boolean hasHair) {
        mHasHair = hasHair;
    }
}
