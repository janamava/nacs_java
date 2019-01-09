package javaWeek_8.exercise3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {

    public List<Integer> getEven(List<Integer> numbers) {
        return filter(numbers, number -> number % 2 == 0);
    }

    public List<Integer> getOdd(List<Integer> numbers) {
        return filter(numbers, number -> number % 2 != 0);
    }

    private List<Integer> filter(List<Integer> numbers, Predicate<Integer> condition) {
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (condition.test(number)) {
                result.add(number);
            }
        }
        return result;
    }
}
