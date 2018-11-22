package javaWeek3.exercise4;

public class TextAlterator {

    public String alter(String message) {
        message = replaceVowels(message);
        message = replaceNumbers(message);
        message = replaceMathSymbols(message);
        message = removeExtraPunctuation(message);
        return message;
    }

    public String replaceNumbers(String message) {
        message = message.replaceAll("0", "zero");
        message = message.replaceAll("1", "one");
        message = message.replaceAll("2", "two");
        message = message.replaceAll("3", "three");
        message = message.replaceAll("4", "four");
        message = message.replaceAll("5", "five");
        message = message.replaceAll("6", "six");
        message = message.replaceAll("7", "seven");
        message = message.replaceAll("8", "eight");
        message = message.replaceAll("9", "nine");
        return message;
    }

    public String replaceVowels(String message) {
        message = message.replaceAll("[Aa]", "4");
        message = message.replaceAll("[Ee]", "3");
        message = message.replaceAll("[Ii]", "1");
        message = message.replaceAll("[Oo]", "8");
        message = message.replaceAll("[Uu]", "9");
        return message;
    }

    public String replaceMathSymbols(String message) {
        //message = message.replaceAll("\\+", "plus");
        message = message.replaceAll("[+]", "plus");
        message = message.replaceAll("-", "minus");
        message = message.replaceAll("[*]", "multiply");
        message = message.replaceAll("/", "divide");
        message = message.replaceAll("=", "equals");
        return message;
    }

    public String removeExtraPunctuation(String message) {
        message = message.replaceAll("[:;!?]", "" );
        return message;
    }
}


