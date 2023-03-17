package com.Martina.demo;
import java.util.Scanner;

public class ScanClass {

    //private static ScanClass sc = new ScanClass();  ///detta är objectet kanske ska ligga i Dices??
    // så här använder man den sen int choice = sc.ScanInt(); exempelvis  se HotellJava

    static Scanner sc = new Scanner(System.in);


    public void nextLine() {
        sc.nextLine();
    }

    public void hasNextInt() {
        sc.hasNextInt();
    }

    public int ScanInt(){
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public long ScanLong() {
        Long l = sc.nextLong();
        sc.nextLine();
        return l;
    }

    public String ScanLine(){
        String s = sc.nextLine();
        return s;
    }

    public Scanner getSC() {
        return sc;
    }

}
