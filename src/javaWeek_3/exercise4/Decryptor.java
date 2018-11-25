package javaWeek_3.exercise4;

public class Decryptor {

    TextRearranger textRearranger = new TextRearranger();

    public String removeRubbishSymbols(String encryptedMessage){
        String message = encryptedMessage.replaceAll("[!@#$%&+\\-=\"]", "");
        return message;
    }

    public String decrypt(String encryptedMessage) {
        String message = removeRubbishSymbols(encryptedMessage);
        message = textRearranger.rearrange(message);
        return message;
    }

}
/*
The Decryptor has no attributes.
It has the decrypt method that receives a String
and returns the decrypted version of it.
 */