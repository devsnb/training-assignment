package com.shristi.basic;

import java.util.Arrays;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        int [] numbers = {90, 20, 33, 101, 13, 100};
        secondSmallestNumber(numbers);
    }

    static void secondSmallestNumber(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] < smallest) {
                secondSmallest = smallest;
                smallest = numbers[i];
            }

            if (numbers[i] < secondSmallest && numbers[i] != smallest) {
                secondSmallest = numbers[i];
            }
        }

        System.out.println("Smallest " + smallest);
        System.out.println("Second Smallest " + secondSmallest);
    }
}
