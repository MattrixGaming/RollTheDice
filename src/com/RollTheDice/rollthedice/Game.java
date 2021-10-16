package com.RollTheDice.rollthedice;

import java.util.*;

public class Game
{
    //Init Is Running Boolean
    private static boolean isRunning;

    //Runs New Game
    public void Run()
    {
        Player p1 = new Player();
        p1.setBal();
        p1.setName();
        System.out.println("Welcome " + p1.getName() + "!" + "You've been given a free $" + p1.getBal() + "!");
        isRunning = true;
        while (isRunning)
        {
            HandleBetting();
            HandlePayout(HandleDiceRoll());
            Dice.resetDice();
            if (Bankroll.getBalance() <= 0){
                Game.Stop();
            }
            System.out.println("Balance: " + Bankroll.getBalance());
        }
    }

    //Sets Bet Amount
    private static void HandleBetting(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a bet between $0-" + Bankroll.getBalance());
        Player.setBet(scan.nextInt());
    }

    //Handles Dice Roll
    private static int HandleDiceRoll(){
        Dice.diceRoll();
        int sum = Dice.getDiceSum();
        int multi = 0;
        if(sum == 7){
            System.out.println("You won! (+$" + (Player.getBet() * 2) + ")");
            HandlePayout(2);
            }else if(sum == 11){
                System.out.println("You broke even. (+$0)");
                HandlePayout(1);
            }else if(sum == 2){
                Game.Stop();
            }else{
                System.out.println("You lost! (-$500)");
                Bankroll.removeBalance(Player.getBet());
            }
        return multi;
    }

    //Adds Reward
    private static void HandlePayout(int reward){
        reward *= Player.getBet();
        Bankroll.addBalance(reward);

    }

    //Stops Game
    public static void Stop(){
            isRunning = false;
            System.out.println("You lost!");
            System.exit(0);
    }
}