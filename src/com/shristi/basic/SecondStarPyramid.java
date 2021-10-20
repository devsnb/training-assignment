package com.shristi.basic;

public class SecondStarPyramid {
    public static void main(String[] args) {
        secondPyramid(3);
    }

    static void secondPyramid(int rows) {
        for (int i = rows; i >= 1; --i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("* ");
            }
            System.out.println("\n");
        }
    }
}
