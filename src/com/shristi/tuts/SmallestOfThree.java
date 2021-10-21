package com.shristi.tuts;

import java.util.Scanner;

public class SmallestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your three numbers :");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();

        sc.close();

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1 + " is the smallest");
        } else if (num2 < num3) {
            System.out.println(num2 + " is the smallest");
        } else {
            System.out.println(num3 + " is the smallest");
        }
    }
}
