package com.pluralsight;

public class Dice {
    private int roll;

    public Dice() {
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void roll(){
        this.roll = (int)(Math.random()*6)+1;
    }


}
