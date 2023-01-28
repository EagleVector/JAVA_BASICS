package com.example;

import java.util.Scanner;

public class Freqcount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        System.out.print("Enter the frequent digit: ");
        int digit = input.nextInt();

        int count = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem == digit) {
                count ++;
            }
            num = num / 10;
        }

        System.out.println(count);
    }
}
