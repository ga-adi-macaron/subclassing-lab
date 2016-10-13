/**
 * Created by Scott Lindley on 10/13/2016.
 */
public class Reptile extends Animal{
    private static final boolean IS_WARM_BLOODED = false;
    private boolean mHasForkedTongue;
    private boolean mIsVenomous;

    public Reptile(int numLegs, double topSpeed, boolean isEndangered, String name) {
        super(numLegs, topSpeed, isEndangered, name);
        mHasForkedTongue = false;
        mIsVenomous = false;
    }


    public boolean HasForkedTongue() {
        return mHasForkedTongue;
    }

    public boolean isVenomous() {
        return mIsVenomous;
    }

    public void setHasForkedTongue(boolean hasForkedTongue) {
        mHasForkedTongue = hasForkedTongue;
    }

    public void setVenomous(boolean venomous) {
        mIsVenomous = venomous;
    }
}
