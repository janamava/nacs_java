package javaWeek_1.labels;

import java.util.Scanner;

public class w2e12 {

    public static void main(String[] args) {

        System.out.println("How much do you weigh?");
        Scanner scanner = new Scanner(System.in);
        Integer weight = scanner.nextInt();
        System.out.println("How much protein you will take?");
        Integer intake = scanner.nextInt();
        Integer amount = weight * intake;
        System.out.println("You should take " + amount + " grams.");
    }


}
 /*
Number proteinGrams = 1.2
Number weightInKilograms = 68
Number amountOfProteinGramsPerDay = weightInKilograms * proteinGrams
  */