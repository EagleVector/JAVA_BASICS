package com.example;

import java.util.Scanner;

public class Typecast {
    public static void main(String[] args) {

        int a = 10;
        byte b = 45;
        short s = 345;
        float f = 234.8765f;
        double d = 0.9887653;
        long l = 12345678L;
        char c = 'e';

        System.out.println((a * c) + " " + (l * d) + " " + (f / c) + " " + " " + (s + b) + " " + (f / d));

        int tc = (int)(56.9876f);
        System.out.println(tc);

//        System.out.println("Enter temperature in Celcius: ");
//        Scanner input = new Scanner(System.in);
//        float tempC = input.nextFloat();
//        float tempF = (tempC * 9/5) + 32;
//
//        System.out.println("Temperature in Farahenheit: " + tempF);
    }
}