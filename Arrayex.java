package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Arrayex {
    public static void main(String[] args) {

        String[] arr = new String[5];
//        int[] arr1 = new int[]{34, 65, 12, 6, 9};
//
//        System.out.println(arr[3]);
//        System.out.println(arr1[2]);
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.next();
        }
//
//        for (int j : arr) {
//            System.out.print(j + " ");
        System.out.println(Arrays.toString(arr));
        arr[2] = "Cherry!";

        System.out.println(Arrays.toString(arr));
    }
}