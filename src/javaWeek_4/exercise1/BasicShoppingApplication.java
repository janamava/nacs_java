package javaWeek_4.exercise1;

import java.util.ArrayList;
import java.util.List;

public class BasicShoppingApplication {

    public static void main(String[] args) {

        List<String> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);

        String stringOne = "bananas";
        String stringTwo = "oranges";
        String stringThree = "tomatoes";

        groceries.add(stringOne);
        groceries.add(stringTwo);
        groceries.add(stringThree);
        System.out.println("Groceries: " + groceries);

        groceries.remove("oranges");
        System.out.println("Groceries: " + groceries);

        groceries.add(stringThree);
        groceries.add("tomatoes");
        System.out.println("Groceries: " + groceries);

        groceries.remove(3);
        System.out.println( "Groceries: " + groceries);

        Integer groceriesSize = groceries.size();
        System.out.println("Groceries size : " + groceriesSize);
    }


}
/*
Create an empty groceries list and display it.
Create three Strings that represent three different groceries.
Add them to the groceries list and display it.
Remove one of them by providing its name as an argument and display the list.
Add one of the existing groceries twice and display the list.
Remove the third element of the list by providing its position and display it.
Display its size.


Groceries: []
Groceries: [bananas, oranges, tomatoes]
Groceries: [bananas, tomatoes]
Groceries: [bananas, tomatoes, tomatoes, tomatoes]
Groceries: [bananas, tomatoes, tomatoes]
Groceries size: 3


 */