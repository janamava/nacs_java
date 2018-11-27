package javaWeek_4.exercise6;

import java.util.HashSet;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {

        Set<Item> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);

        Item itemOne = new Item("toothpaste");
        Item itemTwo = new Item("towel");
        Item itemThree = new Item("underwear");

        backpack.add(itemOne);
        backpack.add(itemTwo);
        backpack.add(itemThree);
        System.out.println("Backpack: " + backpack);

        Item newItem = new Item("underwear");

        if (backpack.contains(newItem)) {
            System.out.println("The backpack contains underwear");
        }

        backpack.remove(newItem);
        System.out.println("Backpack: " + backpack);

        if (! backpack.contains(newItem)) {
            System.out.println("The backpack no longer contains underwear");
        }
        backpack.add(itemOne);
        System.out.println("Backpack: " + backpack);
        backpack.add(itemOne);
        System.out.println("Backpack: " + backpack);

        Integer sizeBackpack = backpack.size();
        System.out.println("Backpack size: " + sizeBackpack);
    }

}

/*
Create the Item class that has one name.
Create an empty backpack set of Item and display it.
Create three different Item objects.
Add them to the backpack set and display it. To display the Item class create the toString method.
Create a new Item with the same name as a previous one and use it to ask if is contained in the set and display the answer.
To compare an Item automatically you need to create the equals method in the Item class.
Specify that two Items are the same if their name is the same.
Use the last Item you created to remove the original one from the set.
To remove an Item automatically you need to create the equals method in the Item class.

Ask if the element you just removed is not contained in the set and display the answer.

Add one of the existing items twice and display the set.
Display its size.
Hints:
Use Intellij shortcuts to create the toString and equals methods.


Backpack: []
Backpack: [name=toothpaste, name=towel, name=underwear]
The backpack contains underwear
Backpack: [name=toothpaste, name=towel]
The backpack no longer contains underwear
Backpack: [name=toothpaste, name=towel]
Backpack: [name=toothpaste, name=towel]
Backpack size: 2

 */
