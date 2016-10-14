package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Primate extends Mammal {
    private boolean mIsBipedal;
    private String mRelativeIntelligence;

    public Primate(String name, float topSpeed, boolean isEndangered, int daysOfGestation,  boolean isBipedal, String relativeIntelligence) {
        super(name, 2, topSpeed, isEndangered, daysOfGestation, false);
        mIsBipedal=isBipedal;
        mRelativeIntelligence=relativeIntelligence;
    }

    public boolean isBipedal() {
        return mIsBipedal;
    }

    public void setmIsBipedal(boolean isBipedal) {
        mIsBipedal = isBipedal;
    }

    public String getRelativeIntelligence() {
        return mRelativeIntelligence;
    }

    public void setmRelativeIntelligence(String relativeIntelligence) {
        mRelativeIntelligence = relativeIntelligence;
    }
    @Override
    public void printAll(){
        super.printAll();
        String biPed;
        if(mIsBipedal){
            biPed=" is bipedal";
        }else{
            biPed=" not bipedal";
        }
        System.out.println(getName()+biPed+
        "\n"+getName()+" is "+ mRelativeIntelligence);

    }

}
