package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Mammal extends Animal{
    private int mDaysOfGestation;
    private boolean mHasFur;//As opposed to hair.

    public Mammal(String name, int numLegs, float topSpeed, boolean isEndangered, int daysOfGestation, boolean hasFur) {
        super(name, numLegs, topSpeed, isEndangered);
        mDaysOfGestation=daysOfGestation;
        mHasFur=hasFur;
    }

    public int getmDaysOfGestation() {
        return mDaysOfGestation;
    }

    public void setmDaysOfGestation(int daysOfGestation) {
        mDaysOfGestation = daysOfGestation;
    }

    public boolean ismHasFur() {
        return mHasFur;
    }

    public void setmHasFur(boolean hasFur) {
        mHasFur = hasFur;
    }

    @Override
    public void printAll(){
        super.printAll();
        String hairType;
        if (mHasFur){
            hairType="fur";
        }else{
            hairType="hair";
        }
        System.out.println("Gestation period is "+ mDaysOfGestation+" days\n"+
        getName()+" has "+ hairType);
    }
}
