package javaWeek_8.exercise1;

import java.util.Arrays;
import java.util.List;

public class Decryptors {

    public static List<Decryptor> asList(){
        return Arrays.asList(new ExclamationDecryptor(), new AndDecryptor(), new HashDecryptor());
    }
}
