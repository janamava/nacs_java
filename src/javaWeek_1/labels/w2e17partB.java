package javaWeek_1.labels;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class w2e17partB {

    public static void main(String[] args) {

        List<String> words = Arrays.asList("PLEASE", "NO", "ADVERTISEMENT");

        List<String> fixed = new ArrayList<>();

        for (String word : words) {
            word = word.toLowerCase();
            fixed.add(word);
        }

        System.out.println(fixed);

    }

}
/*
Part B

Collection of String words = [“PLEASE”, “NO”, “ADVERTISEMENT”]

String word = words.get(0)
words = words.remove(0) Arrays.asList is immutable. To remove define as a new ArrayList<>()

List<String> words = new ArrayList<>();
        words.add("PLEASE");
        words.add("NO");
        words.add("ADVERTISEMENT");

word = word.lowerCase()
words = words.add(word)

word = words.get(0)
words = words.remove(0)
word = word.lowerCase()
words = words.add(word)

word = words.get(0)
words = words.remove(0)
word = word.lowerCase()
words = words.add(word)
 */