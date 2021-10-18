package com.shristi.basic;

public class OddNumbers {
    public static void main(String[] args) {
        oddNumbers();
    }

    static void oddNumbers() {
        for (int i = 0; i <= 20; i++) {
            if(i % 2 != 0) {
                System.out.println("Odd number " + i);
            }
        }
    }
}
