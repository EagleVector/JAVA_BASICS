package com.example;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        System.out.print("Enter the range: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int i = 2;
//        while(i < n) {
//            int sum = a + b;
//            a = b;
//            b = sum;
//            System.out.println(sum);
//            i = i + 1;
        int a = 0;
        int b = 1;
        int i = 2;
        while(i < n) {
            int temp = b;
            b = a + b;
            a = temp;
            i = i + 1;
        }
        System.out.println(b);

    }
}
