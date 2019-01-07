package javaWeek_8.exercise1;

import java.util.ArrayList;
import java.util.List;

public class Sensor {

    public String decryptOneLine(String encrypted){
        List<Decryptor> decryptors = Decryptors.asList();
        String decryptedString = "";

        for (Decryptor decryptor : decryptors) {
            if(decryptor.isValid(encrypted)){
                decryptedString = decryptor.decrypt(encrypted);
            }
        }
        return decryptedString;
    }

    public List<String> decryptManyLines(List<String> lines){

        List<String> decryptedLines = new ArrayList<>();
        for (String line : lines) {
            String decryptedLine = decryptOneLine(line);
            decryptedLines.add(decryptedLine);
        }
        return decryptedLines;
    }
}


