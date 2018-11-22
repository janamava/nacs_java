package javaWeek1.labels;

import java.util.Scanner;

public class w2e16 {

    public static void main(String[] args) {

        System.out.println("Hello! What’s your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Please, tell me your order number.");
        Integer orderNumber = scanner.nextInt();
        Integer result = orderNumber % 3;
        Integer price = result * 4;
        System.out.println("Here you are, " + name + " It's " + price + " Euro.");
    }



}
 /*
say(“Hello! What’s your name?”)
String name = listen()
say(“Please, tell me your order number.”)
Number orderNumber = listen()
Number result = orderNumber % 3
Number price = result * 4
say(“Here you are, ” + name + “ It’s ” + price + “ Euro.”)
*/