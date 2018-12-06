package javaWeek_5.exercise4;

import javaWeek_5.exercise5.Villain;

public class Spiderman implements Superhero{

    @Override
    public String getName() {
        return "Spiderman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(new Spiderman().getName());

    }
}
