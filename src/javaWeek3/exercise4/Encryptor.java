package javaWeek3.exercise4;

import java.util.*;

public class Encryptor {

    public String encrypt(String message) {

        TextAlterator textAlterator = new TextAlterator();

        message = textAlterator.alter(message);
        message = addRubbishSymbols(message);
        return message;
    }

    public String addRubbishSymbols(String message) {

        String[] elements = message.split("");
        List<String> letters = Arrays.asList(elements);


        String encryptedMessage = "";

        for (String letter : letters) {
            encryptedMessage += letter;
            String rubbishChunk = makeRubbishChunk();
            encryptedMessage += rubbishChunk;
        }
        return encryptedMessage;
    }

    public String makeRubbishChunk() {

        List<String> rubbishCharacters = Arrays.asList("!", "@", "#", "$", "%", "&", "+", "-", "=");
        Random random = new Random();
        String rubbishChunk = "";
        int randomTimes = random.nextInt(5) + 1;
        Collections.shuffle(rubbishCharacters);

        for (int position = 0; position <= randomTimes; position++) {
            rubbishChunk += rubbishCharacters.get(position);
        }
        return rubbishChunk;
    }

}

/*
The Encryptor class has no attributes.
It has the encrypt method that receives a String
and returns the encrypted version of it.
 */