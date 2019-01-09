package javaWeek_8.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumberFilterTest {

    private NumberFilter filter = new NumberFilter();
    private List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

    @Test
    void getEven() {
        List<Integer> evenNumbers = filter.getEven(numbers);
        List<Integer> expected = Arrays.asList(2, 4, 6);
        Assertions.assertEquals(expected, evenNumbers);
    }

    @Test
    void getOdd() {
        List<Integer> oddNumbers = filter.getOdd(numbers);
        List<Integer> expected = Arrays.asList(1, 3, 5);
        Assertions.assertEquals(expected, oddNumbers);
    }
}