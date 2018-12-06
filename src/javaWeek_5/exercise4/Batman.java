package javaWeek_5.exercise4;

import javaWeek_5.exercise5.Joker;
import javaWeek_5.exercise5.Villain;

public class Batman implements Superhero {

    @Override
    public String getName() {
        return "Batman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(new Batman().getName());
    }
}