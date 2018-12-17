package javaWeek_7.exercise3;

import java.util.List;
import java.util.Optional;

public class NumberFinderApplication {

    public static void main(String[] args) {

        NumberFinder numberFinder = new NumberFinder();
        List<Integer> numbers = Numbers.asList();

        Optional<Integer> biggest = numberFinder.findBiggest(numbers);
        if(biggest.isPresent()){
            System.out.println(biggest.get());
        }
        Optional<Integer> smallest = numberFinder.findSmallest(numbers);
        if(smallest.isPresent()){
            System.out.println(smallest.get());
        }
    }
}
