package com.example.android.javapractice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("success");

        Car myToyota = new Car("Red", "Leather");

        System.out.println("car is " + myToyota.colour + ", has " + myToyota.getNumberOfSeats() + " seats and " + myToyota.getmInterior() + " interior");
        myToyota.drive();
    }

}
