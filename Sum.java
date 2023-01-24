package com.example;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        int num_1 = input.nextInt();

        System.out.println("Enter 2nd number: ");
        int num_2 = input.nextInt();

        int sum = num_1 + num_2;
        System.out.println("The sum of two numbers is: " + sum);
    }
}
