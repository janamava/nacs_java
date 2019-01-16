package javaWeek_9.exercise3;


import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .filter(e -> !e.isEmpty())
                .map(e -> (int) e.charAt(0))
                .map(cipher(key))
                .map(e -> Character.toString((char) e.intValue()))
                .collect(Collectors.joining());
    }

    private Function<Integer, Integer> cipher(Integer key) {
        return e -> {
            if(!Character.isAlphabetic(e)){
                return e;
            }
            if (e > 96) {
                return (e - 97 + key) % 26 + 97;
            }
            else {
                return (e - 65 + key) % 26 + 65;
            }
        };
    }
}
