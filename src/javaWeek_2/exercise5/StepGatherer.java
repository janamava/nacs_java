package javaWeek_2.exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StepGatherer {

    private List<Integer> steps;

    public List<Integer> askForSteps() {
        List<Integer> steps = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            System.out.println("How many steps did you make?");
            steps.add(scanner.nextInt());
            count++;
        }
        return steps;
    }

}
/*
The StepGatherer asks three times for the number of steps and returns a list with those three Integers.
 */