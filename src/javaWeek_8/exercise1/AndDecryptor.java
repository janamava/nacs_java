package javaWeek_8.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AndDecryptor implements Decryptor {

    @Override
    public Boolean isValid(String encrypted) {
        return encrypted.contains("&");
    }

    @Override
    public String decrypt(String encrypted) {
        String reversedTrick = "";
        String trick = encrypted.replaceAll("&", "");
        List<String> letters = Arrays.asList(trick.split(""));
        Collections.reverse(letters);
        for (String letter : letters) {
            reversedTrick += letter;
        }
        return reversedTrick;
    }
}
