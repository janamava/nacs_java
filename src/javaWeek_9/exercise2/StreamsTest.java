package javaWeek_9.exercise2;

import fileReader.FileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class StreamsTest {

    private FileReader reader = new FileReader();
    private List<String> names = reader.asList("files/names.txt");

    @Test
    void testFindShortNames(){
        List<String> actual = names.stream()
                .filter(e -> e.length() < 4)
                .collect(Collectors.toList());

        List<String> expected = Arrays.asList("El");
        Assertions.assertLinesMatch(expected, actual);
    }


    @Test
    void testEndsWithMAndUpperCase(){
        List<String> actual = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertLinesMatch(expected, actual);
    }


    @Test
    void testcontainsEAndR(){
        List<String> actual = names.stream()
                .filter(e -> e.contains("e") && (e.contains("r")))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertLinesMatch(expected, actual);
    }


    @Test
    void test4CharLowerCaseAAndMDuplicateA() {
        List<String> actual = names.stream()
                .filter(e -> e.length() == 4)
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("a") && e.contains("m"))
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertLinesMatch(expected, actual);
    }
}
