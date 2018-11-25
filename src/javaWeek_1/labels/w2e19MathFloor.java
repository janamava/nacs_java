package javaWeek_1.labels;

import java.util.Scanner;

public class w2e19MathFloor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our comic shop. How much is your comic?");
        Double price = scanner.nextDouble();
        System.out.println("How much are you going to pay?");
        Integer moneyPaid = scanner.nextInt();

        Double change = moneyPaid - price;
        double euro = Math.floor(change);
        double cent = (change * 100) % 100;
        cent = Math.floor(cent);
        System.out.println("Here you are, " + euro + " and " + cent + " cents.");
    }

}
/*
say(“Welcome to our comic shop. How much is your comic?”)
Number price = listen()
say(“How much are you going to pay?”)
Number moneyPaid = listen()

Number change = moneyPaid - price
Number euro = change.roundDown()
Number cent = (change * 100) % 100
say(“Here you are, ” + euro + “ and ” + cent + “ cents”)
 */