package com.Martina.demo;

import java.util.Scanner;

public class Play {
    Scanner sc = new Scanner(System.in);
    Dices Dice = new Dices(0);  //instantiate object of class Dices


    public void welcome() {

        Dice.DiceGame.welcomMessage();
        Dice.DiceGame.howManyPlayers();
        Dice.DiceGame.roundsToPlay();
        Dice.DiceGame.GetUserChoiceDiceRolls3();

    }

    public void playTheGameMethod() {
        int leftPlayers = Dice.DiceGame.players;
        do {
            playtest();
            System.out.println("\n");
            leftPlayers = leftPlayers - 1;
        } while (leftPlayers > 0);
        System.out.println("\nTack för spelet! Hej Då!");
    }

    public void playtest() {
        int leftRounds = Dice.DiceGame.rounds;
        Dice.DiceGame.getName2();

        do {
            Dice.rollDice();
            System.out.println(" ");
            leftRounds = leftRounds - 1;
        } while (leftRounds > 0);
        AList m = new AList(Dice.DiceGame.playerName, Dice.sumOfDiceRolls);  //creates object oj class AList
        Dice.DiceGame.player.add(m);   //add player/points to list
        Dice.DiceGame.displayAllPlayers();  //shows all players
        Dice.sumOfDiceRolls = 0; //set to 0
        sameResultWithAction(); //check dublicates
        Dice.DiceGame.highestResult(); //shows highest result
    }

    public void sameResultWithAction() {
        for (int i = 0; i < Dice.DiceGame.player.size(); i++) { //iterate through list ones
            for (int j = 0; j < Dice.DiceGame.player.size(); j++) { //iterate through list twice
                while (Dice.DiceGame.player.get(i).getSumOfDiceRolls() == Dice.DiceGame.player.get(j).getSumOfDiceRolls() && i != j){
                    System.out.println("***\033[3mDUBLETT\033[0m***");// duplicate element found
                    System.out.println("Spelare " + Dice.DiceGame.player.get(i).getPlayerName().toUpperCase() + " med " + Dice.DiceGame.player.get(i).getSumOfDiceRolls() + " poäng " +
                            " \n& " +
                            " \nSpelare " + Dice.DiceGame.player.get(j).getPlayerName().toUpperCase() + " med " + Dice.DiceGame.player.get(j).getSumOfDiceRolls() + " poäng ");
                    System.out.println("får köra igen!");
                    System.out.println("Spelare " + Dice.DiceGame.player.get(i).getPlayerName().toUpperCase() + " börjar.");
                    Dice.sumOfDiceRolls = 0;
                    Dice.rollDice();
                    int newPoints = Dice.sumOfDiceRolls + Dice.DiceGame.player.get(i).getSumOfDiceRolls();
                    Dice.DiceGame.player.get(i).setSumOfDiceRolls(newPoints);
                    Dice.sumOfDiceRolls = 0;
                    System.out.println("*************************************");
                    System.out.println("Nästa spelare är " + Dice.DiceGame.player.get(j).getPlayerName().toUpperCase());
                    Dice.rollDice();
                    int newPoints2 = Dice.sumOfDiceRolls + Dice.DiceGame.player.get(j).getSumOfDiceRolls();
                    Dice.DiceGame.player.get(j).setSumOfDiceRolls(newPoints2);
                    Dice.sumOfDiceRolls = 0;
                    Dice.DiceGame.displayAllPlayers();  //shows all players
                }
            }
        }
    }


    }

