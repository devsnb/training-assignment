package com.shristi.vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle honda = new Vehicle("Civik", "New", 250000);
        Vehicle suzuki = new Vehicle("Ninja", "New", 600000);

        honda.getdetails();
        suzuki.getdetails();
    }
}
