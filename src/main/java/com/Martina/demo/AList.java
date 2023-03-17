package com.Martina.demo;

public class AList {
    String playerName;
    int sumOfDiceRolls;
    public AList(String playerName, int sumOfDiceRolls) {    // create a constructor
        this.playerName = playerName;
        this.sumOfDiceRolls = sumOfDiceRolls;
    } // create a constructor

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public int getSumOfDiceRolls() {
        return sumOfDiceRolls;
    }
    public void setSumOfDiceRolls(int sumOfDiceRolls) {
        this.sumOfDiceRolls = sumOfDiceRolls;
    }

    @Override
    public String toString() {
        return "" +
                "Namn= " + playerName +
                ", Resultat= " + sumOfDiceRolls
                ;
    }



}
