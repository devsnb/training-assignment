package com.shristi.basic;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] num = { 51, 6, 157, 9, 547, 36};
        sortArray(num);
    }

    static void sortArray(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
