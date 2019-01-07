package javaWeek_7.exercise1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoneyCalculatorTest {

    private List<Integer> moneys = Arrays.asList(1, 5, 4, 3, 4, 2, 1, 3, 5, 2);

    @Test
    void calculateTotalSum() {
        int totalSum = new MoneyCalculator().calculateTotalSum(moneys);
        Assertions.assertEquals(30, totalSum);
    }
}