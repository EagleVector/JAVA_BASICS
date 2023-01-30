package com.example;

import java.util.Arrays;

public class Overload {
    public static void main(String[] args) {
        fun(39);
//        fun("Cherry!");
        fun(45,86,23);
        fun("hfg", "hfhj", "ytthji");

    }

    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String ...v) {
        System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));;
    }
}
