package group_projects.teaPartyExercise;


import java.util.List;

public class NameNumberCalculatorApp {

    public static void main(String[] args) {
        ReadLines readLines = new ReadLines();

        List<Name> names = readLines.asList();
        for (Name name : names) {
            System.out.println(name);
        }
    }
}
