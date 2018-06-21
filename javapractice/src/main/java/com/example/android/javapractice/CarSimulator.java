package com.example.android.javapractice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("success");

        Car myToyota = new Car();

        System.out.println("car colour is: " + myToyota.Colour);
        myToyota.Colour = "blue";
        System.out.println("car colour is: " + myToyota.Colour + " and has " + myToyota.getNumberOfSeats() + " seats.");

    }

}
