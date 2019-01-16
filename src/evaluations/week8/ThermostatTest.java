package evaluations.week8;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class ThermostatTest {



    @Test
    void senseUnderZero(){
        Thermostat thermostat = new Thermostat(n -> n < 0.0, n -> n + " degrees Celsius");
        String result = thermostat.sense(1.5);
        String expected = "1.5 degrees Celsius";
        Assertions.assertEquals(expected, result);

    }
}