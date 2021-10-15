package com.RollTheDice.rollthedice;
import java.util.*;

public class Player {
    private String name;
    private int bal;

    public int getBal() {
        bal = Bankroll.getBalance();
        return bal;
    }

    public void setBal() {
        Bankroll.setBalance(2500);
    }
    public String getName() {
        return name;
    }

    public void setName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String tName = scan.nextLine();
        this.name = tName;
    }

    public static int getBet() {
        return bet;
    }

    public static void setBet(int tBet) {
        Player.bet = tBet;
    }

    private static int bet;
}
//    private static int Player(int bal) {
//        Bankroll b1 = new Bankroll();
//        bal = b1.getBalance();
//
//    }
//    public int playerBalance(int balance){
//        balance = Bankroll.getBalance(balance);
//
//        return balance;
//    }

