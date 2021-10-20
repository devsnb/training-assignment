package com.shristi.basic;

public class CountDuplicatesInArray {
    public static void main(String[] args) {
        int [] num = {10, 15, 25, 10, 8, 12, 10, 15, 55, 10, 60};

        countDuplicateInArray(num);
    }

    static void countDuplicateInArray(int [] numbers) {
        int count = 0;
        int i = 0;
        while(i < numbers.length) {
            int j = i + 1;
            while(j < numbers.length) {
                if(numbers[i] == numbers[j]) {
                    count++;
                    break;
                }
                j++;
            }
            i++;
        }
        System.out.println("Total Number of Duplicates:" + count);
    }
}
