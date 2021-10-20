package com.shristi.basic;

public class FirstStarPyramid {
    public static void main(String[] args) {
        printStars(5);
    }

    static void printStars(int num) {
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
