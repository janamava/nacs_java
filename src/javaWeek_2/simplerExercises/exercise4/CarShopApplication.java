package javaWeek_2.simplerExercises.exercise4;

public class CarShopApplication {

    public static void main(String[] args) {
        Seller seller = new Seller();

        Car toyota = new Car("Toyota");
        Car porsche = new Car("Porsche");
        Car reno = new Car("Reno");

        seller.describe(toyota);
        seller.describe(porsche);
        seller.describe(reno);
    }
}
/*
In the CarShopApplication class main method, create a Seller

and three Cars with different brands

and use the Seller to describe the three of them.
He should say that the three of them are particularly good.
 */