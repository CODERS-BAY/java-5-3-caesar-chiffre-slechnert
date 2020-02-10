package com.coders.bay;

import java.util.Scanner;

public class caesar {
    public static void main(String[] args) {

        char buchstabe;
        int alphabetStartLowerCase = 'a';
        int alphabetStartUpperCase = 'A';
        int verschiebung;

        Scanner sc = new Scanner(System.in);
        System.out.println("Buchstabe zur Chiffrierung eineben");
        buchstabe = sc.next().charAt(0);

        System.out.println("Wieviele Stellen soll verschoben werden?");
        verschiebung = sc.nextInt();

        if (Character.isLowerCase(buchstabe)) {
            buchstabe -= alphabetStartLowerCase;
            buchstabe += verschiebung;
            buchstabe %= 26;
            buchstabe += alphabetStartLowerCase;
        } else {
            buchstabe -= alphabetStartUpperCase;
            buchstabe += verschiebung;
            buchstabe %= 26;
            buchstabe += alphabetStartUpperCase;

        }


        System.out.println(buchstabe);
    }
}
