package com.shristi.tuts;

import java.util.Scanner;

public class PopulateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        for (int i = 0; i <= numbers.length; i++) {
            if (i == numbers.length) {
                sc.close();
            } else {
                numbers[i] = sc.nextInt();
            }
        }

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum is " + sum);

        float average = (float) sum / numbers.length;

        System.out.println("Average is " + average);
    }
}
