package javaWeek_2.exercise4;

public class RestaurantApplication {

    public static void main(String[] args) {

        Waiter waiter = new Waiter();
        waiter.showMenu();
        Meal order = waiter.takeOrder();
        waiter.billCustomer(order);
    }

}
/*
The RestaurantApplication has the main method that uses the Waiter class
to show the different Meals and takes one order from one customer.
Develop that application.
 */