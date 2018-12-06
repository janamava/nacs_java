package javaWeek_5.exercise4;

import javaWeek_5.exercise5.Villain;

public class Superman implements Superhero {

    @Override
    public String getName() {
        return "Superman";
    }

    @Override
    public void fight(Villain villain) {
        villain.weaken(new Superman().getName());
    }
}
