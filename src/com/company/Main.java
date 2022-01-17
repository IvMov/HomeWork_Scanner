package com.company;

import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Įveskite savo vardo:");
        String vardas = myScanner.next();
        System.out.println("Kiek tau metų?");
        byte amzius = myScanner.nextByte();
        System.out.println("Labas: " + vardas + "! Tau " + amzius + " metų");

    }
}
