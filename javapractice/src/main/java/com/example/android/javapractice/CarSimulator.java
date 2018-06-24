package com.example.android.javapractice;

public class CarSimulator {

    public static void main(String[] args) {

        System.out.println("success");

        Car myToyota = new Car("Blue", "wood");

        Car myHonda = new Car();
        myHonda.drive();

        SelfDrivingCar autoBot = new SelfDrivingCar("Yellow", "Plastic");
        autoBot.drive();
        System.out.println("autobot colour is "+autoBot.colour);

    }

}
