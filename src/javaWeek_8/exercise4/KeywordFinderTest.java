package javaWeek_8.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KeywordFinderTest {

    private KeywordFinder finder = new KeywordFinder();

    @Test
    void findElegant() {
        String sentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> elegantWords = finder.findElegant(sentence);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertLinesMatch(elegantWords, expected);

    }

    @Test
    void findPlayful() {
        String sentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> playfulWords = finder.findPlayful(sentence);
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertLinesMatch(playfulWords, expected);
    }
}