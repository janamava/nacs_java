package javaWeek_8.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SensorTest {

    private Sensor sensor = new Sensor();

    @Test
    void decryptOneLine() {
        String line = "s!t!r!u!g!g!l!e! !a!g!a!i!n!s!t! !t!h!e! !w!i!n!d!";
        String encrypted = sensor.decryptOneLine(line);
        Assertions.assertEquals("struggle against the wind", encrypted);
    }
}