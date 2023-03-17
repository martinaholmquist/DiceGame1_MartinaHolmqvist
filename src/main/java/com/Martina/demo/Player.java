package com.Martina.demo;

import java.util.Scanner;
import java.util.*;

public class Player {
    String ANSI_YELLOW = "\033[33;1m";
    String ANSI_BLUE = "\033[34;1m";
    String ANSI_RESET = "\033[0m";
    Scanner sc = new Scanner(System.in);
    ArrayList<AList> player = new ArrayList<>();  //instantiate object of arrayList player
    int intDices;
    int rounds;
    String playerName;
    int players;
    public Player(int intDices, int rounds, String playerName, int players) {  // create a constructor
        this.intDices = intDices;
        this.rounds = rounds;
        this.playerName = playerName;
        this.players = players;

    } // create a constructor

    public void welcomMessage() {
        System.out.println(ANSI_BLUE + "  _^__                                                    __^__");
        System.out.println("( ___ )--------------------------------------------------------------( ___ )");
        System.out.println(" | / |             Välkommen till spelet Dice Game!                  | \\ |");
        System.out.println(" | / |                                                               | \\ |");
        System.out.println(" | / |             Allt börjar med att spelare väljer                | \\ |");
        System.out.println(" | / |             antar spelare som ska spela spelet,               | \\ |");
        System.out.println(" | / |             antal omgångar samt                               | \\ |");
        System.out.println(" | / |             antal tärningar som ska kastas.                   | \\ |");
        System.out.println(" | / |             Spelet spelas och resultat visas.                 | \\ |");
        System.out.println(ANSI_YELLOW +" | / |             Om en spelare lyckas få ihop ett antal poäng      | \\ |");
        System.out.println(" | / |             som en annan spelare har                          | \\ |");
        System.out.println(" | / |             så får spelarna en ny omgång kasst.               | \\ |"+ ANSI_RESET);
        System.out.println(ANSI_BLUE +" | / |             Spelaren med högst resultat vinner!               | \\ |");
        System.out.println(" | / |                                                               | \\ |");
        System.out.println(" |___|                         Lycka till!                           |___|");
        System.out.println("(_____)-------------------------------------------------------------(_____)"+ ANSI_RESET);
        System.out.println();
    }
    public void roundsToPlay() {
        boolean correctChoice = true;

        while (correctChoice) {
            System.out.println("\nHur många omgångar önskar ni spela? " +
                    "Ange ett tal mellan 1-5 tack");
            if (sc.hasNextInt()) {
                rounds = sc.nextInt();
                if (rounds > 0 && rounds < 6) {
                    break;
                } else {
                    System.out.println("\nVänligen följ instruktionerna!");
                }
            } else {
                System.out.println("\nFölj instruktionerna, tack!");
                sc.next();
            }

        }
    }   //collect player choice of rounds to play
    public void howManyPlayers() {
        boolean correctChoice = true;

        while (correctChoice) {
            System.out.println("\nHur många spelare vill spela? ");
            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (players > 0 && players < 100) {
                    break;
                } else {
                    System.out.println("\nVänligen följ instruktionerna!");
                }
            } else {
                System.out.println("\nFölj instruktionerna, tack!");
                sc.next();
            }

        }
    }   //collect how many players
    public void GetUserChoiceDiceRolls3() {
        boolean correctChoice = true;

        while (correctChoice) {
            System.out.println("\nHur många tärningar önskar ni spela med? " +
                    "Ange ett tal mellan 1-5 tack");
            if (sc.hasNextInt()) {
                intDices = sc.nextInt();
                if (intDices > 0 && intDices < 6) {
                    break;
                } else {
                    System.out.println("\nVänligen följ instruktionerna!");
                }
            } else {
                System.out.println("\nFölj instruktionerna, tack!");
                sc.next();
            }
        }
    }  //collect player choice of dices
    public void displayAllPlayers() {
        System.out.println("TABELL");
        for (int i = 0; i < player.size(); i++) {
            System.out.println(player.get(i));
        }
    }  //show all players from arraylist
    public void getName2() {

        boolean name = true;
        while (name) {

            System.out.println("\nVänligen ange ditt namn, tack. ");
            playerName = sc.next();
            try {
                if (!playerName.matches("^[a-öA-Ö]+$")) {
                    throw new Exception("\nFölj instruktionerna, tack!");
                } else {
                    System.out.println("HEJ " + playerName.toUpperCase() + "\nNU KÖR VI!!\n");
                    break;
                }
            } catch (Exception e) {

            }
        }
    }//collect player name
    public void highestResult() {
        int higest = 0;
        String higestName = "";

        for (int i = 0; i < player.size(); i++) {
            if (player.get(i).getSumOfDiceRolls() > higest) {
                higest = player.get(i).getSumOfDiceRolls();
                higestName = player.get(i).getPlayerName();
            }
        }
        System.out.println("");
        System.out.println(ANSI_YELLOW + "  .:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:." + ANSI_RESET);
        System.out.println("Grattis!!!!" + " Spelare " + higestName.toUpperCase() + " har högst resultat: " + higest);
        System.out.println(ANSI_YELLOW + "  .:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:._.:*~*:." + ANSI_RESET);
        System.out.println("");
    }  //collect highest player points



}





