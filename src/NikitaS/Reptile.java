package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Reptile extends Animal{
    private boolean mCanRegenerate;
    private boolean mIsPoisonous;

    public Reptile(String name, int numLegs, float topSpeed, boolean isEndangered, boolean canRegenerate, boolean isPoisonous) {
        super(name, numLegs, topSpeed, isEndangered);
        mCanRegenerate=canRegenerate;
        mIsPoisonous = isPoisonous;
    }

    public boolean canRegenerate() {
        return mCanRegenerate;
    }

    public  void setmCanRegenerate(boolean canRegenerate) {
        mCanRegenerate = canRegenerate;
    }

    public boolean isPoisonous() {
        return mIsPoisonous;
    }

    public void setmIsPoisonous(boolean isPoisonous) {
        mIsPoisonous = isPoisonous;
    }
    @Override
    public void printAll(){
        super.printAll();
        String regen;
        String poison;
        if(mCanRegenerate){
            regen = " has the ability to regenerate.";
        }else{
            regen = " can not regenerate/regrow limbs.";
        }
        if(mIsPoisonous){
            poison = " is poisonous.";
        }else{
            poison = " is not poisonous.";
        }

        System.out.println(getName()+regen);
        System.out.println(getName()+poison);
    }
}

