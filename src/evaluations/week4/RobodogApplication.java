package evaluations.week4;

import javaWeek_4.exercise9.FileReader;

import java.util.*;

public class RobodogApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();

        List<String> lines = reader.asLines("evaluations/week4/robodog.txt");
        List<String> instructions = decryptAll(lines);

        Set<String> uniqueInstructions = new HashSet<>(instructions);

        Integer numberOfUniqueInstructions = uniqueInstructions.size();
        System.out.println("Number of unique instructions: " + numberOfUniqueInstructions);

        System.out.println("Commands: " + uniqueInstructions);

        Map<String, Integer> moves = count(lines);
        System.out.println("Frequency: " + moves.values());

    }

    public static String decryptOneLine(String line) {
       String word = line.replaceAll("!", "").trim();
       return word;
    }

    public static List<String> decryptAll(List<String> lines) {
        List<String> words = new ArrayList<>();
        for (String line : lines) {
            String word = decryptOneLine(line);
            words.add(word);
        }
        return words;
    }


    public static Map<String, Integer> count(List<String> instructions) {

        Map<String, Integer> moves = new HashMap<>();
        Integer numberBarks = 0;
        Integer numberMoveRight = 0;
        Integer numberStepBackwards = 0;
        Integer numberMoveLeft = 0;
        Integer numberStepForward = 0;

        for (String line : instructions) {
        if(line.contains("bark")){
            numberBarks++;
            moves.put("bark", numberBarks);
        }
        else if (line.contains("move right")){
                numberMoveRight++;
            moves.put("move right", numberMoveRight);
        }
        else if (line.contains("step backwards")){
            numberStepBackwards++;
            moves.put("step backwards", numberStepBackwards);
        }
        else if (line.contains("move left")){
            numberMoveLeft++;
            moves.put("move left", numberMoveLeft);
        }
        else if (line.contains("step forward")){
            numberStepForward++;
            moves.put("step forward", numberStepForward);
        }

        }
        return moves;
    }

}
/*
Maps and Collections.sort(entries, Comparator.comparing(Map.Entry::getValue)) will be very useful.
Keep it simple stupid. Don’t overdo things, just stick to what the exercise asks for.


Number of unique instructions: 5
Commands: [bark, move right, step backwards, move left, step forward]
Frequency: {step forward=14, move left=5, bark=8, move right=13, step backwards=10}
Most used command: step forward | 14 times

 */