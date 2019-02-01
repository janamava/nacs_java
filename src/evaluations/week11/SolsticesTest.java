package evaluations.week11;

import javaWeek_11.test_pack.Time;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SolsticesTest {

    private Solstices solstices = new Solstices();

    @Test
    void countdownSummerSolstice() {
        String countdown = solstices.countdownSummerSolstice(LocalDate.now());
        System.out.println(countdown);
        String expected = "The Summer Solstice 2019 is on FRIDAY, JUNE 21, 2019 (in 140 days).";
        Assertions.assertEquals(expected, countdown);
    }
}