package javaWeek_2.exercise7;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersProvider {

    List<Integer> provide100PrimeNumbers(List<Integer> list550Integers) {

        List<Integer> first100PrimeNumbers = new ArrayList<>();

        for (Integer number : list550Integers) {
            if (isPrime(number)) {
                first100PrimeNumbers.add(number);
            }
            if (first100PrimeNumbers.size() == 100) {
                System.out.println(first100PrimeNumbers);
                return first100PrimeNumbers;
            }

        }
        System.out.println("Did not reach 100 prime numbers.");
        return first100PrimeNumbers;
    }

    Boolean isPrime(Integer number) {
        if (number == 1) {
            return true;
        }
        if (number == 2) {
            return true;
        }
        for (int modulator = 2; modulator < number; modulator++) {
            if (number % modulator == 0) {
                return false;
            }
        }
        return true;
    }
}

/*
public Set<Integer> generatePrimes() {
    HashSet<Integer> result = new HashSet<Integer>();
    Random random = new Random();
    while (result.size() < 100) {
        int candidate = random.nextInt(1000);
        if (!result.contains(candidate) && isPrime(candidate)) {
            result.add(candidate);
        }
    }
    return result;
}

private boolean isPrime(int candidate) {
    // determine whether candidate is a prime number
}
*/