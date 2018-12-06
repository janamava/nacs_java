package javaWeek_5.exercise4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Superheroes {

    private static List<Superhero> superheroes = Arrays.asList(new Batman(), new Spiderman(), new Superman());


    public static List<Superhero> getSuperheroes(){
        return superheroes;
    }

    public static List<String> getNames(){
        List<String> superheroNames = new ArrayList<>();
        for (Superhero superhero : superheroes) {
            superheroNames.add(superhero.getName());
        }
        return superheroNames;
    }
}
