package com.RollTheDice.rollthedice;

import java.util.Scanner;

public class Game
{
    private boolean isRunning = false;
    public void Run()
    {
        Player p1 = new Player();
        p1.
        isRunning = true;
        while (isRunning)
        {
            HandleBetting(bet);
            HandleDiceRoll();
            HandlePayout();
        }
    }
    private void HandleBetting(int bal){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a bet between 0-" + bal);
        bet
    }
    private void HandleDiceRoll(){...}
    private void HandlePayout(){...}
}