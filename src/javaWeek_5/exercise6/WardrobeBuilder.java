package javaWeek_5.exercise6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WardrobeBuilder {

    private List<Step> steps = new ArrayList<>();


    public List<Step> getSteps() { //returns list steps to construct a wardrobe
        addOneStep(new AddBottom(), 1);
        addOneStep(new AddSide(), 2);
        addOneStep(new AddBack(), 1);
        addOneStep(new AddTop(), 1);
        addOneStep(new AddShelf(), 8);
        addOneStep(new AddDoor(), 2);
        return steps;
    }

    private void addOneStep(Step step, Integer times) { //how to add one step to the list steps
        for (int time = 0; time < times; time++) {
            steps.add(step);
        }
    }

    public Wardrobe build() { //constructs a wardrobe
        Wardrobe wardrobe = new Wardrobe();
        List<Step> steps = getSteps();
        for (Step step : steps) {
            step.perform(wardrobe);
        }
        return wardrobe;
    }

}
/*
Create the WardrobeBuilder class that has a list of all the Steps it has to follow to build a wardrobe.
It has the build method.
It creates an empty Wardrobe and applies all the steps one by one to it until it’s finished
and then it returns it.
A Wardrobe needs the following to be completed:
one bottom, two sides, one back, one top, eight shelves and two doors.

 */