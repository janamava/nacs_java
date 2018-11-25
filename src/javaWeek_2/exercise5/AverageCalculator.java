package javaWeek_2.exercise5;

import java.util.List;

public class AverageCalculator {

    public Double sumAllSteps(List<Integer> steps){
        Double sumSteps = 0.0;
        for (Integer step : steps) {
            sumSteps += step;
        }
        return sumSteps;
    }

    public Double calculateAverage(List<Integer>steps) {
        Double sumSteps = sumAllSteps(steps);
        Double averageSteps = sumSteps/3;
        return averageSteps;
    }

}
/*
The AverageCalculator has a calculateAverage method
that receives a list of Integer and returns a Double that is the average.
 */