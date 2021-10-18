package com.shristi.basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        armstrongNumberOrNot(403);
    }

    static void armstrongNumberOrNot(int number) {
        int originalNumber = number;
        int remainder;
        int numberOfDigits = 0;

        float result = 0.00f;


//      Storing the number of digits
        for(originalNumber = number; originalNumber != 0; ++numberOfDigits) {
            originalNumber /= 10;
        }

        for (originalNumber = number; originalNumber != 0; originalNumber /= 10) {
            remainder = originalNumber % 10;

//      Sum of power of individual digits in result
            result += Math.pow(remainder, numberOfDigits);
        }

        if (result == number) {
            System.out.println("It is a Armstrong number");
        }
        else {
            System.out.println("It is not an Armstrong number");
        }
    }
}
