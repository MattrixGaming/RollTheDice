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
        int dR1 = (rand.nextInt(6) + 1);
        int dR2 = (rand.nextInt(6) + 1);
        return diceSum = dR1 + dR2;
    }
    public static int resetDice() {
        return diceSum = 0;
    }
}

