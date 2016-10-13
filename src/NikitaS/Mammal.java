package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Mammal extends Animal{
    private static int mDaysOfGestation;
    private static boolean mHasFur;//As opposed to hair.

    public Mammal(String name, int numLegs, float topSpeed, boolean isEndangered, int daysOfGestation, boolean hasFur) {
        super(name, numLegs, topSpeed, isEndangered);
        mDaysOfGestation=daysOfGestation;
        mHasFur=hasFur;
    }

    public static int getmDaysOfGestation() {
        return mDaysOfGestation;
    }

    public static void setmDaysOfGestation(int mDaysOfGestation) {
        Mammal.mDaysOfGestation = mDaysOfGestation;
    }

    public static boolean ismHasFur() {
        return mHasFur;
    }

    public static void setmHasFur(boolean mHasFur) {
        Mammal.mHasFur = mHasFur;
    }
}
