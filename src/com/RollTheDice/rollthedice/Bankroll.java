package com.RollTheDice.rollthedice;

public class Bankroll {
    private static int balance;


    public static int startBal(int initialBalance) {
        balance = initialBalance;
        return balance;
    }
    public static int getBalance(int balance) {

        return balance;            // returns value of instance var
    }
    public void addBal(int reward) {
    int newBalance = balance + reward;
    balance = newBalance;
    }
    public void bust(int reward){
        int newBalance = reward;
        balance = newBalance;
    }
}

