package com.RollTheDice.rollthedice;
import java.util.*;
public class Dice
{
    //Init Dice Sum Var
    private static int diceSum;
    //Gets Dice Sum
    public static int getDiceSum() {
        return diceSum;
    }
    //Rolls Dice
    public static void diceRoll() {
        Random rand = new Random();
        int dR1 = (rand.nextInt(6) + 1);
        int dR2 = (rand.nextInt(6) + 1);
        diceSum = dR1 + dR2;
    }
    //Resets Dice
    public static void resetDice() {
        diceSum = 0;
    }
}

