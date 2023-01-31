package com.example;

import java.util.Arrays;
import java.util.Scanner;

import static com.example.ChangeValue.change;

public class ArrayPassFn {
    public static void main(String[] args) {
//        int[] arr = {12, 45, 65, 87};
//        System.out.println(Arrays.toString(arr));
//        change(arr);
//        System.out.println(Arrays.toString(arr));
//        int[][] arr = new int[3][];
//        int[][] arr2D = {
//                {1,2,3},
//                {43,21},
//                {2,3,5,3,4,3,222}};
//        System.out.println(arr2D[1][1]);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows in a 2D array: ");
        int rowcount = input.nextInt();
        System.out.print("Enter the number of columns in a 2D array: ");
        int colcount = input.nextInt();
        int[][] arr = new int[rowcount][colcount];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = input.nextInt();
            }
        }

//        for (int[] ints : arr) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }


    }

//    static void change(int[] arr) {
//        arr[0] = 45;
//    }
}
