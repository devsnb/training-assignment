package com.shristi.tuts;

import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        int[] sqrt = new int[5];


        System.out.println("Enter your numbers");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();

            sqrt[i] = (int) Math.pow(numbers[i], 2);
        }

        for(int value:sqrt) {
            System.out.println(value);
        }
    }
}
