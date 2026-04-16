package com.pluralsight;

public class DiceApp {
    public static void main(String[] args) {

        Dice dice = new Dice();

        int roll1;
        int roll2;

        int count2 = 0;
        int count4 = 0;
        int count6 = 0;
        int count7 = 0;

        for (int i = 1; i <= 100 ; i++ ){
           dice.roll();
           roll1 = dice.getRoll();
            dice.roll();
           roll2 = dice.getRoll();
           int sum = roll1 + roll2;

            System.out.println("Roll " + i +": "+ roll1 + " - " +
                     roll2 + " Sum: " + sum);

            if ( sum ==2){
                count2++;
            }if (sum ==4){
                count4++;
            }if (sum ==6){
                count6++;
            }if (sum ==7){
                count7++;
            }

        }

        System.out.println("---Your Counters---");
        System.out.println("Number of 2s rolled:" + count2);
        System.out.println("Number of 4s rolled:" + count4);
        System.out.println("Number of 6s rolled:" + count6);
        System.out.println("Number of 7s rolled:" + count7);




    }


}
