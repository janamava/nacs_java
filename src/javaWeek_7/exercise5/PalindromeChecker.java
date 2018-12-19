package javaWeek_7.exercise5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalindromeChecker {

    public Boolean check(String word) {
        String reversed = reverse(word);
        return reversed.equals(word);
    }

    public String reverse(String word){
        if (word.contains(" ")) {
            String.join("", word);
        }
        String reversed = "";
        List<String> splitted = Arrays.asList(word.split(""));
        Collections.reverse(splitted);
        for (String digit : splitted) {
            reversed +=digit;
        }
        return reversed;
    }
}
