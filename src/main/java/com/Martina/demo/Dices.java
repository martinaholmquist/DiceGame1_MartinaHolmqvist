package com.Martina.demo;

import java.util.Scanner;


public class Dices {
    Scanner sc = new Scanner(System.in);
    Player DiceGame = new Player(0, 0, "", 0);  //instantiate object of class Player
    int sumOfDiceRolls = 0;

    public Dices(int sumOfDiceRolls) {  // create a constructor
        this.sumOfDiceRolls = sumOfDiceRolls;
    }  // create a constructor
    public void rollDice() {
        int sum = 0;

        for (int i = 0; i < DiceGame.intDices; i++) {
            int resultOfDie = (int) (Math.random() * 6) + 1; // Throws a dice with max 6 and min 1
            System.out.println("Ditt slag ger: " + resultOfDie);

            sum = sum + resultOfDie; //add all dice result per how many dices
            sumOfDiceRolls = sumOfDiceRolls + resultOfDie; //add all dice result totally
        }
        System.out.println("Denna omgång ger en summa på: " + sum);

    }  //returns roll of dices
}
