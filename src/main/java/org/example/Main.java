package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        sum(6,5);
        sub(6,3);
    }

    public static void sum(int a, int b){
        System.out.println("Sum of Two Integers: "+(a+b));
    }

    public static void sub(int a, int b){
        System.out.println("Sub of Two Integers: "+(a-b));
    }
}