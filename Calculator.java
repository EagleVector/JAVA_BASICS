package com.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Enter the operation: ");

            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '/' || op == '*' || op == '%') {
                System.out.print("Enter 1st number : ");
                float num_1 = input.nextFloat();

                System.out.print("Enter 2nd number: ");
                float num_2 = input.nextFloat();
                float ans = 0;

                if (op == '+') {
                    ans = num_1 + num_2;
                }
                if (op == '-') {
                    ans = num_1 - num_2;
                }
                if (op == '*') {
                    ans = num_1 * num_2;
                }
                if (op == '/') {
                    if (num_2 != 0) {
                        ans = num_1 / num_2;
                    }
                }
                if (op == '%') {
                    ans = num_1 % num_2;
                }
                System.out.println("Result: " + ans);
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation!");
            }
        }


    }
}
