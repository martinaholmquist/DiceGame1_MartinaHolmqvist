package com.Martina.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tests {
    Play playTheGame = new Play();


    @org.junit.Test
    public void numberTest1(){
        int UserChoiceDiceRolls = playTheGame.Dice.DiceGame.intDices;
        int high = 6;
        int low = 0;
        assertTrue("Error, UserChoiceDiceRolls is too high", high >= playTheGame.Dice.DiceGame.intDices);
        assertTrue("Error, UserChoiceDiceRolls is too low",  low  <= playTheGame.Dice.DiceGame.intDices);
    }

    @org.junit.Test
    public void numberTest2(){
        int rounds = playTheGame.Dice.DiceGame.rounds;
        int high = 6;
        int low = 0;
        assertTrue("Error, rounds is too high", high >= playTheGame.Dice.DiceGame.rounds);
        assertTrue("Error, rounds is too low",  low  <= playTheGame.Dice.DiceGame.rounds);
    }

    @org.junit.Test
    public void numberTest3(){
        int players = playTheGame.Dice.DiceGame.players;
        int high = 100;
        int low = 0;
        assertTrue("Error, players is too high", high >= playTheGame.Dice.DiceGame.players);
        assertTrue("Error, players is too low",  low  <= playTheGame.Dice.DiceGame.players);
    }


    @Test
    public void test() {
        //2+2=4
        int addition = 4;
        int division = 1;
        int subtractio = 0;
        int multiplication = 4;

        assertEquals(4, addition);
        assertEquals(1, division);
        assertEquals(0, subtractio);
        assertEquals(4, multiplication);

        int x = 2;
        int y = 2;


        for (int i = 0; i < 9; i++) {
            int resultOfRandom1 = (int) (Math.random() * 4) + 1; // Throws a dice with max 4 and min 1
            int resultOfRandom2 = (int) (Math.random() * 4) + 1; // Throws a dice with max 4 and min 1
            addition(resultOfRandom1,resultOfRandom2);
            subtraction(resultOfRandom1,resultOfRandom2);
            division(resultOfRandom1,resultOfRandom2);
            multiplication(resultOfRandom1,resultOfRandom2);
            assertEquals(addition(resultOfRandom1,resultOfRandom2), addition(resultOfRandom1,resultOfRandom2));
            assertEquals(subtraction(resultOfRandom1,resultOfRandom2),subtraction(resultOfRandom1,resultOfRandom2));
            assertEquals(division(resultOfRandom1,resultOfRandom2),division(resultOfRandom1,resultOfRandom2));
            assertEquals(multiplication(resultOfRandom1,resultOfRandom2),multiplication(resultOfRandom1,resultOfRandom2));
        }


    }

        public int addition(int x, int y) {
            return x + y;
        }

        public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    public static int multiplication(int x, int y) {
        return x * y;

    }





}
