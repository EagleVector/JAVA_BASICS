package com.example;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {

//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter your name: ");
//        String naam = input.next();
//
//        String personalized = Mygreet(naam);
//        System.out.println(personalized);
        int num1 = 80;
        int num2 = 50;

        swap(num1,num2);
        System.out.println(num1 + " " + num2);
    }

//    private static String Mygreet(String name) {
//        String message = "Hello " + name;
//        return message;
//    }

//    static void sum() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 1st number: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter 2nd number: ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        System.out.print("Sum of both the numbers is: " + sum);

//    static void greeting() {
//        System.out.println("Hello World!");

    //    static int sum() {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter 1st number: ");
//        int num1 = input.nextInt();
//
//        System.out.print("Enter 2nd number: ");
//        int num2 = input.nextInt();
//
//        int sum = num1 + num2;
//        return sum;
//
//    static String greet() {
//        String message = "Hello Cherry!";
//        return message;
//    }

//    static int add(int a, int b) {
//        int sum = a + b;
//        return  sum;
//  Swap Two Numbers:
//    int a = 10;
//    int b = 20;
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}