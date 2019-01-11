package javaWeek_8.exercise2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilterApplication {

    public static void main(String[] args) {

        List<String> words =new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "cable", "glass", "backpack", "mouse"));
        System.out.println(words);

        words.removeIf(word -> word.endsWith("e"));
        System.out.println(words);

        words.replaceAll(word -> word.toUpperCase());
        System.out.println(words);

        words.removeIf(word -> word.length() < 6);
        System.out.println(words);

        words.forEach(word -> System.out.println(word));



    }
}
