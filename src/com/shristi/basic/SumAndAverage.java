package com.shristi.basic;

public class SumAndAverage {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};

        sumAndAverage(numbers);
    }

    static void sumAndAverage(int[] numbers) {

        int sum = 0;

        for (int values:numbers) {
            sum += values;
        }

        float average = (float)sum / numbers.length;

        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
}
