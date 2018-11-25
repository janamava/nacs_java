package javaWeek_2.exercise5;

public class AverageDistanceCalculator {

    public Double calculateDistance(Double averageSteps){
        Step step = new Step();

        Double averageDistance = averageSteps * step.getStep();
        return averageDistance;
    }
}
/*
The AverageDistanceCalculator has a calculateDistance method that receives
a number of steps as Double and returns the distance in kilometers as Double.
 */