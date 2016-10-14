package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Avian extends Reptile {
    private boolean mCanFly;
    private boolean mIsWaterFowl;

    public Avian(String name, float topSpeed, boolean isEndangered, boolean canFly, boolean isWaterFowl) {
        super(name, 2, topSpeed, isEndangered, false, false);
        mCanFly = canFly;
        mIsWaterFowl = isWaterFowl;
    }

    public boolean canFly() {
        return mCanFly;
    }

    public void setCanFly(boolean canFly) {
        mCanFly = canFly;
    }

    public boolean isWaterFowl() {
        return mIsWaterFowl;
    }

    public void setWaterFowl(boolean waterFowl) {
        mIsWaterFowl = waterFowl;
    }
    @Override
    public void printAll(){
        super.printAll();
        String fly;
        String waterFowl;
        if(mCanFly){
            fly =getName()+" can fly.";
        }else{
            fly = getName()+ " is a flightless bird.";
        }
        if (mIsWaterFowl){
            waterFowl = getName()+ " is waterfowl.";
        }else{
            waterFowl=getName()+ " is not waterfowl.";
        }
        System.out.println(fly);
        System.out.println(waterFowl);
    }
}
