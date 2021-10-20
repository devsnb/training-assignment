package com.shristi.basic;

import java.util.Scanner;

public class SecondPattern {
    public static void main(String[] args) {
        System.out.println("Your Number");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        secondPattern(num);
    }

    static void secondPattern(int number) {
        int initial = 1;

        for (int i = 0; i <= number; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(initial);
                initial++;
            }
            System.out.println("");
        }
    }
}
