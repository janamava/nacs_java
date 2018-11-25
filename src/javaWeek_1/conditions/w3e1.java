package javaWeek_1.conditions;

import java.util.Scanner;

public class w3e1 {

    public static void main(String[] args) {

        if (isAtHome() && !isUsingOldTelephone()) {
            System.out.println("callWithOldTelephone");
        } else {
            System.out.println("callWithCellphone");
        }

    }

    private static Boolean isAtHome() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Are we at home?");
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }


    private static Boolean isUsingOldTelephone() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Grandma, are you using the old telephone?");
        String answer = scanner.nextLine();
        return answer.equals("yes");
    }


    }


/*Part C

if isAtHome() and not isUsingOldTelephone()
  callWithOldTelephone()
else
  callWithCellphone()


action isAtHome() returns Boolean
  say(“Are we at home?”)
  return listen()

Part B

action isUsingOldTelephone() returns Boolean
  say(“Grandma, are you using the old telephone?”)
  return listen()

 */

