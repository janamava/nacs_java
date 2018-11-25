package evaluations.week3.exercise1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NumberMirror {

    public String mirror (Integer number) {
        List<String> splittedOriginal = split(number);
        String mirrored = makeReversed(splittedOriginal);
        return mirrored;
    }

    public List<String> split(Integer number) {
        String original = number.toString();
        String[] splittedOriginal = original.split("");
        List<String> items = Arrays.asList(splittedOriginal);
        List<String> mutableItems = new ArrayList<>(items);
        return mutableItems;
    }

    public String makeReversed(List<String> items){
        Collections.reverse(items);
        String mirrored = "";

        for (String item : items) {
            mirrored += item;
        }
        return mirrored;
    }


}
/*
 List<String> immutableNumbers = Arrays.asList(split);
        List<String> mutableNumbers = new ArrayList<>(immutableNumbers);
The NumberMirror has the mirror method that receives a number and returns it written backwards.
make the number in string
split it
reverse the collection
make the reversed string empty
add collection items with for
 */