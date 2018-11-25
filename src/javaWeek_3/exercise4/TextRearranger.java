package javaWeek_3.exercise4;

public class TextRearranger {

    public String rearrange(String message) {
        message = replaceMathSymbols(message);
        message = replaceNumbers(message);
        message = replaceVowels(message);
        return message;
    }


    public String replaceVowels(String message) {
        message = message.replaceAll("4", "a");
        message = message.replaceAll("3", "e");
        message = message.replaceAll("1", "i");
        message = message.replaceAll("8", "o");
        message = message.replaceAll("9", "u");
        return message;
    }

    public String replaceNumbers(String message) {
        message = message.replaceAll("zero", "0");
        message = message.replaceAll("one", "1");
        message = message.replaceAll("two", "2");
        message = message.replaceAll("three", "3");
        message = message.replaceAll("four", "4");
        message = message.replaceAll("five", "5");
        message = message.replaceAll("six", "6");
        message = message.replaceAll("seven", "7");
        message = message.replaceAll("eight", "8");
        message = message.replaceAll("nine", "9");
        return message;
    }

    public String replaceMathSymbols(String message) {
        //message = message.replaceAll("\\+", "plus");
        message = message.replaceAll("plus", "[+]");
        message = message.replaceAll("minus", "-");
        message = message.replaceAll("multiply", "[*]");
        message = message.replaceAll("divide", "/");
        message = message.replaceAll("equals", "=");
        return message;
    }
}
