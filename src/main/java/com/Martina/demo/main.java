package com.Martina.demo;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class main {

    public static void main(String[] args) {

        Play playTheGame = new Play();
        playTheGame.welcome();
        playTheGame.playTheGameMethod();


        Result result = JUnitCore.runClasses(Tests.class);
        for (Failure failure : result.getFailures()){
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful())
            System.out.println("JUnit result is " + result.wasSuccessful());
        else {
            System.out.println("JUnit result is "+ result.wasSuccessful());
        }
    }
}

