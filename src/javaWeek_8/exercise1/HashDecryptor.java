package javaWeek_8.exercise1;


public class HashDecryptor implements Decryptor {

    @Override
    public Boolean isValid(String encrypted) {
        return encrypted.contains("#");
    }

    @Override
    public String decrypt(String encrypted) {
        String decrypted = encrypted.replaceAll("#", "");
        return decrypted.replaceAll("robomime", "");
    }
}
