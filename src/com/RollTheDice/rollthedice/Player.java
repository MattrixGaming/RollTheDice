package com.RollTheDice.rollthedice;
import java.util.*;

public class Player {
    //Init Name, Bal, and Bet Vars
    private String name;
    private int bal;
    private static int bet;

    //Gets Balance
    public int getBal() {
        bal = Bankroll.getBalance();
        return bal;
    }

    //Sets Starting Balance
    public void setBal() {
        Bankroll.setBalance(2500);
    }

    //Gets Name
    public String getName() {
        return name;
    }

    //Sets Name
    public void setName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String tName = scan.nextLine();
        this.name = tName;
    }

    //Gets Bet
    public static int getBet() {
        return bet;
    }

    //Sets Bet
    public static void setBet(int tBet) {
        Player.bet = tBet;
    }

}
