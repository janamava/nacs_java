package evaluations.week10;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Statistician {

    private WordsReader reader = new WordsReader();

    public Integer countTotalWords() {
        return reader.getWords().size();
    }

    public Long countDistinctWords() {
        return reader.getWords().stream()
                .distinct()
                .count();
    }

    public List<String>mostAppearingFiveWords() {
        return reader.getWords().stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public List<String> mostAppearingFiveLetters() {
        return reader.getWords().stream()
                .map(e -> e.split(""))
                .flatMap(Stream::of)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public Long countAliceAppears() {
        return reader.getWords().stream()
                .filter(e -> e.equalsIgnoreCase("Alice"))
                .count();
    }
}
