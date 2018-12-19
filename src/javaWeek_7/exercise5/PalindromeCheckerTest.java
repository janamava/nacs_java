package javaWeek_7.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    private PalindromeChecker checker = new PalindromeChecker();

    @Test
    void check() {
        String word = "madam";
        Boolean check = checker.check(word);
        Assertions.assertTrue(check);
    }
}