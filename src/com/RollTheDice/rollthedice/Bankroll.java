package com.RollTheDice.rollthedice;

public class Bankroll {
    public static void setBalance(int balance) {
        Bankroll.balance = balance;
    }

    public static int getBalance() {
        return balance;
    }

    private static int balance;

    public static void addBalance(int reward) {
        //reward = ;
        balance += reward;
    }


//    public static int startBal(int sB) {
//        balance = sB;
//        return balance;
//    }
//    public int getBalance() {
//        return balance;            // returns value of instance var
//    }
//    public void addBal(int reward) {
//    int newBalance = balance + reward;
//    balance = newBalance;
//    }
//    public void bust(int reward){
//        int newBalance = reward;
//        balance = newBalance;
//    }
}

