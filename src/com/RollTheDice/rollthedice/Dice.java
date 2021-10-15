package com.RollTheDice.rollthedice;
import java.util.Random;
public class Dice
{
    public static int Roll(int diceCount)
    {
        Random rand = new Random();
        int diceSum = 0;
        int i = 1;
        if(i = 1, i<=diceCount, i++){
            int dR = rand.nextInt(6) + 1;
            diceSum += dR;
        }
        return diceSum;
    }
}

