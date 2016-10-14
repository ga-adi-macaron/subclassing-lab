import java.io.Serializable;

public class Animal{

    private int mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int topSpeed, boolean isEndangered, String name){
        this.mTopSpeed = topSpeed;
        this.mIsEndangered = isEndangered;
        this.mName = name;
    }

    public int getTopSpeed() {
        return mTopSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.mTopSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setIsEndangered(boolean isEndangered) {
        this.mIsEndangered = isEndangered;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }
}