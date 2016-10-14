public class Lion extends Mammal {
    private boolean mIsAlpha;

    public Lion(boolean isAlpha){
        super(4, 50, false, "Lion");
        mIsAlpha = isAlpha;
    }

    public boolean isAlpha() {
        return mIsAlpha;
    }
}