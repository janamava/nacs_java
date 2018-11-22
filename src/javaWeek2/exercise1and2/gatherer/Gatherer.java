package javaWeek2.exercise1and2.gatherer;

import javaWeek2.exercise1and2.Hiker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gatherer {

    public Gatherer() {                 //I created a constructor for making a
                                        // gatherer object in other classes
    }

    public List<Hiker> signUp() {

        Scanner scanner = new Scanner(System.in);

        List<Hiker> hikers = new ArrayList<>();
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        while (!name.isEmpty()) {
            Hiker hiker = new Hiker(name);
            hikers.add(hiker);
            System.out.println("What is your name?");
            name = scanner.nextLine();
        }

        AutomaticGatherer automaticGatherer = new AutomaticGatherer();

        List<Hiker> extraHikers = automaticGatherer.getExtraHikers();

        hikers.addAll(extraHikers);

        return hikers;
    }

}
