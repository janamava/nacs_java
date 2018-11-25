package javaWeek_2.exercise7;

import java.util.List;

public class SumPrimeNumbers {

    Integer sumPrimes(List<Integer> primes) {
        Integer sum = 0;
        for (Integer prime : primes) {
            sum = sum + prime;
        }
        return sum;
    }

}
