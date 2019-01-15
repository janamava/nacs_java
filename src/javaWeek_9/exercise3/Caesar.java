package javaWeek_9.exercise3;


import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Caesar {

    String cipher(String plaintext, Integer key) {
        return Stream.of(plaintext.split(""))
                .map(e -> (int) e.charAt(0))
                .map(cipher(key))
                .map(e -> Character.toString((char) e.intValue()))
                .collect(Collectors.joining());
    }

    private Function<Integer, Integer> cipher(Integer key) {
        return e -> {
            if (e > 96) {
                return (e - 96 + key) % 26 + 96;
            }
            else {
                return (e - 64 + key) % 26 + 64;
            }
        };
    }
}
/*
You’re not allowed to use a loop.
The first line of the cipher method starts with the return command.
You’re allowed to create other methods
Hints:
You can refresh your memory about the Caesar description here.
You can start a Stream using the Stream.of(...) method.
You can use one method that you have created inside a Lambda.
 */