package com.example;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        multiple(23,76,"uytyu", "fghj");
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
