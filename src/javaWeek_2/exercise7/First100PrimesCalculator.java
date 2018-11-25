package javaWeek_2.exercise7;

import java.util.List;

public class First100PrimesCalculator {

    public Integer getSumOfThe100FirstPrimeNumbers() {

        List<Integer> numbers = new IntegerListProvider().provide550Integers();
        List<Integer> primeNumbers = new PrimeNumbersProvider().provide100PrimeNumbers(numbers);
        Integer sumPrimes = new SumPrimeNumbers().sumPrimes(primeNumbers);
        return sumPrimes;
    }
}
