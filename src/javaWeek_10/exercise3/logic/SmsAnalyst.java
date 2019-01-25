package javaWeek_10.exercise3.logic;

import javaWeek_10.exercise3.model.Sms;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsAnalyst {

    private List<Sms> messages = new SmsGenerator().generateSms();

    public String getRatio() {
        return messages.stream()
                .collect(Collectors.groupingBy(Sms::getName, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " " + e.getValue() * 100 / getTotal() + "% ")
                .collect(Collectors.joining(" ","Ham/spam ratio: "," "));
    }

    public long getTotal() {
        return messages.stream()
                .count();
    }

    public Optional<String> getMostAppeared() {
        return messages.stream()
                .map(e -> e.getBody().split(" "))
                .flatMap(Stream::of)
                .map(this::cleanText)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public String cleanText(String text){
        text = text.replaceAll("\\.", "");
        text = text.replaceAll(",", "");
        text = text.replaceAll(";", "");
        text = text.replaceAll("#", "");
        text = text.replaceAll("\\?", "");
        text = text.replaceAll("\\)", "");
        text = text.replaceAll("!", "");
        return text;
    }

    public Optional<String> findTheMostAppearingLetter(){
        return messages.stream()
                .filter(e -> e.getName().equals("ham"))
                .map(e -> e.getBody().split(" "))
                .flatMap(Stream::of)
                .map(word -> word.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(Map.Entry::getKey)
                .findFirst();
    }

    public Optional<Integer> findLongestMessage(){
        //.map(e -> IntStream.of(e))
        return messages.stream()
                .filter(e -> e.getName().equals("spam"))
                .map(e -> e.getBody().length()).min(Comparator.reverseOrder());
    }
}
