package javaWeek_2.simplerExercises.exercise5;

import javaWeek_2.simplerExercises.exercise1.Article;

public class Editor {

    public Magazine writeMagazin(){

        Magazine magazine = new Magazine("Universe");


        Article articleOne = new Article("Moon", "This is a moon text");
        Article articleTwo = new Article("Sun", "This is a sun text");
        Article articleThree = new Article("Planet", "This is a planet text");

        magazine.add(articleOne);
        magazine.add(articleTwo);
        magazine.add(articleThree);
        return magazine;
     }
}


/*
An Editor has no attributes.

It has the writeMagazine method that returns a Magazine.

In order to create a Magazine it creates first three Articles,

it adds them to the Magazine and then it returns it.
 */