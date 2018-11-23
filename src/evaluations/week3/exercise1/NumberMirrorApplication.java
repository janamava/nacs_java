package evaluations.week3.exercise1;

import evaluations.week3.exercise1.NumberMirror;

import java.util.Scanner;

public class NumberMirrorApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberMirror numberMirror = new NumberMirror();

        System.out.println("Please give me a number");
        Integer original = scanner.nextInt();
        String mirrored = numberMirror.mirror(original);
        System.out.println("Original version is " + original);
        System.out.println("Reversed version is " + mirrored);
    }
}
/*
In the NumberMirrorApplication class main method,
 ask the user for a number,
  create a NumberMirror,
   use it to find its mirror number and display both.

 */