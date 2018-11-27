package javaWeek_4.exercise5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {

        List<Grocery> groceries = new ArrayList<>();
        System.out.println("Groceries: " + groceries);


        Grocery itemOne = new Grocery("bananas");
        Grocery original = new Grocery("oranges");
        Grocery itemThree = new Grocery("tomatoes");

        groceries.add(itemOne);
        groceries.add(original);
        groceries.add(itemThree);


        System.out.println("Groceries: " + groceries);

        //creating a new object with same name as original
        //creating an equals method in Grocery Class
        //creating an if method that removes original if new,

        Grocery duplicate = new Grocery("oranges");
        groceries.remove(duplicate);
        System.out.println("Groceries: " + groceries);

        groceries.add(itemThree);
        groceries.add(itemThree);

        System.out.println("Groceries: " + groceries);

        groceries.remove(2);
        System.out.println("Groceries: " + groceries);

        Integer sizeGroceries = groceries.size();
        System.out.println("Groceries size: " + sizeGroceries);

    }

}
/*
Create the Grocery class that has one name.
Create an empty groceries list of Grocery and display it.
Create three different Grocery objects.
Add them to the groceries list and display it. To display the Grocery class create the toString method.

Create a new Grocery with the same name as a previous one and use it to remove the original one from the list.
To remove a Grocery automatically you need to create the equals method in the Grocery class.
Specify that two Grocery are the same if their name is the same.
Add one of the existing groceries twice and display the list.
Remove the third element of the list by providing its position and display it.
Display its size.
Hints:
Use Intellij shortcuts to create the toString and equals methods.

Groceries: []
Groceries: [name=bananas, name=oranges, name=tomatoes]
Groceries: [name=bananas, name=tomatoes]
Groceries: [name=bananas, name=tomatoes, name=tomatoes, name=tomatoes]
Groceries: [name=bananas, name=tomatoes, name=tomatoes]
Groceries size: 3

 */