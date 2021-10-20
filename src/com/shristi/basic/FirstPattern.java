package com.shristi.basic;
import java.util.Scanner;

public class FirstPattern {
    public static void main(String[] args) {
        System.out.print("Input number of number : ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        pattern(number);
    }

    static void pattern(int number) {
        for(int i = 1; i<=number; i++) {
            for(int j = 1;j <= i; j++){
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}
