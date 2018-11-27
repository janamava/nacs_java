package javaWeek_4.exercise7;

import java.util.*;

public class AdvancedIndexApplication {
    public static void main(String[] args) {

        Map<Integer, List<Topic>> index = new HashMap<>();
        System.out.println("Index: " + index);

        Integer pageOne = 1;
        Integer pageTwo = 2;

        Topic topicOne = new Topic("connecting");
        Topic topicTwo = new Topic("positive things");
        Topic topicThree = new Topic("ecologic economy");

        List<Topic> topics1 = new ArrayList<>();
        List<Topic> topics2 = new ArrayList<>();

        topics1.add(topicOne);
        topics2.add(topicTwo);
        topics2.add(topicThree);

        index.put(pageOne, topics1);
        index.put(pageTwo, topics2);

        System.out.println("Index: " + index);

        Set<Integer> pageNumbers = index.keySet();
        System.out.println("Index keys: " + pageNumbers);

        Collection<List<Topic>> topics = index.values();
        System.out.println("Index values: " + topics);

        Set<Map.Entry<Integer, List<Topic>>> entrySet = index.entrySet();
        System.out.println("Index entry sets: " + entrySet);

        Topic newTopic = new Topic("teaching methods");
        List<Topic> stored = index.get(pageOne);
        stored.add(newTopic);
        System.out.println("Index: " + index);

        if (index.containsKey(pageOne)) {
            System.out.println("The page number 1 exists as key");
        }

        List<Topic> stored2 = index.get(pageTwo);
        System.out.println("The topics in page number 2 are " + stored2);

        Integer sizeIndex = index.size();
        System.out.println("Index size: " + sizeIndex);

    }
}
/*
Create the Topic class that has a name.
Create an empty index map connecting Integer for the page numbers and a List of Topic for the several book topics that will appear in each page and display it.
Create two Integers that represent two different page numbers.
Create three Topic objects.
Create two lists: topics1 and topics2.
Add one Topic to topics1 and two into topics2.
Put the page numbers and topics1 and topics2 respectively into the index map .
Display the map keys. To display the Topic class create the toString method.
Display the map values. To display the Topic class create the toString method.
Create another different Topic.
Get the topics1 from the map and call it stored. Add to stored the last Topic you created. Display the map.
Ask if one of the keys is contained in the map and display the answer.
Get the topics2 from the map and call it stored2 and display it.
Display its size.
Hints:
Use Intellij shortcuts to create the toString and equals methods.


Index: {}
Index: {1=[text=connecting], 2=[text=possitive things, text=ecologic economy]}
Index keys: [1, 2]
Index values: [[text=connecting], [text=possitive things, text=ecologic economy]]
Index entry sets: [1=[text=connecting], 2=[text=possitive things, text=ecologic economy]]
Index: {1=[text=connecting, text=teaching methods], 2=[text=possitive things, text=ecologic economy]}
The page number 1 exists as key
The topics in page number 2 are [text=possitive things, text=ecologic economy]
Index size: 2
*/