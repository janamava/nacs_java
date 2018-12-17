package javaWeek_7.exercise3;

import java.util.List;
import java.util.Optional;

public class NumberFinder {


    public Optional<Integer> findBiggest(List<Integer> numbers) {
        Integer biggest = numbers.get(0);
        for (Integer number : numbers) {
            if (number > biggest) {
                biggest = number;
            }
        }

        return Optional.of(biggest);
    }

    public Optional<Integer> findSmallest(List<Integer> numbers) {
        Integer smallest = numbers.get(0);
        for (Integer number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
        }

        return Optional.of(smallest);
    }
}
