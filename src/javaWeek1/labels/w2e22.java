package javaWeek1.labels;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class w2e22 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> names = new ArrayList<>();
        names.add("Derek");
        names.add("Matilda");
        names.add("Hansel");

        List<String> rooms = new ArrayList<>();
        rooms.add("Living room");
        rooms.add("Studio");
        rooms.add("Bathroom");


        System.out.println("Please, give me a number");
        Integer number1 = scanner.nextInt();
        System.out.println("Please, give me a number");
        Integer number2 = scanner.nextInt();
        System.out.println("Please, give me a number");
        Integer number3 = scanner.nextInt();

        Integer indicator = number1 * number2 * number3 * 199;

        while (names.size() > 0) {
            int candidate = indicator % names.size();
            String person = names.get (candidate);
            String room = rooms.get(0);
            System.out.println(person + " gets the " + room);
            names.remove(candidate);
            rooms.remove(room);

            }
        }

    }


/*
Part 1

say(“Please, give me a number”)
Number number1 = listen()
say(“Please, give me a number”)
Number number2 = listen()
say(“Please, give me a number”)
Number number3 = listen()

Number number = number1 * number2 * number3 * 199
Number personNumber = number % 3

String person1 = names.get(personNumber)
names = names.remove(personNumber)
say(person1 + “ gets room “ + rooms.get(0) )
rooms.remove(0)

Part 2

personNumber = number % 2
String person2 = names.get(personNumber)
names = names.remove(personNumber)
say(person2 + “ gets room “ + rooms.get(0) )
rooms.remove(0)

Part 3

String person3 = names.get(0)
names = names.remove(0)
say(person3 + “ gets room “ + rooms.get(0) )
rooms.remove(0)
 */