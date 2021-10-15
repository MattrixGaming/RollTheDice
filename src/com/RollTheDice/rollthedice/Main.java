package com.RollTheDice.rollthedice;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //Initialization
        Game game = new Game();
        game.Run();


    }
}
//        int balance = 1000;
//
//        betCalc(balance);
//        System.out.println(balance);
//        rollDice(rolled);
//

//    public static int betCalc(int bal){
//
//        Random rand = new Random();
//        int multi;
//        int r;
//        int betAmount = 1;
//
//        if(betAmount >0 && betAmount <= bal){
//            System.out.println("Enter Bet amount (Bank: " + bal + "): ");
//            betAmount = scan.nextInt();
//            int dice1 = rand.nextInt(6) + 1;
//            int dice2 = rand.nextInt(6) + 1;
//            int diceSum = dice1 + dice2;
//            if(diceSum == 7){
//                multi = 2;
//            }else if(diceSum == 11){
//                multi = 1;
//            }else if(diceSum == 2){
//                multi = -1000;
//            }else{
//                multi = 0;
//            }
//            r = betAmount * multi;
//            bal += r;
//            System.out.println("Remaining Balance: $" + bal);
//        }else if(betAmount <=0){
//            System.out.println("You have $" + bal);
//            System.exit(0);
//        }
//        return bal;
//    }
//    public static int rollDice(int r) {
//
//        return diceSum;
//    }
//    public static int multi(int m){
//        int multi;
//
//        return multi;
//    }

