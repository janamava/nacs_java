package javaWeek_7.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class NumberFinderTest {

    private NumberFinder numberFinder = new NumberFinder();

    @Test
    void findBiggest() {

        List<Integer> numbers = Arrays.asList(85, 7, 4, 6, 8);
        int biggestNumber = 0;
        Optional<Integer> biggest = numberFinder.findBiggest(numbers);
        if (biggest.isPresent()) {
            biggestNumber = biggest.get();
            System.out.println(biggestNumber);
        }

        Assertions.assertEquals(85, biggestNumber);

    }
    @Test
    void findSmallest(){

        List<Integer> numbers = Arrays.asList(-5, 7, 4, 6, 8);
        int smallestNumber = 0;
        Optional<Integer> smallest = numberFinder.findSmallest(numbers);
        if (smallest.isPresent()) {
            smallestNumber = smallest.get();
            System.out.println(smallestNumber);
        }

        Assertions.assertEquals(-5, smallestNumber);

    }


}
