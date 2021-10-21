package com.shristi.tuts;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] usernames = {"Snehangshu", "Raj", "Arun", "Mallika", "Sharmila"};

        System.out.println("Enter name to register");
        String name = sc.next();
        sc.close();

        for (int i = 0; i < usernames.length; i++) {
            if(usernames[i].equals(name)) {
                System.out.println("Name is not unique");
                break;
            } else if (i == usernames.length -1) {
                System.out.println("You are registered");
            }
        }
    }
}
