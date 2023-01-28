package com.example;

import java.util.Scanner;

public class Revnum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int rev = 0;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            rev = (rev*10) + rem;
        }
        System.out.println(rev);
    }
}
