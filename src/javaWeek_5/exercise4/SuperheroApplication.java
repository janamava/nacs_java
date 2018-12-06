package javaWeek_5.exercise4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {
        SuperheroCaller caller = new SuperheroCaller();
        Superhero randomHero = caller.call();
        System.out.println("Superhero: " + randomHero.getName());


        List<Superhero> superheroes = new ArrayList<>();
        int times = 0;
        while (times < 6){
            Superhero hero = caller.call();
            superheroes.add(hero);
            times = times + 1;
            System.out.println("Superhero " + times + ": " + hero.getName());
        }

        System.out.println("Number of superheroes: " + superheroes.size());

    }
}
/*
Create a SuperheroCaller and use it to call one superhero. Display its name.
Create a list of Superhero and add six superheroes by calling them with the SuperheroCaller.
Use a loop for this, please.
Display the superheroe names one by one with a loop by also showing the number of appearance.
Display the number of superheroes by using the list’s size.

Create the SuperheroCallerTest class to test the call method.
Make sure it never returns null and that the superhero names are either Batman, Superman or Spiderman.


Superhero: Superman
Superhero 1: Batman
Superhero 2: Batman
Superhero 3: Batman
Superhero 4: Spiderman
Superhero 5: Batman
Superhero 6: Spiderman
Number of superheroes: 6
 */