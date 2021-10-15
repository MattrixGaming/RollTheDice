package com.RollTheDice.rollthedice;

public class Player {


    public static void main(String[] args) {
    Bankroll b1 = new Bankroll(1000);

    }
    public Player(int startingBalance)
    {
        this.playerBalance = new Bankroll(startingBalance);
    }
}
//
//    public static int Balance(int b) {
//        b = 1000;
//        return b;
//    }
    public int playerBalance(int balance){
        Bankroll b1 = new Bankroll(1000);
        balance = b1.getBalance(balance);

        return balance;
    }
}
