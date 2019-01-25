package javaWeek_4.exercise10;

import javaWeek_4.exercise7.Topic;
import javaWeek_4.exercise9.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    private FileReader reader;

    public TopicReader(FileReader reader) {
        this.reader = reader;
    }

    public List<Topic> getTopics() {
        List<String> lines = reader.asLines("files/topics.txt");
        List<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            Topic topic = new Topic(line);
            topics.add(topic);
        }
        return topics;
    }
}

/*
Create the TopicReader class that has a FileReader as an attribute.
It has the getTopics method that uses the File PokemonReader to read the topics.txt file,
transform every line into one Topic and returns the list of topics.
 */
