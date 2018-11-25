package javaWeek_3.exercise1;

public class ScreenApplication {

    public static void main(String[] args) {

        Customer customerOne = new Customer("Sahar", "business");
        Customer customerTwo = new Customer("Leo", "economy");
        Screen screen = new Screen();
        screen.display(customerOne);
        screen.display(customerTwo);
    }
}
/*
In the ScreenApplication class main method,
create a business class Customer,
an economic class Customer,
a Screen
and display them the screen.
 */