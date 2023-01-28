package com.example;

import java.util.Scanner;

public class Nestedswitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your employee ID: ");
        int empID = input.nextInt();

        System.out.print("Enter your department name: ");
        String dept = input.next();

        switch (empID) {
            case 1:
                System.out.println("Subham Kashyap");
                switch (dept) {
                    case "DS":
                        System.out.println("Data Scientist");
                        break;
                }
                break;
            case 2:
                System.out.println("Cherry");
                switch (dept) {
                    case "SDE":
                        System.out.println("BackEnd Engineer");
                        break;
                }
                break;

        }
    }
}
