package javaWeek_7.exercise7;

import java.util.Scanner;

public class TransporterApplication {

    public static void main(String[] args) {

        Transporter transporter = new Transporter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many cars of type one?");
        Integer typeOne = scanner.nextInt();
        System.out.println("How many cars of type two?");
        Integer typeTwo = scanner.nextInt();
        System.out.println("How many celebrities are there?");
        Integer celebrities = scanner.nextInt();

        Integer seats = transporter.getSeats(typeOne, typeTwo);
        transporter.check(seats, celebrities);
    }
}
