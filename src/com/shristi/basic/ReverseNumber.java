package com.shristi.basic;

public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(1695);
    }

    static void reverseNumber(int number) {
        int reverse = 0;

        while (number != 0) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        System.out.println("The reverse of the given number is: " + reverse);
    }
}

