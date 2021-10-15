package com.RollTheDice.rollthedice;

public class Bankroll {
    private int balance;

    public Bankroll(int initialBalance) {
        balance = initialBalance;
    }
    public int getBalance() {
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

