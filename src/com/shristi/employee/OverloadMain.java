package com.shristi.employee;

public class OverloadMain {
    public static void main(String[] args) {
        Employee arun = new Employee("Arun", "Manager");
        Employee snehangshu = new Employee("Sehangshu", "Programmer");
        Employee raj = new Employee("Raj", "Director");

        System.out.println(snehangshu.calcBonus(5000));
        System.out.println(arun.calcBonus(5000, 6000));
        System.out.println(raj.calcBonus(5000, 6000, 9000));
    }
}
