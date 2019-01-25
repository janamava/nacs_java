package evaluations.week10;


import java.awt.*;
import java.util.Map;
import java.util.stream.Collectors;

public class Statistician {

    private WordsReader reader = new WordsReader();

    public Long countTotalWords(){
        return reader.asWords().stream()
                .count();
    }

    public Long countDistinctWords(){
        return reader.asWords().stream()
                .distinct()
                .count();
    }

    public List<String> mostAppearingFiveWords(){
        return reader.asWords().stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> mostAppearingFiveLetters(){
        return reader.asWords().stream()
                .flatMap(e -> e.split(""))
                .map(e -> e.equalsIgnoreCase(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public Long countAliceAppears(){
        return reader.asWords().stream()
                .map(e -> e.equals("Alice"))
                .count();
    }




}
