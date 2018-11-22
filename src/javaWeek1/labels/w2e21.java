package javaWeek1.labels;

import java.util.Scanner;

public class w2e21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the last episode number you watched?");
        Integer episode = scanner.nextInt();
        Double season2 = (episode % 12) * Math.floor(episode / 12) + (12 * Math.floor(episode / 24));

        Double season1 = episode - season2;
        Double season2Minutes = season2 * 34;
        Double season1Minutes = season1 * 47;
        Double totalMinutes = season1Minutes + season2Minutes;

        Double hours = Math.floor(totalMinutes / 60);
        Double minutes = totalMinutes % 60;
        String message = "You have watched a total of ";
        message =  message + hours + " hours and " + minutes + " minutes (";
        message = message + totalMinutes + ")";
        System.out.println(message);

    }
}


/*
say(“What is the last episode number you watched?”)
Number episode = listen()

Number season2 =
(episode % 12) * (episode / 12).roundDown() + (12 * ( episode / 24).roundDown())

Number season1 = episode - season2
Number season2minutes = season2 * 34
Number season1minutes = season1 * 47
Number totalMinutes = season1minutes + season2minutes

Number hours = totalMinutes / 60
hours = hours.roundDown()
Number minutes = totalMinutes % 60

String message = “You have watched a total of “
message = message + hours + “hours and “ + minutes + “ minutes (”
message = message + totalMinutes + “)”
say(message)
 */