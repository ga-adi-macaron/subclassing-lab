package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Primate extends Mammal {
    private static boolean mIsBipedal;
    private static String mRelativeIntelligence;

    public Primate(String name, int numLegs, float topSpeed, boolean isEndangered, int daysOfGestation, boolean hasFur, boolean isBipedal, String relativeIntelligence) {
        super(name, numLegs, topSpeed, isEndangered, daysOfGestation, hasFur);
        mIsBipedal=isBipedal;
        mRelativeIntelligence=relativeIntelligence;
    }

    public static boolean ismIsBipedal() {
        return mIsBipedal;
    }

    public static void setmIsBipedal(boolean mIsBipedal) {
        Primate.mIsBipedal = mIsBipedal;
    }

    public static String getmRelativeIntelligence() {
        return mRelativeIntelligence;
    }

    public static void setmRelativeIntelligence(String mRelativeIntelligence) {
        Primate.mRelativeIntelligence = mRelativeIntelligence;
    }
}
