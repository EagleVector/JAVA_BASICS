package com.example;

public class Scope {
    public static void main(String[] args) {
        String name = "Cherry!";
        System.out.println(name);
        {
            name = "Sunny";
            System.out.println(name);
            String name1 = "Bunny";
            System.out.println(name1);
        }
        System.out.println(name);
        String name1 = "Jerry";
        System.out.println(name1);
    }
}
