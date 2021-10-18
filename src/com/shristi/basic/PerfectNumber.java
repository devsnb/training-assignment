package com.shristi.basic;

public class PerfectNumber {
    public static void main(String[] args) {
        isPerfectNumber(7);
    }

    static void isPerfectNumber(int number) {
        int remainder, sum = 0;

        for (int i = 1; i < number; i++) {
            remainder = number % i;

            if (remainder == 0) {
                sum += i;
            }
        }

        if (sum == number) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}
