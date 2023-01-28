package com.example;

import java.util.Scanner;

public class Nestif {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much savings you got?");
        int sav = input.nextInt();
        if (sav < 100000) {
            System.out.println("Buy a pulsar motorcycle");
        } else if (sav < 1000000) {
            System.out.println("Buy a honda city");

        } else {
            System.out.println("Buy a jet");
        }
    }
}
