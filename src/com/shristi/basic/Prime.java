package com.shristi.basic;


public class Prime {
    public static void main(String[] args) {
        int numb = 17;
        prime(numb);
    }

    static void prime(int number) {
        int halfNumber = number/2;
        boolean isPrime = true;

        if (number == 0 || number == 1){
            System.out.println(number + " is not prime number");
        } else {
            for(int i = 2; i <= halfNumber; i++){
                if(number % i == 0){
                    System.out.println(number + " is not prime number");
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)  {
                System.out.println(number + " is prime number");
            } else  {
                System.out.println(number + " is not prime number");
            }
        }
    }
}

