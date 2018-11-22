package javaWeek1.labels;

import java.util.Scanner;

public class w2e10 {

        public static void main(String[] args) {

        System.out.println("Give me the first number");
        Scanner scanner = new Scanner(System.in);
        Integer number1 = scanner.nextInt();
        Integer square = calculateSquare(number1);
        System.out.println("The result is " + square);

        System.out.println("Give me the second number");
        Integer number2 = scanner.nextInt();
        square = calculateSquare(number2);
        System.out.println("The result is " + square);


    }

    public static Integer calculateSquare(Integer number) {
        Integer square = number * number;
        return square;

    }

}

/*

Part B

say(“Give me the first number”)
Number number1 = listen()
Number squareResult = calculateSquare(number1)
say(“The result is ” + squareResult)

say(“Give me the second number”)
Number number2 = listen()
Number squareResult2 = calculateSquare(number2)
say(“The result is ” + squareResult)

Part A

action calculateSquare(Number number) returns Number
  Number square = number * number
  return square

 */