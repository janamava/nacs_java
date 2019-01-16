package javaWeek_9.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

   private Caesar caesar = new Caesar();

    @Test
    void testAlphabetic() {
        String actual = caesar.cipher("XyZ", 1);
        String expected = "YzA";
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testNonAlphabetic() {
        String actual = caesar.cipher("=!'", 1);
        String expected = "=!'";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testStringEmpty() {
        String actual = caesar.cipher("", 1);
        String expected = "";
        Assertions.assertEquals(expected, actual);
    }
}