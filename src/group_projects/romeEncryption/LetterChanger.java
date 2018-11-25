package group_projects.romeEncryption;

import java.util.*;

public class LetterChanger {

    public void changeLetters(List<String> split, Integer key){

        List<String> original = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R","S", "T", "U", "V", "W", "X", "Y", "Z"," ");

        List<String> rotated = new ArrayList<>(original);

        System.out.println(original);

        Collections.rotate(rotated, key);

        System.out.println(rotated);

        String ciferText = "";

        for (String element:split
             ) {

            Integer newElement = original.indexOf(element);
            String newAlphabet=rotated.get(newElement);
            ciferText = ciferText.concat(newAlphabet);
        }

        System.out.println("ciphertext is: "+ciferText);



    }



    }

