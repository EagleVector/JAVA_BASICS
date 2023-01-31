package com.example;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayProblems {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int size = input.nextInt();
        System.out.println("Enter array of size 5: ");
        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        System.out.print("Enter the first index: ");
        int start = 0;

//        System.out.print("Enter the second index: ");
        int end = arr.length - 1;

//        swap(arr, start, end);
//        System.out.println(Arrays.toString(arr));
//        maxnum(arr);
        rev(arr, start, end);

    }

    static void rev(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }

//    static void maxrange(int[] arr, int start, int end) {
//        int max = 0;
//        for (int i = start; i <= end; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }

//    static void maxnum(int[] arr) {
//        int max = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//    static void swap(int[] arr, int index1, int index2) {
//        int temp = arr[index1];
//        arr[index1] = arr[index2];
//        arr[index2] = temp;
//    }
}
