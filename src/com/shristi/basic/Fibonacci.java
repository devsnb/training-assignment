package com.shristi.basic;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        input.close();

        fibonacci(number);
    }

    static void fibonacci(int number) {
        int term1 = 0;
        int term2 = 1;

        int nextTerm = term1 + term2;

        System.out.print("Fibonacci Series: " + term1 + " " + term2);

        for (int i = 3; i <= number; ++i) {
            System.out.print(" " + nextTerm);
            term1 = term2;
            term2 = nextTerm;
            nextTerm = term1 + term2;
        }
    }
}
