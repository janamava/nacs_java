package javaWeek_2.exercise5;


import java.util.List;

public class PedometerApplication {

    public static void main(String[] args) {

        StepGatherer stepGatherer = new StepGatherer();
        AverageCalculator averageCalculator = new AverageCalculator();
        AverageDistanceCalculator averageDistanceCalculator = new AverageDistanceCalculator();

        List<Integer> allSteps = stepGatherer.askForSteps();
        Double averageAllSteps = averageCalculator.calculateAverage(allSteps);
        long averageSteps = Math.round(averageAllSteps);
        Double averageAllDistance = averageDistanceCalculator.calculateDistance(averageAllSteps);
        long averageDistance = Math.round(averageAllDistance);

        System.out.println("Average of all steps is " + averageSteps);
        System.out.println("Average distance is " + averageDistance + " km.");
    }
}
/*
The PedometerApplication has the main method and uses the other classes.
 */