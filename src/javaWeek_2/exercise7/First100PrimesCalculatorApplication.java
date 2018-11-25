package javaWeek_2.exercise7;

public class First100PrimesCalculatorApplication {

    public static void main(String[] args) {

        Integer sumPrimes = new First100PrimesCalculator().getSumOfThe100FirstPrimeNumbers();
        System.out.println("Sum of the prime numbers is " + sumPrimes);


    }
}
