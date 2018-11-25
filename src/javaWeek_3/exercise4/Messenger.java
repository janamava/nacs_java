package javaWeek_3.exercise4;

public class Messenger {

    public String send(String word) {
        Encryptor encryptor = new Encryptor();
        String encrypted = encryptor.encrypt(word);//many into one
        System.out.println(encrypted);
        return encrypted;
    }

    public void receive(String word) {
        Decryptor decryptor = new Decryptor();
        String decrypted = decryptor.decrypt(word);//many into one
        System.out.println(decrypted);
    }
}
/*
The Messenger has an encryptor and a decryptor as attributes.
It has the send method that receives a String,
encrypts it
and displays the encrypted message.
It has the receive method that receives a String,
decrypts it and displays the decrypted message.
 */
