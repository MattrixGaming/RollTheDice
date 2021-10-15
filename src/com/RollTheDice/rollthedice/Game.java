package com.RollTheDice.rollthedice;

import java.util.*;

public class Game
{
    private boolean isRunning = false;
    public void Run()
    {
        Player p1 = new Player();
        p1.setBal();
        p1.setName();
        System.out.println("Welcome " + p1.getName() + "!" + "You've been given a free $" + p1.getBal() + "!");
        //System.out.println(b1.());
        isRunning = true;
        while (isRunning)
        {
            HandleBetting();
            HandleDiceRoll();
            Dice.resetDice();
            if (Bankroll.getBalance() <= 0){
                Game.Stop();
            }
            System.out.println("Balance: " + Bankroll.getBalance());
        }
    }
    private static void HandleBetting(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a bet between 0-" + Bankroll.getBalance());
        Player.setBet(scan.nextInt());
//        if (bet <= Bankroll.getBalance());
    }
    private static int HandleDiceRoll(){
        Dice dSum = new Dice();
        dSum.diceRoll();
        int sum = dSum.getDiceSum();
        int multi = 0;
        if(sum == 7){
            System.out.println("You won! (+$" + (Player.getBet() * 2) + ")");
            HandlePayout(2);
            }else if(sum == 11){
                System.out.println("You broke even.(+$0)");
                HandlePayout(1);
            }else if(sum == 2){
                Game.Stop();
            }else{
                System.out.println("You lost! (-$500)");
                Bankroll.removeBalance(Player.getBet());
            }
        return multi;
    }
    private static void HandlePayout(int reward){
        reward = HandleDiceRoll() * Player.getBet();
        Bankroll.addBalance(reward);

    }
    public static void Stop(){

            System.out.println("You lost!");
            System.exit(0);
    }
}