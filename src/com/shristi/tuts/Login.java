package com.shristi.tuts;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = {"Snehangshu", "Raj", "Arun", "Mallika", "Sharmila"};

        System.out.println("Enter username to login");
        String name = sc.next();
        sc.close();

        for (int i = 0; i < usernames.length; i++) {
            if (usernames[i].equals(name)) {
                System.out.println("You are logged in successfully");
                break;
            } else if (i == usernames.length - 1) {
                System.out.println("Invalid username");
            }

        }
    }
}
