package javaWeek_8.exercise1;

public class ExclamationDecryptor implements Decryptor{

    @Override
    public Boolean isValid(String encrypted) {
        return encrypted.contains("!");
    }

    @Override
    public String decrypt(String encrypted){
        return encrypted.replaceAll("!", "");
    }
}
