package com.shristi.basic;

public class Factorial {
    public static void main(String[] args) {
        factorial(10);
    }

    static void factorial(int number) {
        int fact = 1;

        for(int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println(fact);
    }
}
