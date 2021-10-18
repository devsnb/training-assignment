package com.shristi.basic;

public class SecondGreatestNumber {
    public static void main(String[] args) {
        int [] numbers = {90, 503, 20, 33, 101, 13, 100};
        secondSmallestNumber(numbers);
    }

    static void secondSmallestNumber(int[] numbers) {
        int greatest = Integer.MIN_VALUE;
        int secondGreatest = Integer.MIN_VALUE;

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > greatest) {
                secondGreatest = greatest;
                greatest = numbers[i];
            }

            if (numbers[i] > secondGreatest && numbers[i] != greatest) {
                secondGreatest = numbers[i];
            }
        }

        System.out.println("Greatest " + greatest);
        System.out.println("Second Greatest " + secondGreatest);
    }
}
