package com.example;

import java.util.Scanner;

public class Charcasecheck {
    public static void main(String[] args) {
        System.out.print("Please enter a character: ");
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lower Case Character");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Upper Case Character");
        } else {
            System.out.println("Please Enter a valid character");
        }
    }
}