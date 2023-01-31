package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListEx {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        System.out.print("Enter the no. of rows in an array: ");
        int rowcount = input.nextInt();
        System.out.print("Enter the no. of columns in an array: ");
        int colcount = input.nextInt();

        for (int row = 0; row < rowcount; row++) {
                list.add(new ArrayList<>());
            }

        for (int row = 0; row < rowcount; row++) {
            for (int col = 0; col < colcount; col++) {
                list.get(row).add(input.nextInt());
            }
        }
        System.out.println(list);

//        ArrayList<Integer> list = new ArrayList<>(5);
//
//        System.out.print("Enter the no. of elements in an array: ");
//        int elecount = input.nextInt();
//
//        for (int i = 0; i < elecount; i++) {
//            list.add(input.nextInt());
//        }
//
//        for (int i = 0; i < elecount; i++) {
//            System.out.print(list.get(i) + " ");
//        }


//        list.add(34544);
//        list.add(3564);
//        list.add(2234);
//        list.add(1);
//        list.add(5433);
//        list.add(9087);
//        list.add(0);
//
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);

    }
}
