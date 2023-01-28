package com.example;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number- ");
        int num_1 = input.nextInt();

        System.out.println("Enter the second number- ");
        int num_2 = input.nextInt();

        System.out.println("Enter the third number- ");
        int num_3 = input.nextInt();

//        int max = num_1;
//        if (num_2 > max) {
//            max = num_2;
//
//        } else if (num_3 > max) {
//            max = num_3;
//        }
//        int max = 0;
//        if (num_1 > num_2) {
//            max = num_1;
//        } else {
//            max = num_2;
//        }
//
//        if (num_3 > max) {
//            max = num_3;
//        }
        System.out.println("The Largest of the three numbers is : " + Math.max(num_1, Math.max(num_3, num_2)));
    }
}
