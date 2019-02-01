package evaluations.week10;

import fileReader.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsReader {

    public List<String> getWords() {

        return new FileReader().asStream("evaluations/week10/alice.txt")
                .map(String::toLowerCase)
                .map(e -> e.replaceAll(",", " "))
                .map(e -> e.replaceAll("’", " "))
                .map(e -> e.replaceAll("‘", " "))
                .map(e -> e.replaceAll("]", " "))
                .map(e -> e.replaceAll("\\[", " "))
                .map(e -> e.replaceAll("\\(", " "))
                .map(e -> e.replaceAll("\\)", " "))
                .map(e -> e.replaceAll("\\*", " "))
                .map(e -> e.replaceAll("\\.", " "))
                .map(e -> e.replaceAll("/", " "))
                .map(e -> e.replaceAll("’s", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.replaceAll("!", " "))
                .map(e -> e.replaceAll("\\?", " "))
                .map(e -> e.split(" "))
                .flatMap(Stream::of)
                .filter(e -> !e.isEmpty())
                .collect(Collectors.toList());

    }
}
