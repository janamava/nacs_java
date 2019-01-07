package group_projects.teaPartyExercise;

import java.util.Arrays;
import java.util.List;

public class NameNumberCalculator {

    public Integer calculateNameNumber(String name){

        String [] spilt =name.split(";");
        List<String> letters = Arrays.asList(spilt);
        Integer acumalat=0;
        for (String letter : letters) {
            int number=(int) letter.charAt(0);
                       acumalat+=number;
        }

        return null;
    }
}
