package com.RollTheDice.rollthedice;
import java.util.*;
public class Dice
{
    public static int getDiceSum() {
        return diceSum;
    }

    private static int diceSum;
    public static int diceRoll()
    {
        Random rand = new Random();
        int dR = (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);
        return diceSum = dR;
    }
    public static int resetDice() {
        return diceSum = 0;
    }
}

