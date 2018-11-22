package javaWeek2.exercise1and2.gatherer;

import javaWeek2.exercise1and2.Hiker;

import java.util.ArrayList;
import java.util.List;

public class AutomaticGatherer {

    List<Hiker> getExtraHikers() {

        List extraHikers = new ArrayList();

        Hiker hiker1 = new Hiker("Arthur");
        Hiker hiker2 = new Hiker("Fransin");
        Hiker hiker3= new Hiker("Buster");
        Hiker hiker4 = new Hiker ("Muffy");
        Hiker hiker5 = new Hiker ("Brain");

        extraHikers.add(hiker1);
        extraHikers.add(hiker2);
        extraHikers.add(hiker3);
        extraHikers.add(hiker4);
        extraHikers.add(hiker5);

        return extraHikers;
    }
}
