package javaWeek_4.exercise3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BasicIndexApplication {

    public static void main(String[] args) {

        Map<Integer, String> index = new HashMap<>();
        System.out.println("Index: " + index);

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;

        String stringOne = "connecting";
        String stringTwo = "positive things";
        String stringThree = "ecologic economy";

        index.put(three, stringThree);
        index.put(two, stringTwo);
        index.put(one, stringOne);
        System.out.println("Index: " + index);

        Set<Integer> keys = index.keySet();
        System.out.println("Index keys: " + keys);

        Collection<String> values = index.values();
        System.out.println("Index values: " + values);

        System.out.println("Index entry sets: " + index);
        String stringNew = "teaching methods";
        index.put(one, stringNew);
        System.out.println("Index: " + index);

        if (index.containsKey(one)) {
            System.out.println("The page number 1 exists as key");
        }

        String topicValue = index.get(three);
        System.out.println("The topic in page number 3 is " + topicValue);

        Integer indexSize = index.size();
        System.out.println("Index size: " + indexSize);


    }
}
/*
Create an empty index map connecting Integers for the page numbers and Strings for the book topics and display it.
Create three Integers that represent three different page numbers.
Create three Strings that represent three different book topics.
Put them into the index map from biggest to smallest page number and display it to notice that the entries are automatically arranged.
Display the map keys.
Display the map values.
Create one String representing another book topic.
Put this new topic into the same page number than an existing one and display the map to notice that the previous one is replaced.
Ask if one of the keys is contained in the map and display the answer.

Get one of them by providing its name as an argument and display it.
Display its size.


Index: {}
Index: {1=connecting, 2=possitive things, 3=ecologic economy}
Index keys: [1, 2, 3]
Index values: [connecting, possitive things, ecologic economy]
Index entry sets: [1=connecting, 2=possitive things, 3=ecologic economy]
Index: {1=teaching methods, 2=possitive things, 3=ecologic economy}
The page number 1 exists as key
The topic in page number 3 is ecologic economy
Index size: 3

 */