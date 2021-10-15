package com.RollTheDice.rollthedice;

import java.util.Scanner;

public class Game
{
    private boolean isRunning = false;
    public void Run()
    {
        Player p1 = new Player();
        //System.out.println(b1.());
        isRunning = true;
        while (isRunning)
        {
            HandleBetting();
            HandleDiceRoll();
            HandlePayout();
        }
    }
    private static void HandleBetting(int bal){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a bet between 0-" + bal);
        int bet = (int)scan.nextInt();
        if (bet <= Bankroll.balance);
    }
    private void HandleDiceRoll(){...}
    private void HandlePayout(){...}
}