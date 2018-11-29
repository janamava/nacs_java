package javaWeek_4.exercise10;

import javaWeek_4.exercise7.Topic;
import javaWeek_4.exercise9.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TopicReaderApplication {

    public static void main(String[] args) {

        TopicReader topicReader = new TopicReader(new FileReader());
        List<Topic> topics = topicReader.getTopics();

        for (Topic topic : topics) {
            System.out.println("Topic list: " + topic);

        }

        Set<Topic> setOfTopics = new HashSet<>(topics);

        for (Topic topic : setOfTopics) {
            System.out.println("Topic set: " + topic);
        }
    }

}
/*
In the TopicReaderApplication class main method, create a TopicReader,
use the getTopics method and place them inside a list.
Display the list of topics.
Create a set of Topic, add the elements of the previous list
and display it to notice that there happens to be duplicates.
To ensure uniqueness you have to create the equals method in the Topic class.
Do this and run the program again to make sure the set does not display any duplicates.
Create tests for the TopicReader class.


Topic list: text=Christmas markets under the snow
Topic list: text=Winter is coming
Topic list: text=Practice makes mastery
Topic list: text=Working over-hours, is it worth it?
Topic list: text=Winter is coming
Topic list: text=Your next holiday destination
Topic list: text=Winter is coming
Topic set: text=Working over-hours, is it worth it?
Topic set: text=Practice makes mastery
Topic set: text=Winter is coming
Topic set: text=Christmas markets under the snow
Topic set: text=Your next holiday destination


 */