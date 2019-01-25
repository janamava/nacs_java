package evaluations.week10;

import fileReader.FileReader;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordsReader {

    public List<String> asWords() {
        return new FileReader().asList("evaluations/week10/alice.txt");

        return Stream.of(asWords())
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
                .map(e -> e.replaceAll("'s", " "))
                .map(e -> e.replaceAll("#", " "))
                .map(e -> e.replaceAll(";", " "))
                .map(e -> e.replaceAll(":", " "))
                .map(e -> e.replaceAll("-", " "))
                .map(e -> e.trim())
                .map(e -> e.split(" "))
                .collect(Collectors.toList());

    }
}
