package javaWeek_8.exercise5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerLevelScouterTest {

    private PowerLevelScouter scouter = new PowerLevelScouter();

    @Test
    void scout() {
        String name = "Susana";
        Integer value = scouter.scout(name);
        Integer expected = 619;
        Assertions.assertEquals(expected, value);
    }

    @Test
    void scoutEnhanced() {
        String name = "Susana";
        Integer value = scouter.scoutEnhanced(name);
        Integer expected = 651;
        Assertions.assertEquals(expected, value);
    }
}