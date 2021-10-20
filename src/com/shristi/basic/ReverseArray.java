package com.shristi.basic;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] num = { 1, 2, 3, 4, 5};
        reverseArray(num);
    }

    static void reverseArray(int [] numbers) {
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
