package javaWeek_6.exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LuhnsAlgorithmValidator {

    public Boolean isValid(Long cardNumber) {
        Integer number = getNumber(cardNumber);
        if(number % 10 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public Integer getNumber(Long cardNumber) {

        List<Integer> numbers = getNumbers(cardNumber);
        List<Integer> evenNumbers = getEvenNumbers(numbers);
        List<Integer> multipliedEvenNumbers = multiplyEven(evenNumbers);
        Integer sumEven = sumEvenNumbers(multipliedEvenNumbers);
        List<Integer> oddNumbers = getOddNumbers(numbers);
        Integer sumOdd = sumOddNumbers(oddNumbers);
        Integer sum = getBothSum(sumEven, sumOdd);
        return sum;
    }


    public List<Integer> getNumbers(Long cardNumber) {

        List<Integer> numbers = new ArrayList<>();
        String numberToString = cardNumber.toString();
        String[] splittedChars = numberToString.split("");
        List<String> splitted = Arrays.asList(splittedChars);
        for (String string : splitted) {
            Integer number = Integer.parseInt(string);
            numbers.add(number);
        }
        return numbers;
    }

    public List<Integer> getEvenNumbers(List<Integer> numbers) {

        List<Integer> evenNumbers = new ArrayList<>();
        for (int position = 1; position < numbers.size(); position += 2) {
            Integer oddNumber = numbers.get(position);
            evenNumbers.add(oddNumber);
        }
        return evenNumbers;
    }

    public List<Integer> multiplyEven(List<Integer> evenNumbers) {

        List<Integer> multipliedEvenNumbers = new ArrayList<>();
        for (Integer evenNumber : evenNumbers) {
            Integer multipliedOdd = evenNumber * 2;
            multipliedEvenNumbers.add(multipliedOdd);
        }
        return multipliedEvenNumbers;
    }

    public Integer sumEvenNumbers(List<Integer> multipliedEvenNumbers) {

        String concatenated = integersToString(multipliedEvenNumbers);
        List<String> splitted = Arrays.asList(concatenated.split(""));
        List<Integer> integers = stringsToIntegers(splitted);
        Integer sum = 0;
        for (Integer integer : integers) {
            sum = sum + integer;
        }
        return sum;

    }

    public String integersToString(List<Integer> integers){

        String concatenated = "";
        for (Integer integer : integers) {
            String string = integer.toString();
            concatenated += string;
        }
        return concatenated;
    }

    public List<Integer> stringsToIntegers(List<String> strings){

        List<Integer> integers = new ArrayList<>();
        for (String string : strings) {
            Integer number = Integer.parseInt(string);
            integers.add(number);
        }
        return integers;
    }

    public List<Integer> getOddNumbers(List<Integer> numbers) {

        List<Integer> oddNumbers = new ArrayList<>();
        for (int position = 0; position < numbers.size(); position += 2) {
            Integer evenNumber = numbers.get(position);
            oddNumbers.add(evenNumber);
        }
        return oddNumbers;
    }

    public Integer sumOddNumbers(List<Integer> oddNumbers) {

        Integer sum = 0;
        for (Integer oddNumber : oddNumbers) {
            sum = sum + oddNumber;
        }
        return sum;
    }

    public Integer getBothSum(Integer sumEven, Integer sumOdd) {

        Integer sum = sumEven + sumOdd;
        return sum;
    }
}
