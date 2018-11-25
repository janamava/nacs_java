package javaWeek_1.labels;

import java.util.Scanner;

public class w2e6 {

           public static void main(String[] args) {
            System.out.println("Tell me your first number");

            Scanner scanner = new Scanner(System.in);
            Integer number1 = scanner.nextInt();

            System.out.println("Tell me your second number");
            Integer number2 = scanner.nextInt();

            Integer sum = number1 + number2;

            System.out.println("The sum is " + sum );
        }
    }


/*
say(“Tell me your first number”)
Number number1 = listen()
say(“Tell me your second number”)
Number number2 = listen()
Number sum = number1 + number2
say(“The sum is: ” + sum)
 */

