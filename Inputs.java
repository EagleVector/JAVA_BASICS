package com.example;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a valid integer: ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is: " + rollno);

        System.out.print("Please Enter a valid GPA: ");

        float gpa = input.nextFloat();
        System.out.println("Your GPA is: " + gpa);

        System.out.print("Please Enter a valid result status: ");

        boolean result= input.nextBoolean();
        System.out.println("Your result status is: " + result);
    }
}
