package javaWeek_8.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElegant(String sentence){
        return filter(sentence, word -> word.startsWith("ele"));
    }

    public List<String> findPlayful(String sentence) {
        return filter(sentence, word -> word.endsWith("ful"));

    }

    private List<String> filter(String sentence, Predicate<String> condition){
        List<String> result = new ArrayList<>();
        List<String> splittedSentence = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for (String word : splittedSentence) {
            if (condition.test(word)){
                result.add(word);
            }
        }
        return result;
    }
}
