package javaWeek_9.exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsApplication {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        int number = 0;
        for (int times = 0; times < 20; times++) {
            number = number + 1;
            numbers.add(number);
        }

        List<Integer> evenNumbers = numbers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: ");
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = numbers.stream()
                .filter(e -> e % 2 != 0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers: ");
        System.out.println(oddNumbers);

        List<Integer> numbersThreeAndTen = numbers.stream()
                .filter(e -> e % 3 == 0)
                .filter(e -> e > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: ");
        System.out.println(numbersThreeAndTen);

        List<Integer> numbersFiveAndThree = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());
        System.out.println("Numbers smaller than 5 and multiplied by 3: ");
        System.out.println(numbersFiveAndThree);

        List<Integer> numbersFrom8To12 = numbers.stream()
                .filter(e -> e > 8)
                .filter(e -> e < 12)
                .collect(Collectors.toList());

        System.out.println("Digits of numbers bigger than 8 and smaller than 12:");

        numbersFrom8To12.stream()
                .forEach(e -> System.out.print("Number " + e + " has " + String.valueOf(e).length() + " digits "));





    }
}
