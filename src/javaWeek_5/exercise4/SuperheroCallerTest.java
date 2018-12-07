package javaWeek_5.exercise4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.List;


class SuperheroCallerTest {

    private SuperheroCaller caller = new SuperheroCaller();
    private List<String> superheroNames = Superheroes.getNames();

    @Test
    void call() {
        String superheroName = caller.call().getName();
        Assertions.assertTrue(isContained(superheroName));

    }

    private boolean isContained(String superheroName) {
        return (superheroNames.contains(superheroName));

    }

    @Test
    void notNull(){
        Superhero superhero = caller.call();
        Assertions.assertNotNull(superhero);
    }


}


/*
Create the SuperheroCallerTest class to test the call method.
Make sure it never returns null and that the superhero names are either Batman, Superman or Spiderman.

 */