package com.elysium;

/**
 * Created by jay on 10/14/16.
 */
public class Mammal extends Animall {


    public Mammal(int numLegs, int topSpeed, boolean isEndangered, String name, boolean liveBirth, boolean multipleYoung) {

    }

    public class Mammal extends Animall {

        private boolean liveBirth;
        private boolean multipleYoung;

        public com.elysium.Mammal(int numLegs, int topSpeed, boolean isEndangered, boolean liveBirth, String name, boolean multipleYoung) {

        }

        {

            super(numLegs, topSpeed, isEndangered, name);

            mLiveBirth = liveBirth;
            mMultipleYoung = multipleYoung;
        }

        public void setLiveBirth(boolean liveBirth) {
            mLiveBirth = liveBirth;
        }

        public void setMultipleYoung(boolean multipleYoung) {
            mMultipleYoung = multipleYoung;
        }
    }

}
