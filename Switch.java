package com.example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter a Fruit: ");
        String fruit = input.next();

//        if (fruit.equals("mango")) {
//            System.out.println("King of all fruit");
//        }
//
//        if (fruit.equals("apple")) {
//            System.out.println("A sweet Red Fruit");
//        }
//
//        if (fruit.equals("orange")) {
//            System.out.println("Round Fruit");
//        }
//        if (fruit.equals("grape")) {
//            System.out.println("Small fruit");
//        }
        switch (fruit) {
            case "mango":
                System.out.println("King of all fruits");
                break;
            case "apple":
                System.out.println("A sweet Red fruit");
                break;
            case "orange":
                System.out.println("Round Fruit");
                break;
            case "grape":
                System.out.println("Small Fruit");
                break;
            case "pear":
                System.out.println("Beauty Fruit");
                break;
            default:
                System.out.println("Random fruit");
        }
    }
}
