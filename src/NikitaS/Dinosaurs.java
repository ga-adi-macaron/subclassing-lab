package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Dinosaurs extends Reptile {
    private static boolean mIMadeItUp;
    private static boolean mIsAPowerRangerBot;

    public Dinosaurs(String name, int numLegs, float topSpeed, boolean isEndangered, boolean canRegenerate, boolean isPoisonous, boolean isAPowerRangerBot, boolean iMadeItUp) {
        super(name, numLegs, topSpeed, isEndangered, canRegenerate, isPoisonous);
        mIsAPowerRangerBot=isAPowerRangerBot;
        mIMadeItUp=iMadeItUp;
    }

    public static boolean ismIMadeItUp() {
        return mIMadeItUp;
    }

    public static void setmIMadeItUp(boolean mIMadeItUp) {
        Dinosaurs.mIMadeItUp = mIMadeItUp;
    }

    public static boolean ismIsAPowerRangerBot() {
        return mIsAPowerRangerBot;
    }

    public static void setmIsAPowerRangerBot(boolean mIsAPowerRangerBot) {
        Dinosaurs.mIsAPowerRangerBot = mIsAPowerRangerBot;
    }
}
