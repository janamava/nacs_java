package javaWeek_7.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

class NicknameMakerTest {

    private List<String> words = Arrays.asList("tree", "", "p", "cosmopolitan");

    @Test
    void createNickname() {
        List<String> nicknames = new NicknameMaker().createNicknames(words);
        Assertions.assertLinesMatch(Arrays.asList("tr", "p", "cosmop"), nicknames);
        System.out.println(nicknames);
    }
}