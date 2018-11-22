package javaWeek2.simplerExercises.exercise4;

public class Seller {



    void describe(Car car) {
        String brand = car.getBrand();
        System.out.println("This " + brand + " is particularly good!");
    }
}
/*
A Seller has no attributes. It has the describe method that
receives a Car and it says that that car’s brand is particularly good.
*/