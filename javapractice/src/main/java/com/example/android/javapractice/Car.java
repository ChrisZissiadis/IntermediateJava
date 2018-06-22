package com.example.android.javapractice;

public class Car {

    public String colour = "Black";
    private String mInterior = "standard";
    private int mNumberOfSeats = 5;

    public Car(String chosenColor, String chosenInterior) {
        colour = chosenColor;
        mInterior = chosenInterior;
    }

    public Car() {

    }

    public int getNumberOfSeats() {

        return mNumberOfSeats;
    }

    public String getmInterior() {
        return mInterior;
    }

    public void drive() {
        System.out.println("The car is moving.");
    }
}
