package javaWeek1.labels;

import java.util.Scanner;

public class w2e20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Woof food do I get today!?");
        Integer food = scanner.nextInt();
        int jumpTimes = 6 * food;
        int barkTimes = 1 + food;
        System.out.println("(Jumps " + jumpTimes + " times and barks " + barkTimes + " times.)");
    }
}
/*

say(“Woof food do I get today!?”)
Number food = listen()
Number jumpTimes = 6 * food
Number barkTimes = 1 + food
say(“(Jumps “ + jumpTimes + ” times and barks “ + barkTimes + ” times)”)

 */