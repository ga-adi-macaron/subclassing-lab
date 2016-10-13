package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Reptile extends Animal{
    private static boolean mCanRegenerate;
    private static boolean mIsPoisonous;

    public Reptile(String name, int numLegs, float topSpeed, boolean isEndangered, boolean canRegenerate, boolean isPoisonous) {
        super(name, numLegs, topSpeed, isEndangered);
        mCanRegenerate=canRegenerate;
        mIsPoisonous = isPoisonous;
    }

    public static boolean ismCanRegenerate() {
        return mCanRegenerate;
    }

    public static void setmCanRegenerate(boolean mCanRegenerate) {
        Reptile.mCanRegenerate = mCanRegenerate;
    }

    public static boolean ismIsPoisonous() {
        return mIsPoisonous;
    }

    public static void setmIsPoisonous(boolean mIsPoisonous) {
        Reptile.mIsPoisonous = mIsPoisonous;
    }
}

