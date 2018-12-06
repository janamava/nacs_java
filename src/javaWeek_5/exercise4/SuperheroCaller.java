package javaWeek_5.exercise4;

import java.util.List;
import java.util.Random;

public class SuperheroCaller {

    private List<Superhero> superheroes = Superheroes.getSuperheroes();

    public Superhero call(){
        Integer position = new Random().nextInt(3);
        Superhero randomSuperhero = superheroes.get(position);
        return randomSuperhero;
    }
}
/*
Create the SuperheroCaller class that has a list with the three superheroes.
It has the call method that returns a random Superhero every time you use it.

 */