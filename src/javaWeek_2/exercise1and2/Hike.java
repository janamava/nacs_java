package javaWeek_2.exercise1and2;

import javaWeek_2.exercise1and2.gatherer.Gatherer;

import java.util.List;

public class Hike {

    private List<Hiker> hikers;

    public Hike() { //constructor tool
    }

    public void signUp() {
        Gatherer gatherer = new Gatherer();     //this is an object we created with the help of a
                                                // constructor ex2Gatherer.
                                                // It has all the characteristics of the class
                                                // ex2Gatherer and can do
                                                //all the ex2Gatherer actions by
                                                // gatherer.signUp() that results in a collection
        hikers = gatherer.signUp();
    }
    public void showHikers() {
        System.out.println("Following people are going hiking:");
        for (Hiker hiker: hikers) {
            System.out.println(hiker.getName());

        }
    }
}
