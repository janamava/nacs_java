package javaWeek_2.exercise4;

import java.util.Scanner;

public class Waiter {

    private Menu menu;

    public Waiter() {
        this.menu = new Menu();
    }

    public void showMenu(){
        System.out.println("Welcome to our cafe! Here is our menu: ");
        for (Meal meal : menu.getMeals()) {
            System.out.println(meal.getName());
        }
    }
    public Meal takeOrder(){
        System.out.println("What would you like to order?");
        Scanner scanner = new Scanner(System.in);
        String chosenMeal = scanner.nextLine();
        for (Meal meal : menu.getMeals()) {
            if(chosenMeal.equals(meal.getName())) { //add ignoreCase
                return meal;
            }
        }
        return null;
    }

    public void billCustomer(Meal meal) {
        System.out.println("Great choice! It comes to " + meal.getPrice() + " Euro.");

    }
}
/*
The Waiter has access to the menu (through the constructor) and can show the list of Meals
The Waiter can receive one order from a customer (typing the name of the desired Meal),
 then the Waiter will show how much the customer has to pay for that Meal.
 */