package practice_folder;

import javaWeek_4.exercise5.Grocery;

import java.util.ArrayList;
import java.util.List;

public class Changer {

    public List<String> changeToString(List<Grocery> groceries) {

        List<String> groceryNames = new ArrayList<>();
        for (Grocery grocery : groceries) {
            String name = grocery.getName();
            groceryNames.add(name);
        }
        return groceryNames;
    }
}