package javaWeek_1.conditions;

import java.util.Scanner;

public class w3e2 {

    public static void main(String[] args) {


    }

    public static Boolean hasClicked() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Did something click?");
        String answer = scanner.nextLine();
        return answer.equals("yes");

    }

    public static Boolean isAdult() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How old are you?");
        Integer age = scanner.nextInt();
        return age.equals(age >= 18);

    }
}

    /*public  static isValid() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your name");
        String name = scanner.nextLine();

        }
    }
}
/*

Part A

action hasClicked() returns Boolean
  say(“Did something click?”)
  return listen()

Part B

action isAdult() returns Boolean
  say(“How old are you?”)
  Number age = listen()
  return age >= 18

Part C

action isValid(String name) returns Boolean
  return name.size() >= 3

Part D

if not hasClicked()
  apologizeAndEnd()
load()
if not isAdult()
  apologizeAndEnd()
load()
say(“Please, write your name:”)
String name = listen()
if not isValid(name)
  apologizeAndEnd()
load()
signUp(name)
say(“You’re signed up! Thank you.”)
 */