package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Dinosaurs extends Reptile {
    private boolean mIMadeItUp;
    private boolean mIsAPowerRangerBot;

    public Dinosaurs(String name, int numLegs, float topSpeed, boolean isPoisonous, boolean isAPowerRangerBot, boolean iMadeItUp) {
        super(name, numLegs, topSpeed, true, true, isPoisonous);
        mIsAPowerRangerBot=isAPowerRangerBot;
        mIMadeItUp=iMadeItUp;
    }

    public boolean ismIMadeItUp() {
        return mIMadeItUp;
    }

    public void setmIMadeItUp(boolean iMadeItUp) {
        mIMadeItUp = iMadeItUp;
    }

    public boolean isAPowerRangerBot() {
        return mIsAPowerRangerBot;
    }

    public void setmIsAPowerRangerBot(boolean isAPowerRangerBot) {
        mIsAPowerRangerBot = isAPowerRangerBot;
    }
    @Override
    public void printAll(){
        super.printAll();
        String powerRanger;
        String imaginary;
        if(mIsAPowerRangerBot){
            powerRanger = getName()+ " was a Power Ranger Bot.";
        }else{
            powerRanger= getName()+ " did not have the honor to be Power Ranger bot.";
        }
        if(mIMadeItUp){
            imaginary= getName()+ " is a dinosaur that I just made up.";
        }else{
            imaginary= getName()+ " is an actual dinosaur that I didn't make up.";
        }
        System.out.println(powerRanger);
        System.out.println(imaginary);
    }

}
