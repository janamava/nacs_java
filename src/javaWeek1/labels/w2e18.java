package javaWeek1.labels;

import java.util.Scanner;

public class w2e18 {

    public static void main(String[] args) {
        System.out.println("Give me a word");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String transformedWord = formatToBracketsCI(word);
        System.out.println(transformedWord);
    }

        private static String formatToBracketsCI(String word) {
        Integer size = word.length();
        char firstLetter = word.charAt(0);
        firstLetter = Character.toUpperCase(firstLetter);
        char lastLetter = word.charAt(size-1);
        lastLetter = Character.toUpperCase(lastLetter);
        String middle = word.substring(1, size-1);
        middle = middle.toLowerCase();
        return firstLetter + middle + lastLetter;

    }

}
 /*
 action formatToBracketsCI(String word) returns String
    Number length = word.size()
    String firstLetter = word.get(0)
    firstLetter = firstLetter.upperCase()

    String lastLetter = word.get(length - 1)
    lastLetter = lastLetter.upperCase()

    String middle = word.section(1, length - 2)
    middle = middle.lowerCase()

    String transformedWord = firstLetter + middle + lastLetter
  return transformedWord
  */