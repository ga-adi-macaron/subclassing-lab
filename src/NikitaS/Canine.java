package NikitaS;

/**
 * Created by NikitaShuvalov on 10/13/16.
 */
public class Canine extends Mammal{
    private String mSize;
    private boolean mDomesticated;

    public Canine(String name, float topSpeed, boolean isEndangered, int daysOfGestation, boolean hasFur, String size, boolean domesticated) {
        super(name, 4, topSpeed, isEndangered, daysOfGestation, hasFur);
        mSize = size;
        mDomesticated = domesticated;
    }

    public String getSize() {
        return mSize;
    }

    public void setSize(String size) {
        mSize = size;
    }

    public boolean isDomesticated() {
        return mDomesticated;
    }

    public void setDomesticated(boolean domesticated) {
        mDomesticated = domesticated;
    }
    @Override
    public void printAll(){
        super.printAll();
        String dom;
        if(mDomesticated){
            dom = " is domesticated.";
        }else{
            dom = " is wild.";
        }
        System.out.println(getName()+" is of size "+mSize);
        System.out.println(getName()+ dom);
    }
}
