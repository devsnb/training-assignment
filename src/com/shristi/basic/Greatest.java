package com.shristi.basic;

public class Greatest {
    public static void main(String[] args) {
        int [] numbers = {90, 200, 33, 101, 100};
        greatest(numbers);
    }

    static void greatest(int[] numbers) {
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println(max);
    }
}
