package group_projects.romeEncryption;

import java.util.Arrays;
import java.util.List;

public class RomeEncryptorApplication {

    public static void main(String[] args) {

        String plaintext = "HELLO WORLD";
        String[] splitted = plaintext.split("");
        List<String> split= Arrays.asList(splitted);
        LetterChanger letterChanger =new LetterChanger();
        System.out.println(split);
        letterChanger.changeLetters(split,5);

    }
}
