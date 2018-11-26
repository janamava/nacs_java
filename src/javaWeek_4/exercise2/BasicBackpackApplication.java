package javaWeek_4.exercise2;

import java.util.HashSet;
import java.util.Set;

public class BasicBackpackApplication {

    public static void main(String[] args) {

        Set<String> backpack = new HashSet<>();
        System.out.println("Backpack: " + backpack);

        String itemOne = "toothpaste";
        String itemTwo = "towel";
        String itemThree = "underwear";

        backpack.add(itemOne);
        backpack.add(itemTwo);
        backpack.add(itemThree);
        System.out.println("Backpack: " + backpack);


        if(backpack.contains("underwear")){
            System.out.println("The backpack contains underwear");
        }

        backpack.remove("underwear");
        System.out.println("Backpack: " + backpack);

        if(! backpack.contains("underwear")){
            System.out.println("The backpack no longer contains underwear");
        }

        backpack.add(itemTwo);
        System.out.println("Backpack: " + backpack);
        backpack.add(itemTwo);
        System.out.println("Backpack: " + backpack);

        Integer sizeBackpack = backpack.size();
        System.out.println("Backpack size: " + sizeBackpack);


    }


}



/*
Create an empty backpack set and display it.
Create three Strings that represent three different items.
Add them to the backpack set and display it.
Ask if one of them is contained in the set and display the answer.
Remove one of them by providing its name as an argument and display the set.
Ask if the element you just removed is not contained in the set and display the answer.
Add one of the existing items twice and display the set.

Display its size.


Backpack: []
Backpack: [toothpaste, towel, underwear]
The backpack contains underwear
Backpack: [toothpaste, towel]
The backpack no longer contains underwear
Backpack: [toothpaste, towel]
Backpack: [toothpaste, towel]
Backpack size: 2

 */