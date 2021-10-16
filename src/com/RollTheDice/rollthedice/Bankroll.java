package com.RollTheDice.rollthedice;

public class Bankroll {
    //Init Balance Var
    private static int balance;

    //Sets Initial Balance
    public static void setBalance(int balance) {
        Bankroll.balance = balance;
    }

    //Removes Balance
    public static void removeBalance(int loss) {
        Bankroll.balance -= loss;
    }

    //Gets Balance
    public static int getBalance() {
        return balance;
    }

    //Adds Balance
    public static void addBalance(int reward) {
        //reward = ;
        balance += reward;
    }
}

