package evaluations.week3.exercise2;

import evaluations.week3.exercise1.NumberMirror;

import java.util.Arrays;
import java.util.List;

public class SpecialMirror {

    public Integer specialMirror(Integer number) {

        NumberMirror numberMirror = new NumberMirror();

        List<String> splitedItems = numberMirror.split(number);
        List<String> added = addOne(splitedItems);
        numberMirror.makeReversed(List <String>added);

    }

    public List<String> addOne(List<String> splittedItems){

        List<String> numbers = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        String specialMirrorVersion = "";

        return specialMirrorVersion;

    }
}
/*

split them
add one
write backwards


Add the specialMirror method to the NumberMirror class
 that receives a number and returns the special mirror version of it.

 create a collection of numbers
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



 */