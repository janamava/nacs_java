package javaWeek_8.example;

public class FI {

    public static void main(String[] args) {

        Shouter shouter = sentence -> sentence.toUpperCase() + "!";
        String sentence = "We are developers";
        System.out.println(shouter.shout(sentence));

        shouter = sentence1 -> sentence + "!";
        System.out.println(shouter.shout(sentence));
    }

    public String shout(String sentence) {
        return sentence.toUpperCase() + "!";
    }

}
