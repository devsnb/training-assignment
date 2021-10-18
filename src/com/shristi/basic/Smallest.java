package com.shristi.basic;

public class Smallest {
    public static void main(String[] args) {
        int [] numbers = {90, 20, 13, 33, 101, 100};
        smallest(numbers);
    }

    static void smallest(int[] numbers) {
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }

        System.out.println(min);
    }
}
