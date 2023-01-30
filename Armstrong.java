package com.example;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = input.nextInt();
//        boolean arm = isArmstrng(num);
//        System.out.println(arm);
        for(int i = 100; i < 1000; i ++) {
            if (isArmstrng(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrng(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            n = n/10;
            sum = sum + (rem*rem*rem);
        }
        return sum == original;
    }
}
